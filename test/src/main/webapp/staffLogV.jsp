<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>StaffLog</title>
    <style>
         body {
            background-image: url('imgs/whiteOffice.jpg');
            background-size: cover;
            background-attachment: fixed;
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .background-blur {
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background: inherit;
            filter: blur(10px);
            z-index: -1;
        }
        .login-container {
            background-color: #ffffff;
            border: 1px solid #bdbdbd;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .login-container h2 {
            color: #1e88e5;
        }
        .login-container label {
            display: block;
            text-align: left;
            margin: 10px 0 5px;
            color: black;
        }
        .login-container input[type="text"],
        .login-container input[type="password"] {
            width: 80%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #bdbdbd;
            border-radius: 5px;
        }
        .login-container button {
            background-color: #4caf50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin: 10px 0;
        }
        .login-container button:hover {
            background-color: #45a049;
        }
        .login-container .forgot-btn {
            background-color: #f44336;
        }
        .header {
            position: absolute;
            top: 0;
            width: 100%;
            background-color: #ffffff;
            padding: 10px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
         .header .logo {
            height: 50px;
            width: 50px;
            left-margin: 20px;
        }
        .header img {
            height: 30px;
        }
        .header .hotline {
            color: red;
            font-weight: bold;
        }
        .footer {
            position: absolute;
            bottom: 0;
            width: 100%;
            background-color: #ffffff;
            text-align: center;
            padding: 10px;
            box-shadow: 0 -2px 5px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>




<body>

    <div class="header">
        <img src="imgs/logo.png" alt="Logo" class="logo">
        <div>
            <a href="#"><img src="imgs/callred.png"></a>
            <a href="#" class="hotline" onclick="callHotline()">Hotline</a>
        </div>
    </div>
    <div class="login-container">
        <h2>Login</h2>
        <form action="SLogServlet" method="post">
            <label for="username">Enter your Username:</label>
            <input type="text" id="username" name="username" placeholder="Username" required>
            <label for="password">Enter your password:</label>
            <input type="password" id="password" name="password" placeholder="Password" required>
            <button type="submit">Log In</button>
            <button type="button" class="forgot-btn" onclick="forgotAccount()">Forgot account?</button>
        </form>
    </div>
    <div class="footer">
        <p>Copyright © 2024 Website. All rights reserved.</p>
    </div>

    <script>
        function forgotAccount() {
            alert('Forgot account clicked');//alert nathuwa email enter krnna danna
        }
        function callHotline() {
            alert('Calling Hotline');
        }
    </script>

</body>
</html>
