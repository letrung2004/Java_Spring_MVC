<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="utf-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
                <meta name="description" content="Hỏi Dân IT - Dự án laptopshop" />
                <meta name="author" content="Hỏi Dân IT" />
                <title>Dashboard Laptopshop</title>
                <link href="/css/styles.css" rel="stylesheet" />
                <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
            </head>

            <body class="sb-nav-fixed">
                <jsp:include page="../layout/header.jsp" />
                <div id="layoutSidenav">
                    <jsp:include page="../layout/sidebar.jsp" />
                    <div id="layoutSidenav_content">
                        <main>
                            <div class="container-fluid px-4">
                                <h1 class="mt-4">Manage Users</h1>
                                <ol class="breadcrumb mb-4">
                                    <li class="breadcrumb-item"><a href="/admin">Dashboard</a></li>
                                    <li class="breadcrumb-item active">Users</li>
                                </ol>
                                <div class="mt-5">
                                    <div class="row">
                                        <div class="col-12 mx-auto">
                                            <!-- Day la phan tren bang -->
                                            <div class="d-flex justify-content-between">
                                                <!-- id in h3 is id in UserController.java line 54 -->
                                                <h3>Users Detail</h3>

                                            </div>

                                            <hr />
                                            <div class="card" style="width: 70%;">
                                                <div class="card-header">
                                                    User Information
                                                </div>
                                                <ul class="list-group list-group-flush">
                                                    <li class="list-group-item">ID: ${user.id}</li>
                                                    <li class="list-group-item">Full Name: ${user.name} </li>
                                                    <li class="list-group-item">Email: ${user.email}</li>
                                                    <li class="list-group-item">Phone: ${user.phone}</li>
                                                    <li class="list-group-item">Address: ${user.address}</li>
                                                </ul>
                                            </div>
                                            <a style="margin-top: 10px;" class="btn btn-success"
                                                href="/admin/user">Back</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </main>
                        <jsp:include page="../layout/footer.jsp" />
                    </div>
                </div>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                    crossorigin="anonymous"></script>
                <script src="js/scripts.js"></script>
            </body>

            </html>