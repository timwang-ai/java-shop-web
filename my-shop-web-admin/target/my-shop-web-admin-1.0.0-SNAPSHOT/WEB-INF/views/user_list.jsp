<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>测试平台 | 测试列表</title>
    <jsp:include page="../includes/header.jsp"/>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">
    <jsp:include page="../includes/nav.jsp"/>
    <jsp:include page="../includes/menu.jsp"/>
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1 class="m-0 text-dark">测试列表</h1>
                    </div><!-- /.col -->
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="/main">Home</a></li>
                            <li class="breadcrumb-item active">测试列表</li>
                        </ol>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->
        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">
                <!-- Small boxes (Stat box) -->
                <div class="row">
                    <div class="col-lg-3 col-6">
                        <c:if test="${baseResult !=null}">
                            <div class="alert alert-${baseResult.status == 200?"success":"danger"} alert-dismissible">
                                <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;
                                </button>
                                    ${baseResult.message}
                            </div>
                        </c:if>
                        <!-- small box -->
                        <div class="small-box bg-info">
                            <div class="inner">
                                <h3>150</h3>

                                <p>New Orders</p>
                            </div>
                            <div class="icon">
                                <i class="ion ion-bag"></i>
                            </div>
                            <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
                        </div>
                    </div>
                    <!-- ./col -->
                    <div class="col-lg-3 col-6">

                    </div>
                </div>
            </div>
        </section>
        <!-- /.content -->
        <!-- /.row -->
        <div class="row">
            <div class="col-12">
                <div class="card">
                    <div class="card-header">
                        <div>
                            <h3 class="card-title">用户列表</h3>
                        </div>
                        <div class="row" style="padding-left: 12px; padding-top: 10px;">
                            <a href="/user/from" type="button" class="btn btn-primary btn-sm"><i class="fa fa-plus"></i>新增</a>&nbsp;&nbsp;&nbsp;
                            <a href="#" type="button" class="btn btn-danger btn-sm"><i class="fa fa-trash"></i>删除</a>&nbsp;&nbsp;&nbsp;
                            <a href="#" type="button" class="btn btn-success btn-sm"><i class="fa fa-upload"></i>导入</a>&nbsp;&nbsp;&nbsp;
                            <a href="#" type="button" class="btn btn-success btn-sm"><i
                                    class="fa fa-download"></i>导出</a>&nbsp;&nbsp;&nbsp;
                        </div>
                        <%--                        <div class="row">--%>
                        <%--                            <form:form action="/user/search" method="post" modelAttribute="tbUser">--%>
                        <%--                                <div class="col-xs-4">--%>
                        <%--                                    <div class="input-group input-group-sm" style="width: 150px;">--%>
                        <%--                                        <form:input path="empty" cssClass="form-control" placeholder="姓名"/>--%>
                        <%--&lt;%&ndash;                                        <input type="text" name="username" class="form-control" placeholder="姓名">&ndash;%&gt;--%>
                        <%--                                    </div>--%>
                        <%--                                </div>--%>
                        <%--                            </form:form>--%>
                        <%--                        </div>--%>
                        <div class="card-tools">
                            <%--                            搜索 1.0 版本--%>
                            <form action="/user/search" method="post">
                                <div class="input-group input-group-sm" style="width: 150px;">
                                    <input type="text" name="keyword" class="form-control float-right" placeholder="搜索">
                                    <div class="input-group-append">
                                        <button type="submit" class="btn btn-default"><i class="fas fa-search"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    <!-- /.card-header -->
                    <div class="card-body table-responsive p-0">
                        <table class="table table-hover text-nowrap">
                            <thead>
                            <tr>
                                <th>ID</th>
                                <th>用户名</th>
                                <th>手机号</th>
                                <th>邮箱</th>
                                <th>更新时间</th>
                                <th>操作</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${tbUser}" var="tbUser">
                                <tr>
                                    <td>${tbUser.id}</td>
                                    <td>${tbUser.username}</td>
                                    <td>${tbUser.phone}</td>
                                    <td>${tbUser.email}</td>
                                    <td><fmt:formatDate value="${tbUser.updated}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                    <td>
                                        <a href="#" type="button" class="btn btn-primary btn-sm"><i
                                                class="fa fa-search"></i>查看</a>&nbsp;&nbsp;&nbsp;
                                        <a href="#" type="button" class="btn btn-success btn-sm"><i
                                                class="fa fa-edit"></i>编辑</a>&nbsp;&nbsp;&nbsp;
                                        <a href="#" type="button" class="btn btn-danger btn-sm"><i
                                                class="fa fa-trash"></i>删除</a>&nbsp;&nbsp;&nbsp;
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <!-- /.card-body -->
                </div>
                <!-- /.card -->
            </div>
        </div>
        <!-- /.row -->
    </div>
    <jsp:include page="../includes/copyright.jsp"/>
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->
</body>
<jsp:include page="../includes/footer.jsp"/>
</html>
