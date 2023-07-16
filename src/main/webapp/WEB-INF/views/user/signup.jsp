<%@ page language="java" contentType="text/html; charset-UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <h2>회원가입</h2>
        <form method="post" action="/user/signup">
            <div class="form-group">
                <label for="id">사용자 아이디:</label>
                <input type="text" class="form-control" id="id" name="id" placeholder="사용자 아이디를 입력하세요" name="username">
            </div>
            <div class="form-group">
                <label for="name">사용자 이름:</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="사용자 이름을 입력하세요" name="username">
            </div>
            <div class="form-group">
                <label for="phone">사용자 전화번호:</label>
                <input type="text" class="form-control" id="phone" name="phone" placeholder="사용자 전화번호를 입력하세요" name="username">
            </div>
            <div class="form-group">
                <label for="account">사용자 계좌:</label>
                <input type="text" class="form-control" id="account" name="account" placeholder="사용자 계좌를 입력하세요" name="username">
            </div>
            <div class="form-group">
                <label for="bank">사용자 은행:</label>
                <input type="text" class="form-control" id="bank" name="bank" placeholder="사용자 은행을 입력하세요" name="username">
            </div>
            <div class="form-group">
                <label for="email">이메일:</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="이메일을 입력하세요" name="email">
            </div>
            <div class="form-group">
                <label for="password">비밀번호:</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호를 입력하세요" name="password">
            </div>
            <button type="submit" class="btn btn-primary">회원가입</button>
        </form>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
<script>
    function write1(){
        let post = {
            id: $(`#id`).val(), // 3가지 가능
            body: $('#body').val(),
            name: $("#name").val(),
            account: $("#account").val(),
            bank: $("#bank").val(),
            email: $("#email").val(),
            password: $("#password").val()
        };

        $.ajax({
            type:"post",
            url: "http://localhost:8080/user/signup",
            data:JSON.stringify(post),  // js오브젝트를 json으로 파싱
            headers:{
                "content-type":"application/json; charset=utf-8"
            },
            dataType:"json"
        }).done((res)=>{

        }).fail((err)=>{

        });
    }
</script>
</html>
