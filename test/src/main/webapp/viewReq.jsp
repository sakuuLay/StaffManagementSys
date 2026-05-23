<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Request</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }
        
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
            background-color: #fff;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
        button {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 15px;
            cursor: pointer;
            margin: 5px 0;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        button:hover {
            background-color: #0056b3;
        }
        h2 {
            color: #333;
        }
    </style>
</head>
<body>

<h2>View Requests</h2>
<c:forEach var="fR" items="${fReq}">

    <c:set var="rid" value="${fR.reqID}"/>
    <script>
    var rid = ${fR.reqID}
    </script>
    <c:set var="eid" value="${fR.EID}"/>
    <c:set var="ename" value="${fR.eName}"/>
    <c:set var="depId" value="${fR.DID}"/>
    <c:set var="type" value="${fR.type}"/>
    <c:set var="date" value="${fR.date}"/>
    <c:set var="des" value="${fR.des}"/>
    <c:set var="approval" value="${fR.approval}"/>
    <c:set var="email" value="${fR.email}"/>
    <c:set var="Submission" value="${fR.submission}"/>

    <table>
        <tr>
            <td><strong>Request ID:</strong></td>
            <td>${fR.reqID}</td>
        </tr>
        <tr>
            <td><strong>EiD:</strong></td>
            <td>${fR.EID}</td>
        </tr>
        <tr>
            <td><strong>Employee name:</strong></td>
            <td>${fR.eName}</td>
        </tr>
        <tr>
            <td><strong>Department ID:</strong></td>
            <td>${fR.DID}</td>
        </tr>
        <tr>
            <td><strong>Requested leave type:</strong></td>
            <td>${fR.type}</td>
        </tr>
        <tr>
            <td><strong>Requiring date:</strong></td>
            <td>${fR.date}</td>
        </tr>
        <tr>
            <td><strong>Description:</strong></td>
            <td>${fR.des}</td>
        </tr>
        <tr>
            <td><strong>Approval:</strong></td>
            <td>${fR.approval}</td>
        </tr>
        <tr>
            <td><strong>Submitted email:</strong></td>
            <td>${fR.email}</td>
        </tr>
        <tr>
            <td><strong>Submission:</strong></td>
            <td>${fR.submission}</td>
        </tr>
    </table>

    <form action="upReqServlet" method="post">
        <button type="submit" name="update" value="${fR.reqID}">Update my request</button>
    </form>
    <form action="dltReqServlet" method="post">
        <button type="submit" name="dlt" value="${fR.reqID}">Delete my request</button>
    </form>
    <br>

</c:forEach>

</body>
</html>
