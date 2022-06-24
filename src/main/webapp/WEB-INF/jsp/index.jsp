<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <form action="create" method="post">
                <fieldset class="form-group">
                    <label>Name</label>
                    <input type="text"  class="form-control"
                           name="name" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>wage</label>
                    <input type="text" class="form-control"
                           name="wage">
                </fieldset>
                <button type="submit" class="btn btn-success">Save</button>
                <button type="reset" class="btn btn-success">reset</button>
            </form>
        </div>
    </div>
</div>
<div class="row">
    <div class="container">
        <h3 class="text-center">List of Users</h3>
        <hr>
        <div class="container text-left">

            <a href="home" class="btn btn-success">Add
                New User</a>
        </div>
        <br>
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>wage</th>
            </tr>
            <c:forEach var="p" items="${employees}">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.wage}</td>
                </tr>
            </c:forEach>
            </thead>
        </table>
        <!-- } -->
        </tbody>

        </table>
    </div>
</div>
</body>
</html>