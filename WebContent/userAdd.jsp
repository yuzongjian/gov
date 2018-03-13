<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html lang="zh">
<%@ include file="teacherCommon.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head><title>新增专家</title>

</head>
		<div class="layui-body" id="content_body">
			<!-- 面包屑 -->
			<span class="layui-breadcrumb head-breadcrumb">
				<i class="iconfont">&#xe61a;</i>
				<a href="${pageContext.request.contextPath}/adminSelectAll.do">首页</a>
				<a href="<%=basePath%>StatisticList.do">新增专家</a>
			</span>
			<!-- 内容主体区域 -->
			<div style="padding: 15px;">
  <table class="layui-table">
   <form name="form1" method="post" action="AddUserServlet">   
                <fieldset class="area-form-item layui-elem-field layui-field-title">
                    <legend>新增专家</legend>
                </fieldset>
              
                <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">姓名</label>
                    <div class="layui-input-inline">
                        <input id="name" type="text" name="name"   class="layui-input" maxlength="50" >
                    </div>
                </div>
                <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词1</label>
                    <div class="layui-input-inline">
                        <input id="keyword1" type="text" name="keyword1"  class="layui-input" maxlength="50" >
                    </div>
                </div>

                <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词2</label>
                    <div class="layui-input-inline">
                        <input id="keyword2" type="text" name="keyword2" v  class="layui-input" maxlength="30" >
                    </div>
                </div>

                <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词3</label>
                    <div class="layui-input-inline">
                        <input id="keyword3" type="text" name="keyword3"   class="layui-input" maxlength="30" >
                    </div>
                </div>

                <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词4</label>
                    <div class="layui-input-inline">
                        <input id="keyword4" type="text" name="keyword4"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词5</label>
                    <div class="layui-input-inline">
                        <input id="keyword5" type="text" name="keyword5" class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词6</label>
                    <div class="layui-input-inline">
                        <input id="keyword6" type="text" name="keyword6"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词7</label>
                    <div class="layui-input-inline">
                        <input id="keyword7" type="text" name="keyword7"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词8</label>
                    <div class="layui-input-inline">
                        <input id="keyword8" type="text" name="keyword8"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词9</label>
                    <div class="layui-input-inline">
                        <input id="keyword9" type="text" name="keyword9"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词10</label>
                    <div class="layui-input-inline">
                        <input id="keyword10" type="text" name="keyword10"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词11</label>
                    <div class="layui-input-inline">
                        <input id="keyword11" type="text" name="keyword11"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词12</label>
                    <div class="layui-input-inline">
                        <input id="keyword12" type="text" name="keyword12"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词13</label>
                    <div class="layui-input-inline">
                        <input id="keyword14" type="text" name="keyword14"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词14</label>
                    <div class="layui-input-inline">
                        <input id="keyword14" type="text" name="keyword14"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词15</label>
                    <div class="layui-input-inline">
                        <input id="keyword15" type="text" name="keyword15"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词16</label>
                    <div class="layui-input-inline">
                        <input id="keyword16" type="text" name="keyword16"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词17</label>
                    <div class="layui-input-inline">
                        <input id="keyword17" type="text" name="keyword17"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词18</label>
                    <div class="layui-input-inline">
                        <input id="keyword18" type="text" name="keyword18"  class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词19</label>
                    <div class="layui-input-inline">
                        <input id="keyword19" type="text" name="keyword19"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                 <div class="area-form-item layui-form-item">
                    <label class="layui-form-label">关键词20</label>
                    <div class="layui-input-inline">
                        <input id="keyword20" type="text" name="keyword20"   class="layui-input" maxlength="30" >
                    </div>
                </div>
                	<td>
				<div align="center">
					<input type="submit" name="Submit" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal" value="提交"> 
					<input type="reset" name="Submit2" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-normal" value="重置">
				</div>
				</td>
             	</form> 
<div class="fenyeWrap">
  </table>
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/nav.js"></script>
	<script src="${pageContext.request.contextPath}/layui/layui.js"></script>
	<script>
	//JavaScript代码区域
	layui.use('laypage', function(){
  var laypage = layui.laypage;
  
	//JavaScript代码区域
	 layui.use('layer', function(){
var layer = layui.layer;
});              

  //执行一个laypage实例
  laypage.render({	
    elem: 'fenye' //注意，这里的 test1 是 ID，不用加 # 号
    ,count: 50 //数据总数，从服务端得到
  });
});
 layui.use('element', function(){
            var element = layui.element;
        });
 layui.use('form', function(){
     var form = layui.form;
   });
 layui.use('laydate', function(){
	  var laydate = layui.laydate;	
	  laydate.render({
		    elem: '#firstYear'
		    ,type: 'year'
		  });
});
 layui.use('laydate', function(){
	  var laydate = layui.laydate;	
	  laydate.render({
		    elem: '#secondYear'
		    ,type: 'year'
		  });
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
	 });}
  
    
 $(document).ready(function() {
     $("#down").click(function() {
             var d = $("#d").val();
             var f = $("#f").val();
             var s = $("#s").val();
             window.location.href = "${pageContext.request.contextPath}/DownLoadStatisticExcel.do?d="+ d + "&f=" + f +"&s="+s;
         });
 });
	</script>
</body>
</html>