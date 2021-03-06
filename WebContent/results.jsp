<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <title>View tickets</title>
    <script src=https://code.jquery.com/jquery-3.6.0.min.js></script>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <td>book name</td>
                <td>book price</td>
                <td>book type</td>
                <td>book review</td>
                <td>book Up</td>
                <td>action</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="book">
                <tr>
           
                    <td>${book.name}</td>
                    <td>${book.price}</td>
                    <td>${book.bookType.name}</td>
                    <td>${book.show}</td>
                   
                    <td>
                        <c:choose>
                            <c:when test="${book.bookUp==1}">
                                up
                            </c:when>
                            <c:when test="${book.bookUp==0}">
                                down
                            </c:when>
                        </c:choose> 
                    </td>
                    <td>
                        <c:choose>
                            <c:when test="${book.bookUp==1}">
                                <input type="button" value="down" onclick="toggle(${book.id},0)">
                            </c:when>
                            <c:when test="${book.bookUp==0}">
                                <input type="button" value="up" onclick="toggle(${book.id},1)">
                            </c:when>
                        </c:choose> 
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
  
</body>
<script type="text/javascript">
    function toggle(id,bookUp){

        $.ajax({
                url: "<%=request.getContextPath()%>/book/update.do",
                type: "post",
                data: {
                    "id": id,
                    "bookUp": bookUp
                },
                success: function () {
                    location.reload();
                },
                error: function () {
                }
        })
    }
    
    //????????????
    function delUser(userid) {
        if (confirm("??????????????????????????????????????????")) {
            $.ajax({
                url: "<%=request.getContextPath()%>/user/delUser.do",
                type: "post",
                data: {
                    "userid": userid
                },
                success: function () {
                    location.reload();
                },
                error: function () {
                }
            })
        }
    }

    //????????????????????????????????????
    function toUpdateUser(userid) {
        location.href = "<%=request.getContextPath()%>/user/toUpdateUser.do?userid=" + userid;
    }

    //????????????
    function checkAll() {
        $("input[name='userid']").prop("checked", $("#check").prop("checked"))
    }

    //????????????????????????
    function delsUser() {
        var ids = "";
        $("input[name='userid']:checked").each(function () {
            ids += "," + $(this).val();
        })
        if (ids != null && ids != "") {
            $.ajax({
                url: "<%=request.getContextPath()%>/user/delsUser.do",
                type: "post",
                data: {
                    "ids": ids.substring(1)
                },
                success: function () {
                    location.reload();
                },
                error: function () {
                }
            })
        } else {
        }
    }
</script>

</html>