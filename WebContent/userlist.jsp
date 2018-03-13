<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/teacherCommon.jsp" %>
<head><title>专家数据查看</title>
 <style type="text/css"> .pagination {
  display: inline-block;
  padding-left: 0;
  margin: 20px 0;
  border-radius: 4px;
}
.pagination > li {
  display: inline;
}
.pagination > li > a,
.pagination > li > span {
  position: relative;
  float: left;
  padding: 6px 12px;
  margin-left: -1px;
  line-height: 1.42857143;
  color: #337ab7;
  text-decoration: none;
  background-color: #fff;
  border: 1px solid #ddd;
}
.pagination > li:first-child > a,
.pagination > li:first-child > span {
  margin-left: 0;
  border-top-left-radius: 4px;
  border-bottom-left-radius: 4px;
}
.pagination > li:last-child > a,
.pagination > li:last-child > span {
  border-top-right-radius: 4px;
  border-bottom-right-radius: 4px;
}</style>
</head>
		<div class="layui-body" id="content_body">
			<!-- 面包屑 -->
			<span class="layui-breadcrumb head-breadcrumb">
				<i class="iconfont">&#xe61a;</i>
				<a href="<%=basePath%>SelectAll.do">首页</a>
				<a href="<%=basePath%>SelectAll.do">项目管理</a>
				<a><cite>项目申请工作跟踪</cite></a>
			</span>
			
					<div style="padding: 15px;">
				<!-- 查询部分 -->
				<form class="layui-form" action="QueryUserInfoServlet" method="post">
<label class="layui-form-label">专家姓名：</label>
<div class="layui-input-inline">
 <input type="text" class="layui-input" placeholder="请输入专家姓名" autocomplete="off" name="name" >
     </div>
       
  
    <div class="layui-inline">
						<button class="layui-btn layui-btn-normal layui-btn-small" layui-submit>
							<i class="layui-icon">&#xe615;</i> 查询
						</button>
						<button class="layui-btn layui-btn-normal layui-btn-small" type="reset">
							<i class="layui-icon">&#x1002;</i>重置条件
						</button>
						<button class="layui-btn layui-btn-normal layui-btn-small" type="reset" onclick="javascript:window.location.href='userAdd.jsp';">
							<i class="layui-icon">&#xe654;</i>新建专家资料
						</button>
					</div>
	</form>
  <table class="layui-table">
                <thead>
                <tr>
                   <th>编号</th>
                    <th>姓名</th>
                    <th>专家关键词1</th>
                    <th>专家关键词2</th>
                    <th>专家关键词3</th>
                    <th>专家关键词4</th>
                    <th>专家关键词5</th>   
                    <th>操作</th>   
                </tr>
                
<!--       以下内容替换成循环遍历  -->
             <tbody>
                 <tr>
                  <c:forEach items="${list}" var="userinfo">
			<tr>
				<td><center>${userinfo.id}</center></td>
				<td><center>${userinfo.name}</center></td>
				<td><center>${userinfo.keyword1}</center></td>
				<td><center>${userinfo.keyword2}</center></td>
				<td><center>${userinfo.keyword3}</center></td>
				<td><center>${userinfo.keyword4}</center></td>
				<td><center>${userinfo.keyword5}</center></td>
				<td><center><a href="FindUserServlet?id=${userinfo.id}" class="layui-btn layui-btn-normal layui-btn-mini"target="_blank">查看详情</a>
				<a href="DeleteUserInfoServelt?id=${userinfo.id}" class="layui-btn layui-btn-danger layui-btn-mini"  onclick="return confirm('确定删除当前数据？')">删除</a></td>
            </center>    </tr>
              </c:forEach>
                 
                </tr>
         </tbody>          
  </table>
  </div>

	<center>
		<ul class="pagination">
			${pageCode }
		</ul>
	</center>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/nav.js"></script>
	<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script>
	//JavaScript代码区域
	layui.use('laypage', function(){
  var laypage = layui.laypage;
  
  //执行一个laypage实例
  laypage.render({	
    elem: 'fenye' //注意，这里的 test1 是 ID，不用加 # 号
    ,count: 2//数据总数，从服务端得到
    ,limit: 1
  });
});
 layui.use('element', function(){
     var element = layui.element;
        });
 layui.use('laydate', function(){
	  var laydate = layui.laydate;	
	  laydate.render({
		    elem: '#year'
		    ,type: 'year'
		  });
 });
 layui.use('form', function(){
     var form = layui.form;
   });
 $(document).ready(function() {
     $("#down").click(function() {
             var title = $("#tit").val();
             var apply_year = $("#apyear").val();
             window.location.href = "${pageContext.request.contextPath}/DownLoadItemTrackExcel.do?title="+ title + "&apply_year=" + apply_year;
         });
 });
	</script>
	<script>
	

 layui.use('form', function(){
     var form = layui.form;
   });
 layui.use('layer', function(){
	 var layer = layui.layer;
	 });  
 function checkForm(){
		//询问框
		 layer.confirm('您是否确定要删除？', {
		   btn: ['是','否'] //按钮
		 }, function(){
		   layer.msg('已成功删除', {icon: 1});
		   return true;
		 }, function(){
			 return false;
		 });
		 }
	</script>
</body>
</html>