 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="ca.smckinlay.util.Mappings" %>
 <jsp:include page="_header.jsp">
    <jsp:param name="title" value="Item" />
 </jsp:include>
    <body>

     <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
     <c:param name="id" value="${toDoItem.id}"/>
     </c:url>

     <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
     <c:param name="id" value="${toDoItem.id}"/>
     </c:url>

        <div align="center">
            <table border="1" cellpadding="5">
                <caption>
                    <h2>Item: ${toDoItem.title}</h2>
                </caption>
                <tr>
                    <th>Title</th>
                    <th>Deadline</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>

                <tr>
                    <td><c:out value="${toDoItem.title}"/></td>
                    <td><c:out value="${toDoItem.deadline}"/></td>
                    <td>
                        <a href="${editUrl}">Edit</a>
                    </td>
                    <td>
                        <a href="${deleteUrl}">Delete</a>
                    </td>
                </tr>
            </table>
        </div>
    </body>
    <jsp:include page="_footer.jsp" />
</html>