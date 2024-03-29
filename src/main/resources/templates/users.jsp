<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="fragments/headTag.jsp"/>
<body>
<jsp:include page="fragments/bodyHeader.jsp"/>

<section>
        <h3><fmt:message key="user.title"/></h3>

        <table border="1" cellpadding="8" cellspacing="0">
            <thead>
        <tr>
                <th><fmt:message key="user.name"/></th>
                <th><fmt:message key="user.email"/></th>
                <th><fmt:message key="user.roles"/></th>
                <th><fmt:message key="user.active"/></th>
                <th><fmt:message key="user.registered"/></th>
            </tr>
        </thead>
            <c:forEach items="${users}" var="user">
                <jsp:useBean id="user" scope="page" type="com.softserve.homeproject.model.User"/>
                <tr>
                    <td><c:out value="${user.name}"/></td>
                    <td><a href="mailto:${user.email}">${user.email}</a></td>
                    <td>${user.roles}</td>
                    <td><%=user.isEnabled()%>
                    </td>
                    <td><fmt:formatDate value="${user.registered}" pattern="dd-MM-yyyy"/></td>
                </tr>
            </c:forEach>
        </table>
    </section>
<jsp:include page="fragments/footer.jsp"/>
</body>
<jsp:include page="fragments/i18n.jsp">
    <jsp:param name="page" value="user"/>
</jsp:include>
</html>