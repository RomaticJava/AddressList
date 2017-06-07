<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>emplist</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css" />
	</head>
	<body>
		<div id="wrap">
			<div id="top_content"> 
				<div id="header">
						<div id="rightheader">
							<p>
								<% String username=(String)request.getSession().getAttribute("username"); %>
								当前用户: <%=username %>
								<br />
								<a href="login.jsp">退出</a>
							</p>
						</div>
						<div id="topheader">
							<h1 id="title">
								<a href="#">通讯录</a>
							</h1>
						</div>
					<div id="navigation">
					</div>
				</div>
				<div id="content">
					<p id="whereami">
					</p>
					<h1>
						Welcome!
					</h1>
					<table class="table">
						<tr class="table_header">
							<td>
								ID
							</td>
							<td>
								Name
							</td>
							<td>
								Salary
							</td>
							<td>
								birthday
							</td>
							<td>
								Operation
							</td>
						</tr>
						<c:forEach items="${requestScope.address }" var="address">
							<tr class="row1">
								<td>
										${address.id}
								</td>
								<td>
										${address.name}
								</td>
								<td>
										${address.salary}
								</td>
								<td>
										${address.birthday}
								</td>
								<td>
									<a href="updateEmp.jsp?id=${address.id}&name=${address.name}&salary=${address.salary}&birthday=${address.birthday}">
										修改
									</a>
									&nbsp;
									<a href="${pageContext.request.contextPath }/deleteAddress?id=${address.id}">
										删除
									</a>
								</td>
							</tr>
						</c:forEach>
					</table>
					<p>
						<a href="addEmp.jsp">添加联系人</a>
					</p>
				</div>
			</div>
			<div id="footer">
				<div id="footer_bg">
				ABC@126.com
				</div>
			</div>
		</div>
	</body>
</html>
