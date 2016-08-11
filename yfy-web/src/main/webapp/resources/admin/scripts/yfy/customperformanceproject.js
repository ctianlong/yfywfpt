$(function(){
	//默认加载函数
	lion.web.AppInit();
	
	var projectdg = $('#sys_customperformanceproject_tb'); //datagrids
	var addForm = $('#addForm');  //编辑或添加表单
	var addDialog = $('#basic'); //编辑或添加对话框
	var queryForm=$('#queryform');
	//验证表单
	handleVForm(addForm,submitForm);
	
	//查询
	$('#btnQuery').click(function(){
	projectdg.datagrids({querydata:queryForm.serializeObject()});
	projectdg.datagrids('reload');
	});
	//刷新
	$('#btnRefresh').click(function(){  
	    projectdg.datagrids('reload');
	});
	
	$('#btnRefresh').click();
	
	//添加
	$('#btnAdd').click(function(){
		addForm.reset();
	    addDialog.find('.modal-header h4 span').text('添加自定义绩效项目');
	});
	 //编辑
    $('#btnEdit').click(function(){
        var row=projectdg.datagrids('getSelected');
	    if(!row){
	       lion.util.info('提示','请选择要编辑记录');
	       return;
	    }
	    addForm.reset();
	    addDialog.find('.modal-header h4 span').text('编辑自定义绩效项目');
	    addDialog.modal('toggle');
	    addForm.fill(row);
//	    var $radio = $(":radio[name='dataType']");
//	    var dataTypeVal = row.dataType;
//	    $radio.val(["0"]);
	    $('#dataType').combo('val',[row.dataType]);
    });
	//保存
	$('#btnSave').click(function(){
	 addForm.submit();
	});
	/**新增或编辑的提交代码*/
	function submitForm(frm){
	  var param=frm.serialize(),id=($('#id').val());
	  //ID为空时，为添加动作
	  if(lion.util.isEmpty(id)){
	      lion.web.post({url:'add.json',data:param,success:successAddFrm});
	  }else{
	      lion.web.post({url:'edit.json',data:param,success:successEditFrm});
	  }
	}
	//删除
	$('#btnDelete').on('click',function(){
	 var row=projectdg.datagrids('getSelected');
	 lion.web.deletefn({
	   url:'delete.json',
	   data:row,
	   unselectedmsg:'请选择要删除记录',
	   confirmmsg:'确认要删除此记录？',
	   success:successForDelete,
	 });
	});
	//添加成功的函数
	 function successAddFrm(result,args){
	   lion.web.parsedata({
	     data:result,
	     success:function(){
	       addDialog.modal('toggle');
	       projectdg.datagrids('reload');
	     },
	     msg:'添加项目未成功'
	   });
	 }
	//编辑成功的函数
	 function successEditFrm(result,args){
	   lion.web.parsedata({
	     data:result,
	     success:function(){
	         addDialog.modal('toggle');
	         projectdg.datagrids('reload');
	     },
	     msg:'编辑项目未成功'
	   });
	}
	//导出Excel
	$('#btnExport').on('click',function(){
		var params=queryForm.serialize(), dgtableId=projectdg.attr('id');
	    lion.web.exportfn({url:'export.json',data:params,tableId:dgtableId});
	    return;
	});
	//删除成功
	function successForDelete(data,arg){
	   if(data!==null&&!(data.hasError)){
	      lion.util.success('提示',data.message);
	      projectdg.datagrids('reload');
	   }else if(data!==null&&data.hasError){
	      var gmsg='';
	      for(var msg in data.errorMessage){
	        gmsg+=data.errorMessage[msg];
	      }
	      if(lion.util.isEmpty(gmsg)){
	        gmsg='未删除成功';
	      }
	      lion.util.error('提示',gmsg);
	  }
	}
	
});
//测试选择中checkbox
function formatterCheckBox(data,type,full){
	return data;
}
//判断是否编辑
function formatterEidtable(data,type,full) {
  var name =$.lion.lang.editable.n;
  if (data) {
    name = $.lion.lang.editable.y;
  }
  return name;
}

//function formatterDataType(data,type,full) {
//	if (data) {
//		return '自动获取';
//	}
//	return '手工获取';
//}


function formatterDataType(data,type,full) {
  var codelist = $('#dataType').combo('getData');
//  alert($(codelist).length);
//  alert("123");
  var nameZh = "请刷新...";
  for (var obj in codelist){
    if (codelist[obj].codeValue == data) {
      nameZh = codelist[obj].nameZh;
      break;
    }
  }
  return nameZh;
}

//验证表单
handleVForm=function(vForm,submitCallBackfn){
  var addError = $('.alert-danger', vForm);
  var addSuccess = $('.alert-success',vForm);
  var context=lion.util.context;
  var checkProjectCodeUrl=context+'/baseinfo/customperformanceproject/checkprojectcode.json';
  var checkProjectNameUrl=context+'/baseinfo/customperformanceproject/checkprojectname.json';
  vForm.validate({
        errorElement: 'span',
        errorClass: 'help-block help-block-error', 
        focusInvalid: false, 
        onkeyup:false,
        ignore: '', 
        messages: {
        	projectCode:{
        		required:'请输入项目代码',
        		rangelength:jQuery.validator.format('长度为{0}和{1}字符之间'),
        		remote:'该项目代码已存在'
        	},
        	projectName:{
	            required:'请输入项目名称',
	            rangelength:jQuery.validator.format('长度为{0}和{1}字符之间'),
	            remote:'该项目名称已存在'
        	},
        	dataType:{required:'请选择数据类型'}
        },
        rules: {
        	projectCode: {
                required:true,
                rangelength:[1,30],
                remote:{
                	url:checkProjectCodeUrl, //后台处理程序
                    type: 'post',               //数据发送方式
                    dataType: 'json',           //接受数据格式   
                    data: {                     //要传递的数据
                       projectCode: function() {
                        return $('#projectCode').val();
                       },
                       id:function(){
                         var id=($('#id').val());
                         if(lion.util.isNotEmpty(id)){
                           return id;
                         }
                         return '';
                       }
                    }
                }
            },
            projectName:{
            	required:true,
                rangelength:[1,30],
                remote:{
                    url:checkProjectNameUrl, //后台处理程序
                    type: 'post',               //数据发送方式
                    dataType: 'json',           //接受数据格式   
                    data: {                     //要传递的数据
                       projectName: function() {
                        return $('#projectName').val();
                       },
                       id:function(){
                         var id=($('#id').val());
                         if(lion.util.isNotEmpty(id)){
                           return id;
                         }
                         return '';
                       }
                    }
             }
            },
            dataType:{required:true}
        },
        invalidHandler: function (event, validator) {             
            addSuccess.hide();
            addError.show();
            Metronic.scrollTo(addError, -200);
        },

        highlight: function (element) {
            $(element).closest('.form-group').addClass('has-error'); 
        },

        unhighlight: function (element) {
            $(element).closest('.form-group').removeClass('has-error'); 
        },
        success: function (label) {
            label.closest('.form-group').removeClass('has-error'); 
        },
        errorPlacement:function(error,element){
        	error.insertAfter(element);
          //当遇到combo的对话框架的时，修改它的显示位置
//          if (element.hasClass('lion-combo')){           
//            error.insertAfter(element.parent().find('div.btn-group'));
//          }else{
//            error.insertAfter(element);
//          }
        },
        submitHandler: function (form) {
            addSuccess.show();
            addError.hide();
            submitCallBackfn(vForm);
        }
    });
};

