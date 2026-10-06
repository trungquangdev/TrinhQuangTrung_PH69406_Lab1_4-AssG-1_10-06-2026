<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" cellspacing="6" cellpadding="6">
    <thead>
        <tr>
            <th>soLuongTon</th>
            <th>donGia</th>
            <th>barcode</th>
            <th>ghiChu</th>
            <th>createdAt</th>
            <th>createdBy</th>
            <th>updatedAt</th>
            <th>updatedBy</th>
            <th>delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${dssp}" var="ds">
            <tr>

                <td>${ds.soLuongTon}</td>
                <td>${ds.donGia}</td>
                <td>${ds.barCode}</td>
                <td>${ds.ghiChu}</td>
                <td>${ds.createdAt}</td>
                <td>${ds.createdBy}</td>
                <td>${ds.updatedAt}</td>
                <td>${ds.updatedBy}</td>
                <td>${ds.deleted}</td>

            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
