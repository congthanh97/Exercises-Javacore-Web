<%-- 
    Document   : add
    Created on : Oct 21, 2018, 4:54:13 PM
    Author     : pc
--%>

    <%@page import="com.java.demo.model.StudentModel"%>
        <%@page import="com.java.demo.bean.Student"%>
            <%@page contentType="text/html" pageEncoding="UTF-8"%>
                <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

                    <!DOCTYPE html>
                    <html>

                    <head>
                        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                        <title>JSP Page</title>
                        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
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
                                <br />
                                <div class="row">
                                    <div class="col-md-9">
                                        <h1>Sửa student</h1>
                                        <%
                            Student edit = new Student();
                            StudentModel model = new StudentModel();
                            int id = Integer.parseInt(request.getParameter("id"));
                            edit = model.getById(id);
                        %>

                                            <form class="col-md-6" method="Get" action="Edit">
                                                <div class="form-group">
                                                    <input type="hidden" class="form-control" value="<%= id%>" id="id" aria-describedby="emailHelp" name="id">
                                                </div>
                                                <div class="form-group">
                                                    <label for="name">Họ tên</label>
                                                    <input type="text" class="form-control" id="name" value="<%= edit.getName() %>" aria-describedby="emailHelp" placeholder="nguyen van a" name="name">

                                                </div>
                                                <div class="form-group">
                                                    <label for="major">Email</label>
                                                    <input class="form-control" id="email" placeholder="abc@gmail.com" name="email" value="<%= edit.getEmail() %>">
                                                </div>

                                                <div class="form-group">
                                                    <label for="className">Address</label>
                                                    <input class="form-control" id="address" placeholder="ninh binh" value="<%= edit.getAddress() %>" name="address">
                                                </div>

                                                <button type="submit" class="btn btn-primary">Submit</button>
                                            </form>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </body>

                    </html>