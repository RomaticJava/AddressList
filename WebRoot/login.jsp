<%@ page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>login</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css"
			href="css/style.css" />
	</head>

	<body>
		<div id="wrap">
			<div id="top_content">
					<div id="header">
						<div id="rightheader">
							<p><br/></p>
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
					login
					</h1>
					<form action="${pageContext.request.contextPath }/login" method="post">
						<table cellpadding="0" cellspacing="0" border="0"
							class="form_table">
							<tr>
								<td valign="middle" align="right">
									username:
								</td>
								<td valign="middle" align="left">
									<input type="username" class="inputgri" name="username" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									password:
								</td>
								<td valign="middle" align="left">
									<input type="password" class="inputgri" name="password" />
								</td>
							</tr>
							<tr>
								<td valign="middle" align="right">
									Code:
								</td>
								<td valign="middle" align="left">
									<input type="text" class="inputgri" name="validationCode" />
								</td>
								<script>
									/** 
								 	* 刷新验证码 
 									* @param imgObj 验证码Img元素 
 									*/  
									function refreshCode(imgObj) {  
 							    	if (!imgObj) {  
        							imgObj = document.getElementById("validationCode");  
    								}  
    								var index = imgObj.src.indexOf("?");  
    								if(index != -1) {  
        							var url = imgObj.src.substring(0,index + 1);  
        							imgObj.src = url + Math.random();  
    								} else {  
       								imgObj.src = imgObj.src + "?" + Math.random();  
    								}  
										}  
								</script>
								<td valign="middle" align="left">
									<%-- <img  src="${pageContext.request.contextPath}/code.png"> --%>
									<img id="validationCode" alt="验证码图片" title="验证码图片" src="${pageContext.request.contextPath}/code.png" onclick="refreshCode(this)" />  
									<a id="aRecode" href="javascript:void(0);" onclick="refreshCode()">换一张</a>  
								</td>
							</tr>
						</table>
						<p>
							<input type="submit" class="button" value="登录 &nbsp; &raquo; " />
						</p>
					</form>
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
