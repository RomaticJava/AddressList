<%--
  Created by IntelliJ IDEA.
  User: 62599
  Date: 2017/06/04
  Time: 下午 8:35
  To change this template use File | Settings | File Templates.
--%>
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

            <form action="${pageContext.request.contextPath }/login" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <h1>登陆失败！请检查用户名密码及验证码！</h1>
                </table>
                <p>
                    <input type="button" value="重新登陆" onClick="window.location.href='login.jsp'">
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

