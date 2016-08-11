<#import "/WEB-INF/tags/spring.ftl" as spring>
<#assign base = request.contextPath/>
<!DOCTYPE html>
<!-- 
Template Name: Newtouch Admin Dashboard Template build with Twitter Bootstrap 3.3.1
Version: 1.0
Author: wanglijun
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if IE 10]> <html lang="en" class="ie10 no-js"> <![endif]-->
<!--[if IE 11]> <html lang="en" class="ie11 no-js"> <![endif]-->
<!--[if !IE]> <!-->
<html lang="en" class="no-js">
<!--<![endif]-->
<!-- BEGIN HEAD -->
<head>
<meta charset="utf-8"/>
<title>绩效管理系统</title>
<script src="${base}/resources/global/plugins/morris/morris.min.js" type="text/javascript"></script>
<script src="${base}/resources/global/plugins/morris/raphael-min.js" type="text/javascript"></script>
<script src="${base}/resources/global/plugins/jquery.sparkline.min.js" type="text/javascript"></script>
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN PAGE LEVEL SCRIPTS -->
<script src="${base}/resources/admin/layout4/scripts/demo.js" type="text/javascript"></script>
<script src="${base}/resources/admin/pages/scripts/index3.js" type="text/javascript"></script>
<script src="${base}/resources/admin/scripts/index/index.js" type="text/javascript"></script>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-sidebar-closed-hide-logo page-sidebar-closed-hide-logo">
			<!-- BEGIN PAGE CONTENT INNER -->
			<@shiro.guest>
				<small class="font-red-sharp">未登录</small>
			</@shiro.guest>
			<@shiro.user>
				<h2>欢迎登陆绩效管理系统</h2>
				<br><br>
				<h4>
					当前登录用户：<@shiro.principal property="realnameZh"/>
				</h4>
				<br/>
				<br/>
				<small><a href="${base}/logout.htm">点击退出</a></small>
			</@shiro.user>
</body>
<!-- END BODY -->
</html>