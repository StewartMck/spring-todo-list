 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ page import="ca.smckinlay.util.Mappings" %>
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
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                <c:forEach var="item" items="${todoData.items}">

                <c:url var="viewUrl" value="${Mappings.ITEM}">
                <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                <c:param name="id" value="${item.id}"/>
                </c:url>

                <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                <c:param name="id" value="${item.id}"/>
                </c:url>

                    <tr>
                        <td>
                            <a href="${viewUrl}"><c:out value="${item.title}"/></a>
                        </td>
                        <td><c:out value="${item.deadline}"/></td>
                        <td>
                            <a href="${editUrl}">Edit</a>
                        </td>
                        <td>
                            <a href="${deleteUrl}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
    <jsp:include page="_footer.jsp" />
</html>