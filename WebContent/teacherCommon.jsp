<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/iconfont/iconfont.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/layui/css/layui.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/global.css" />

</head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header nav-header">
			<div class="layui-logo nav-logo">
            	系统管理员后台
            	<i class="iconfont" id="nav_slide_btn">&#xe61c;</i>
            </div>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item">
					<a href="" class="nav-a">
						<i class="iconfont">&#xe625;</i>
						尊敬的管理员，您好！
					</a>
				</li>
				<li class="layui-nav-item"><a href="login.jsp" class="nav-a" id="nav_log_out">退出登录</a></li>
			</ul>
		</div>
   	       <div class="layui-side layui-bg-black" id="left_nav">
            <div class="layui-side-scroll">
                <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                    <li class="layui-nav-item layui-nav-itemed">
                        <a class="" href="javascript:;">专家管理</a>
                        <dl class="layui-nav-child">
                            <dd><a href="<%=basePath%>/QueryUserInfoServlet">专家列表</a></dd>
                        </dl>
                        
                    <li class="layui-nav-item layui-nav-itemed">
                        <a href="javascript:;">管理员管理</a>
                        <dl class="layui-nav-child">
                            <dd><a href="<%=basePath%>StatisticList.do">管理员列表</a></dd>
              
                        </dl>
                    </li>
                </ul>
            </div>
        </div>
   