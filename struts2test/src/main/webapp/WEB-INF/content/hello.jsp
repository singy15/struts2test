<%@page import="javax.jws.WebParam.Mode"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title><s:text name="hello.message"/></title>
</head>

<body>
<h2><s:property value="message"/></h2>

<h3>Languages</h3>
<ul>
    <li>
        <s:url var="url" action="hello">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English</s:a>
    </li>
    <li>
        <s:url var="url" action="hello">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{url}">Espanol</s:a>
    </li>
</ul>



<!-- shows foo! -->
<span><%= pageContext.findAttribute("fooStr") %></span><br>

<!-- shows foo!, same as above -->
<span>${fooStr}</span><br>

<!-- shows 123 -->
<span>${barInt}</span><br>

<!-- shows foo! -->
<s:textfield name="fooStr" /><br>

<!-- shows foo? -->
<s:textfield value="foo?" /><br>

<!-- shows foo! -->
<s:textfield value="%{fooStr}" /><br>

<!-- cause error  -->
<%-- <s:textfield value="${fooStr}" /><br> --%>

<!-- cause error  -->
<%-- <s:textfield value="%{${fooStr}}" /><br> --%>

<!-- shows baz! -->
<s:textfield value="%{#session.baz}" /><br>

<!-- shows foobar! -->
<s:textfield value="%{#action.foobar}" /><br>

</body>
</html>
