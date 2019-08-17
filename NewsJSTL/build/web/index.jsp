<%-- 
    Document   : index
    Created on : Aug 17, 2019, 7:28:03 AM
    Author     : Root1166
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="https://v40.pingendo.com/assets/4.0.0/default/theme.css" type="text/css"> </head>

</head>

<body>
    <nav class="navbar navbar-expand-md bg-primary navbar-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Tin nhanh</a>
            <!-- <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbar2SupportedContent">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse text-center justify-content-end" id="navbar2SupportedContent"> </div> -->
        </div>
    </nav>
    <div class="py-5">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <form class="" method="POST" action="search">
                        <div class="form-group">
                            <label>Search</label>
                            <input type="text" name="keyword" class="form-control"> </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
            </div>
            <br/>

            <br>
            <div class="row">
                <div class="col-md-12">
                    <div class="list-group">
                        <c:forEach var="item" items="${news}">
                            <a href="#" class="list-group-item list-group-item-action flex-column align-items-start">
                                <div class="d-flex w-100 justify-content-between">
                                    <h5 class="mb-1">${item.title}</h5>
                                    <small>${item.created_at}</small>
                                </div>
                                <p class="mb-1">${item.content}</p>
                                <small>Đăng Bởi: ${item.authors.name}</small>
                            </a>
                        </c:forEach>

                    </div>
                </div>
            </div>
<!--            <div class="row" style="margin-top: 20px">
                <div class="col-md-12">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#">
                                <span>Previous</span>
                                <span class="sr-only">Previous</span>
                            </a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="#">1</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="#">2</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="#">3</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="#">4</a>
                        </li>
                        <li class="page-item">
                            <a class="page-link" href="#">
                                <span>Next</span>
                                <span class="sr-only">Next</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>-->
            <div class="row "style="margin-top: 20px">
                <nav aria-label="Page navigation example">
                    <ul class="pagination">
                        <li class="page-item"><a class="page-link" href="news?page=${current - 1}">Previous</a></li>
                            <c:forEach var="i" begin="1" end="${total}" step="1">
                                <c:if test='${current != i}'>
                                <li class="page-item "><a class="page-link" href="news?page=${i}">${i}</a></li>
                                </c:if>     
                                <c:if test='${current == i}'>
                                <li class="page-item active "><a class="page-link" href="news?page=${i}">${i}</a></li>
                                </c:if>
                            </c:forEach>
                        <li class="page-item"><a class="page-link" href="news?page=${current + 1}">Next</a></li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
</body>

</html>