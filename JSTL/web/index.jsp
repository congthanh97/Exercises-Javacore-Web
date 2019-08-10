<%-- 
    Document   : iindex
    Created on : Jul 28, 2019, 3:19:31 PM
    Author     : Root1166
--%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@page import="com.java.demo.bean.Student"%>
            <%@page import="java.util.List"%>
                <%@page import="com.java.demo.model.StudentModel"%>

                    <!doctype html>
                    <html lang="en">

                    <head>
                        <!-- Required meta tags -->
                        <meta charset="utf-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

                        <!-- Bootstrap CSS -->
                        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
                        <link rel="stylesheet" href="path/to/font-awesome/js/font-awesome.min.js">
                        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
                        <title>Wellcome</title>
                        <style>
                            th {
                                text-align: center
                            }
                        </style>
                    </head>

                    <body>
                        <header class="container-fluid">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-12">
                                        <img src="Capture.PNG" alt="background">
                                    </div>
                                </div>
                            </div>
                        </header>
                        <div class="container-fluid">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-3 left-content">
                                        <ul>
                                            <li>Danh muc</li>
                                            <li>Tai lieu</li>
                                        </ul>
                                    </div>
                                    <div class="col-md-9 Right-content">
                                        <div style="padding-bottom: 20px;">
                                            <a href="add.jsp" class="btn btn-danger">Add</a>
                                        </div>
                                        <div class="clearfix"></div>

                                        <div>
                                            <table border="1" width="780px">
                                                <thead>
                                                    <tr>
                                                        <th>STT</th>
                                                        <th>Ho ten</th>
                                                        <th>Email</th>
                                                        <th>Address</th>
                                                        <th>Chuc nang</th>
                                                    </tr>
                                                </thead>

                                                <tbody>
                                                    <%
                                                        StudentModel model = new StudentModel();
                                                        List<Student> list = model.getAll();
                                                        for (Student student : list) {
                                                    %>
                                                        <tr>
                                                            <th scope="row">
                                                                <%= student.getId()%>
                                                            </th>
                                                            <td>
                                                                <%= student.getName()%>
                                                            </td>
                                                            <td>
                                                                <%= student.getEmail()%>
                                                            </td>
                                                            <td>
                                                                <%= student.getAddress()%>
                                                            </td>
                                                            <td>
                                                                <a class="btn btn-primary" href="edit.jsp?id=<%= student.getId()%>">Sửa</a>
                                                                <a class="btn btn-danger" href="delete?id=<%= student.getId()%>">Xoá</a>
                                                            </td>
                                                        </tr>
                                                        <%
                                                        }
                                                    %>
                                                </tbody>

                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <footer class="container-fluid">
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-12">

                                    </div>
                                </div>
                            </div>
                        </footer>

                        <!-- Optional JavaScript -->
                        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
                        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
                        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
                    </body>

                    </html