// 获取管理员基本资料
function show_info(id) {
    $.ajax({
        type: "get",
        url: "/admin/find",
        data: {"adminId": id},
        success: function (data) {
            $("#role").val(data.role);
            $("#adminId").val(data.adminId);
            $("#adminName").val(data.adminName);
            $("#sex").val(data.sex);
            $("#photo").val(data.photo);
            $("#phone").val(data.phone);
            $("#email").val(data.email);
            $("#remark").val(data.remark);

        }
    });
}
// 获取用户基本资料
function show_user_info(id) {
    $.ajax({
        type: "get",
        url: "/user/find",
        data: {"userId": id},
        success: function (data) {
            console.log(data);
            var arr=[];
            for(i=0;i<data.length;i++) arr.push(data[i].myInterest);
            $("#userId").val(data[0].userId);
            $("#userName").val(data[0].userName);
            $("#sex").val(data[0].sex);
            $("#photo").val(data[0].photo);
            $("#phone").val(data[0].phone);
            $("#email").val(data[0].email);
            $("#myInterest").val(arr);
        }
    });
}
function show_user_record(id) {
    window.location.href="http://localhost:8080/userRecord?userId="+id
}
function edit_pass(id) {
    var again_pass=$("#again_pass").val(),new_pass=$("#new_pass").val();
    if(again_pass!=new_pass){
        alert("密码不正确,请重新输入!!!");
        return;
    }
    $.ajax({
        type: "post",
        url: "/admin/password",
        data: {
            "adminId": id,
            "oldPw":$("#now_pass").val(),
            "newPw":$("#new_pass").val()
        },
        success: function (data) {
            if(data=="OK"){
                alert("修改密码成功");
                window.location.reload();
            }else{
                alert("修改密码失败");
                window.location.reload();
            }
        }
    });
}
function edit_user_pass(id) {
    var again_pass=$("#again_pass").val(),new_pass=$("#new_pass").val();
    if(again_pass!=new_pass){
        alert("密码不正确,请重新输入!!!");
        return;
    }
    $.ajax({
        type: "post",
        url: "/user/password",
        data: {
            "userId": id,
            "oldPw":$("#now_pass").val(),
            "newPw":$("#new_pass").val()
        },
        success: function (data) {
            if(data=="OK"){
                alert("修改密码成功");
                window.location.reload();
            }else{
                alert("修改密码失败");
                window.location.reload();
            }
        }
    });
}
// 图书入库
function do_add() {
    $.ajax({
        type: "post",
        url: "/book/add",
        data: {
            "_bookId": $("#new_bookId").val(),
            "_bookName": $("#new_bookName").val(),
            "_author": $("#new_author").val(),
            "_press": $("#new_press").val(),
            "_bookDate": $("#new_bookDate").val(),
            "_bookType": $("#new_bookType").val(),
            "_bookDesc": $("#new_bookDesc").val(),
            "_bookImage": $("#new_bookImage").val()
        },
        success: function (data) {
            if (data = "OK") {
                alert("新书入库成功");
                window.location.reload();
            } else {
                alert("新书入库失败");
                window.location.reload();
            }
        }
    });
}
// 图书管理~编辑行数据
function do_edit() {
    $.ajax({
        type: "post",
        url: "/book/update",
        data: {
            "_bookId": $("#_bookId").val(),
            "_bookName": $("#_bookName").val(),
            "_author": $("#_author").val(),
            "_press": $("#_press").val(),
            "_bookDate": $("#_bookDate").val(),
            "_bookType": $("#_bookType").val(),
            "_bookDesc": $("#_bookDesc").val(),
            "_bookImage": $("#_bookImage").val()
        },
        success: function (data) {
            if (data = "OK") {
                alert("编辑行数据成功");
                window.location.reload();
            } else {
                alert("编辑行数据失败");
                window.location.reload();
            }
        }
    });
}
function do_lend(id) {
    $.ajax({
        type: "post",
        url: "/user/lend",
        data: {
            "bookId": $("#bookId").val(),
            "userId": id
        },
        success: function (data) {
            if (data = "OK") {
                alert("借阅成功");
                window.location.reload();
            } else {
                alert("借阅失败");
                window.location.reload();
            }
        }
    });
}
// 修改基本资料
function update_info() {
    $.ajax({
        type: "post",
        url: "/admin/update",
        data: {
            "role": $("#role").val(),
            "adminId": $("#adminId").val(),
            "adminName": $("#adminName").val(),
            "sex": $("#sex").val(),
            "photo": $("#photo").val(),
            "phone": $("#phone").val(),
            "email": $("#email").val(),
            "remark": $("#remark").val()
        },
        success: function (data) {
            if (data == "OK") {
                alert("基本资料修改成功");
                window.location.reload();
            } else {
                alert("基本资料修改失败");
                window.location.reload();
            }

        }
    });
}
// 用户-修改基本资料
function update_user_info() {
    var items=$("#myInterest").val().split(",");
    var array=[];
    for(i=0;i<items.length;i++) array.push(items[i]);
    $.ajax({
        type: "post",
        url: "/user/update",
        data: {
            "userId": $("#userId").val(),
            "userName": $("#userName").val(),
            "sex": $("#sex").val(),
            "photo": $("#photo").val(),
            "phone": $("#phone").val(),
            "email": $("#email").val(),
            "array": array
        },
        success: function (data) {
            if (data == "OK") {
                alert("基本资料修改成功");
                window.location.reload();
            } else {
                alert("基本资料修改失败");
                window.location.reload();
            }

        }
    });
}
// 管理员修改用户
function manager_update_user_info() {
    $.ajax({
        type: "post",
        url: "/admin/updateUser",
        data: {
            "userId": $("#r_userId").val(),
            "userName": $("#r_userName").val(),
            "sex": $("#r_sex").val(),
            "phone": $("#r_phone").val(),
            "email": $("#r_email").val(),
        },
        success: function (data) {
            if (data >0){
                alert("用户资料修改成功");
                window.location.reload();
            } else {
                alert("用户资料修改失败");
                window.location.reload();
            }

        }
    });
}
function manager_delete_user(id) {
    $.ajax({
        type: "post",
        url: "/user/delete",
        data: {
            "userId": id
        },
        success: function (data) {
            if (data >0){
                alert("用户已删除");
                window.location.reload();
            } else {
                alert("用户删除失败");
                window.location.reload();
            }

        }
    });
}
var is_stretch=1;
$(function() {
    $("#stretch").click(function() {
        if (is_stretch == 1) {
            $("#left_side").animate({
                left: '-=200px'
            });
            $("#main_body").animate({
                left: '-=200px'
            });
            $("#footer_main").animate({
                left: '-=200px'
            });
            is_stretch=0;
        } else {
            $("#left_side").animate({
                left: '+=200px'
            });
            $("#main_body").animate({
                left: '+=200px'
            });
            $("#footer_main").animate({
                left: '+=200px'
            });
            is_stretch=1;
        }
    });
})
function handle_click(userId,bookId) {
    $.ajax({
        type: "post",
        url: "/record/click",
        data: {
            "userId": userId,
            "bookId": bookId
        }
    });
}