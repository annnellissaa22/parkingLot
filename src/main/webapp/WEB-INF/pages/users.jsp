
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
    <form method="POST" actions="${pageContext.request.contextPath}/User">
        <a class="btn btn-primary btn-lg" aria-current="page" href="${pageContext.request.contextPath}/AddUser">Add User</a>

    </form>
    </c:if>
        <div class="container tex-center">
        <div class ="row">
            <div class="col">
                admin
            </div>
            <div class="col">
                admin@admin.com
            </div>
        </div>
    </div>
</t:pageTemplate>