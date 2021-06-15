 <%@ page import="ca.smckinlay.util.Mappings" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>

<html lang="en">
<head>
  <meta charset="utf-8">
  <title><%= request.getParameter("title") %></title>
  <meta name="description" content="Todo List Application">
  <meta name="Stewart McKinlay" content="SitePoint">
  <link rel="stylesheet" href="css/styles.css?v=1.0">
</head>

<header>
    <nav>
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2>
            <a href="${itemsLink}">Show Todo Items</a>
        </h2>
        <c:url var="addItemLink" value="${Mappings.ADD_ITEM}"/>
        <h2>
            <a href="${addItemLink}">Add new item</a>
        </h2>
    </nav>
</header>

