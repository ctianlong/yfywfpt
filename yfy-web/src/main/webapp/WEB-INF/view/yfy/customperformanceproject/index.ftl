<#assign base = request.contextPath/>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<title> <@spring.message "sys.customperformanceproject.html.title"/></title>

<link href="${base}/resources/global/plugins/ztree/css/metro.css" rel="stylesheet" type="text/css"/>
<link href="${base}/resources/global/plugins/bootstrap-select/bootstrap-select.min.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/global/plugins/bootstrap-toastr/toastr.css" rel="stylesheet" type="text/css">
<!--DataTable css Start-->
<link rel="stylesheet" type="text/css" href="${base}/resources/global/plugins/select2/select2.css"/>
<link rel="stylesheet" type="text/css" href="${base}/resources/global/plugins/datatables/extensions/Scroller/css/dataTables.scroller.min.css"/>
<link rel="stylesheet" type="text/css" href="${base}/resources/global/plugins/datatables/extensions/ColReorder/css/dataTables.colReorder.min.css"/>
<link rel="stylesheet" type="text/css" href="${base}/resources/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.css"/>
<!--DataTable css End-->
<link href="${base}/resources/global/plugins/bootstrap-select/bootstrap-select.min.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/global/css/lion.css" rel="stylesheet" type="text/css" />
<link href="${base}/resources/global/css/combotree/combotree.css" rel="stylesheet" type="text/css" />
<!-- DataTables js Start -->
<script type="text/javascript" src="${base}/resources/global/plugins/select2/select2.min.js"></script>
<script type="text/javascript" src="${base}/resources/global/plugins/datatables/media/js/jquery.dataTables.js"></script>
<script type="text/javascript" src="${base}/resources/global/plugins/datatables/extensions/TableTools/js/dataTables.tableTools.js"></script>
<script type="text/javascript" src="${base}/resources/global/plugins/datatables/extensions/ColReorder/js/dataTables.colReorder.js"></script>
<script type="text/javascript" src="${base}/resources/global/plugins/datatables/extensions/Scroller/js/dataTables.scroller.js"></script>
<script type="text/javascript" src="${base}/resources/global/plugins/datatables/plugins/bootstrap/dataTables.bootstrap.js"></script>
<!-- DataTables js End -->
<script src="${base}/resources/global/plugins/bootbox/bootbox.min.js" type="text/javascript"></script>
<script src="${base}/resources/global/plugins/bootstrap-toastr/toastr.min.js"></script>
<script src="${base}/resources/admin/pages/scripts/ui-toastr.js"></script>
<script src="${base}/resources/global/plugins/jquery-validation/js/jquery.validate.min.js" type="text/javascript"></script>
<!--lion UI JS Start-->
<script src="${base}/resources/global/js/lion.js" type="text/javascript"></script>
<script src="${base}/resources/global/js/form/form.fill.js" type="text/javascript"></script>
<script src="${base}/resources/global/js/local/lion-lang-zh_CN.js" type="text/javascript"></script>
<script src="${base}/resources/global/js/combotree/combotree.js" type="text/javascript"></script>
<script src="${base}/resources/global/js/datagrid/datagrids.js" type="text/javascript"></script>
<script src="${base}/resources/global/js/combo/combonew.js" type="text/javascript"></script>
<!--ztree js-->
<script src="${base}/resources/global/plugins/ztree/js/jquery.ztree.all-3.5.min.js" type="text/javascript"></script>
<!--lang-->
<script src="${base}/resources/admin/scripts/admin-common.js" type="text/javascript"></script>

