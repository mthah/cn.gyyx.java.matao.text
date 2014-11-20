<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<table>
		<tr>
			<td width="160">id</td>
			<td width="160">姓名</td>
		</tr>
		<c:forEach var="u" items="${list}">
			<tr>
				<td><c:out value="${u.code}" /></td>
				<td><c:out value="${u.userName}" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="test/selectAll?page=0">首页</a>
	************ ${pageCount} ****************** <br>
	
	
	<c:forEach var="e" items="${listPage}">
		<a href="selectAll?page=${e}">${e}</a> 
	</c:forEach>
	
	
<%--<c:forEach var="e" items="${listPage}">
		<a href="selectAll1?page=${e}">${e}</a> 
	</c:forEach>
	如果这么写  结果就是 在点开第二页的时候 不能显示下面的页
	@RequestMapping("/selectAll1")
	public String usePageSelect( @RequestParam  int page,Model model ) {
		SelectAllUser selectAll= new SelectAllUser ();
		List<UserInfo> list=selectAll.selectAllUserInfo(page);
		model.addAttribute("list",list);
		return "show";
	} --%>
	
</body>
</html>