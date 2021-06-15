 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <jsp:include page="_header.jsp">
       <jsp:param name="title" value="Todo Items" />
    </jsp:include>
    <body>
        <div align="center">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>Todo Items</h2>
                </caption>
                <tr>
                    <th>Title</th>
                    <th>Deadline</th>
                </tr>
                <c:forEach var="item" items="${todoData.items}">
                    <tr>
                        <td><c:out value="${item.title}"/></td>
                        <td><c:out value="${item.deadline}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
    <jsp:include page="_footer.jsp" />
</html>