<!-- tasks -->
<script src="${base}/resources/admin/scripts/yfy/customperformanceproject.js" type="text/javascript"></script>
</head>
<body class="page-header-fixed page-sidebar-closed-hide-logo page-sidebar-closed-hide-logo">
<!-- BEGIN PAGE CONTENT INNER -->
<div class="portlet light">
	<div class="portlet-body">
		<div class="row">
			<div class="col-md-12 margin-bottom-10">
				<form id="queryform" class="form-horizontal">
					
					<label class="control-label col-md-2" for="projectCode" >
						<@spring.message "sys.customperformanceproject.html.projectCode"/>
					</label>
					<div class="col-md-2">
						<input class="form-control input-small" type="text" size="30" name="projectCode" id="queryProjectCode"  placeholder="<@spring.message "sys.customperformanceproject.html.tip.projectCode"/>"  />					
					</div>
					
					<label class="control-label col-md-2" for="projectName" >项目名称</label>
					<div class="col-md-2">
						<input class="form-control input-small" type="text" size="30" name="projectName" id="queryProjectName" placeholder="请输入项目名称"/>					
					</div>
					
					<div class="col-md-1">
						<a href="javascript:void(0)" id="btnQuery" class="btn blue">
							<i class="fa fa-search"></i> 
							<@spring.message "common.query.btn.text"/> 
						</a>
					</div>
				</form>
			</div>
		
			<div class="col-md-12 margin-bottom-10" id="toolbar">
				<@shiro.hasPermission name="system.customperformanceproject:add">
				<a id="btnAdd" class="btn btn-sm yellow" data-toggle="modal" href="#basic">
					<i class="fa fa-plus"></i> 
					<@spring.message "common.toolbar.btn.add.text"/>  
				</a>
				</@shiro.hasPermission>
				<@shiro.hasPermission name="system.customperformanceproject:edit">
				<a id="btnEdit" class="btn btn-sm red">
					<i class="fa fa-edit"></i> 
					<@spring.message "common.toolbar.btn.edit.text"/>
				</a>
				</@shiro.hasPermission>
				<@shiro.hasPermission name="system.customperformanceproject:delete">
				<a id="btnDelete" class="btn btn-sm purple">
					<i class="fa fa-times"></i> 
					<@spring.message "common.toolbar.btn.delete.text"/> 
				</a>
				</@shiro.hasPermission>
				<@shiro.hasPermission name="system.customperformanceproject:list">
				<a id="btnRefresh" class="btn btn-sm blue">
					<i class="fa fa-refresh"></i> 
					<@spring.message "common.toolbar.btn.reload.text"/>   
				</a>
				</@shiro.hasPermission>
				<@shiro.hasPermission name="system.customperformanceproject:export">
				<a href="javascript:void(0)" id="btnExport"  class="btn btn-sm green">
					<i class="fa  fa-file-excel-o"></i>
					<@spring.message "common.toolbar.btn.export.text"/>
				</a>
				</@shiro.hasPermission>
			</div>
			<div class="col-md-12">
				  <table class="lion-datagrids table table-striped table-bordered table-hover" id="sys_customperformanceproject_tb" data-loading="false" data-singleselect="true" data-loadUrl="${base}/baseinfo/customperformanceproject/list.json" data-checkbox="true" data-pageSize="10">
					<thead>
						<tr>
							<th class="table-checkbox" data-field='id' data-checkbox="true" data-sortable="false">
						 		<input type="checkbox" class="group-checkable" data-set="#sys_customperformanceproject_tb.checkboxes" />
						 	</th>
							<th data-field='projectCode' data-sortDir='asc' style="width:80px;">
								<@spring.message "sys.customperformanceproject.html.projectCode"/>
							</th>
							<th data-field='projectName' style="width:100px;">
								<@spring.message "sys.customperformanceproject.html.projectName"/>
							</th>
							<th data-field="projectUnit" style="width:40px;">
								单位
							</th>
							<th data-field="dataTableName" style="width:150px;">
								数据表
							</th>
							<th data-field="fetchSQL" style="width:250px;">
								取数SQL
							</th>
							<th data-field="variableNumber" style="width:30px;">
								变量数
							</th>
							<th data-field="dataType" style="width:40px;" data-formatter="formatterDataType">
								数据类型
							</th>
							
						</tr>
					</thead>
				</table>
			</div>
		</div>
	</div>
</div>

