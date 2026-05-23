<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FlowManager</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0f7fa;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            text-align: center;
            width: 80%;
            max-width: 800px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            position: relative;
        }
        .header {
            font-size: 2em;
            color: #1a237e;
            margin-bottom: 20px;
        }
        .carousel {
            display: flex;
            justify-content: center;
            align-items: center;
            margin-bottom: 20px;
        }
        .carousel img {
            width: 600px;
            max-width: 600px;
            height: 300px;
            border-radius: 10px;
        }
        .buttons {
            margin-bottom: 20px;
        }
        .buttons button {
            background-color: #4caf50;
            color: white;
            border: none;
            padding: 10px 20px;
            margin: 5px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1em;
        }
        .buttons button:hover {
            background-color: #45a049;
        }
        .footer {
            font-size: 0.8em;
            color: #757575;
        }
        .hotline {
            color: red;
            font-weight: bold;
            cursor: pointer;
        }
        .logo {
            position: absolute;
            top: 20px;
            left: 20px;
            width: 50px;
            height: auto;
        }
        .hotline-symbol {
            position: absolute;
            top: 20px;
            right: 20px;
            color: red;
            font-weight: bold;
            cursor: pointer;
        }
    </style>
</head>
<body>

    <div class="container">
        <img src="imgs/logo.png" alt="Company Logo" class="logo">
        <div></div>
        <div class="header">WELCOME..!</div>
        <div class="carousel">
            <img id="carouselImage" src="imgs/ashOffice.jpg" alt="Carousel Image">
        </div>
        <div class="buttons">
        <form method= "get" action="LoginServlet">
        	<button type = "submit" name = button value = 1 >Staff Login</button> 
        	<button type = "submit" name = button value = 2 >Administrative Log</button>
        </form> </div>
           
        <div class="footer">
            <p>Copyright © 2024 Website. All rights reserved.</p>
            <p class="hotline" onclick="callHotline()">Hotline</p>
        </div>
    </div>

    <script>
        let currentSlide = 0;
        const images = [
            'imgs/ashOffice.jpg',
            'imgs/wls.jpeg',
            'imgs/pro.jpeg',
            'imgs/whiteOffice.jpg',
            'imgs/grp.jpg'
        ];

        function showSlide(index) {
            const carouselImage = document.getElementById('carouselImage');
            carouselImage.src = images[index];
        }

        function nextSlide() {
            currentSlide = (currentSlide < images.length - 1) ? currentSlide + 1 : 0;
            showSlide(currentSlide);
        }

        //auto slide function
        setInterval(nextSlide, 3000); //for auto slide

        function callHotline() {
            alert('Calling Hotline: 077- 22 88 123');
        }
    </script>

</body>
</html>
