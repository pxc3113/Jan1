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
                <td>book id</td>
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
                    <td>${book.id}</td>
                    <td>${book.name}</td>
                    <td>${book.price}</td>
                    <td>${book.type.name}</td>
                    <td>${book.show}</td>
                    <td>${book.up}</td>
                    <td><input type="button" onclick="toggle(${book.id})"></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
  
</body>
<script type="text/javascript">
    function toggle(id){
        $.ajax({
                url: "<%=request.getContextPath()%>/book/update.do",
                type: "post",
                data: {
                    "id": id
                },
                success: function () {
                    location.reload();
                },
                error: function () {
                }
        })
    }
    //å é¤
    function delUser(userid) {
        if (confirm("ä½ ç¡®å®å é¤åï¼")) {
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

    //ä¿®æ¹åçåå¡«
    function toUpdateUser(userid) {
        location.href = "<%=request.getContextPath()%>/user/toUpdateUser.do?userid=" + userid;
    }

    //å¨é
    function checkAll() {
        $("input[name='userid']").prop("checked", $("#check").prop("checked"))
    }

    //æ¹éå é¤
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