<!-- END PAGE CONTENT INNER -->
<!--Edit Dialog Start -->
<div class="modal fade bs-modal-lg" id="basic" tabindex="-1" role="basic" aria-hidden="true">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
				<h4 class="modal-title">
					<i class="fa fa-plus"></i> 
					<span><@spring.message "sys.customperformanceproject.form.adddialog.text"/></span>
				</h4>
			</div>
			<div class="modal-body">
				 	<div class="row">
				 	<div class="col-md-12 portlet-body form">
				 		<!-- BEGIN FORM-->
							<form action="#" class="form-horizontal" name="addForm" id="addForm" method="post">
								<input type="hidden" id='id' name='id' value="">
								<div class="form-body">
									
									<div class="form-group">
										<div class="form-filed">
										<label class="col-md-2 control-label">
											<@spring.message "sys.customperformanceproject.html.projectCode"/>
										</label>
										<div class="col-md-2">
											<div class="input-group">
												<input type="text" id="projectCode" name="projectCode" maxlength="100" class="form-control" placeholder="<@spring.message "sys.customperformanceproject.html.tip.projectCode"/>" size="30"/>
											</div>
										</div>
										</div>
										
										<div class="form-filed">
										<label class="col-md-2 control-label">
											<@spring.message "sys.customperformanceproject.html.projectName"/>
										</label>
										<div class="col-md-3">
											<div class="input-group">
												<input type="text"  id="projectName" name="projectName" maxlength="100" class="form-control" placeholder="<@spring.message "sys.customperformanceproject.html.tip.projectName"/>" size="30"/>
											</div>
										</div>
										</div>
										
									</div>
									
									<div class="form-group">
										<div class="form-filed">
										<label class="col-md-2 control-label">
											单位
										</label>
										<div class="col-md-2">
											<div class="input-group">
												<input type="text"  id="projectUnit" name="projectUnit" maxlength="50" class="form-control" placeholder="请输入单位" size="20"/>
											</div>
										</div>
										</div>
										
										<div class="form-filed">
											<label class="col-md-2 control-label">
												数据类型
											</label>
											<div class="col-md-3">
												<select  id="dataType"  name="dataType" placeholder="请选择数据类型..."   class="lion-combo form-control select2  " data-valueField='codeValue'  data-textField='nameZh' data-URL="${base}/system/code/combox.htm?nameEn=CustomProjectDataType">
												</select>
												
												<!--
												<div class="input-group radio-list">	
														<label class="radio-inline">
															<input type="radio" name="dataType" id="dataType1" value="1">
															自动获取
														</label>
														<label class="radio-inline">
															<input type="radio" name="dataType" id="dataType0" value="0">
															 手工获取
													    </label>
												</div>
												-->
												
											</div>
										</div>
										
									</div>
									
									<div class="form-group">
										<div class="form-filed">
										<label class="col-md-2 control-label">
											数据表
										</label>
										<div class="col-md-3">
											<div class="input-group">
												<input type="text"  id="dataTableName" name="dataTableName" maxlength="100" class="form-control" placeholder="请输入数据表名" size="30"/>
											</div>
										</div>
										</div>
										
										<div class="form-filed">
										<label class="col-md-2 control-label">
											变量数
										</label>
										<div class="col-md-2">
											<div class="input-group">
												<input type="text"  id="variableNumber" name="variableNumber" maxlength="100" class="form-control" placeholder="只支持2,3,4" size="30"/>
											</div>
										</div>
										</div>
										
									</div>
									
									<div class="form-group">
										<div class="form-filed">
										<label class="col-md-2 control-label">取数SQL</label>
										<div class="col-md-10">
											<div class="input-group">
												<input type="text" name="fetchSQL" class="form-control input-xlarge" placeholder="请输入取数SQL" maxlength="256" size="30"/>
											</div>
										</div>
										</div>
									</div>
									
								</div>
							</form>
						<!-- END FORM-->
					</div>
			 		</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btnCancel" class="btn default" data-dismiss="modal">
					<i class="fa  fa-arrow-left"></i> 
					<@spring.message "common.diaglog.btn.cancel"/> 
				</button>
				<button type="button" id="btnSave" class="btn blue">
					<i class="fa fa-save"></i> 
					<@spring.message "common.diaglog.btn.save"/>
				</button>
			</div>
		</div>
	<!-- /.modal-content -->
</div>
<!-- /.modal-dialog -->
</div>
</body>
</html>