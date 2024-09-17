<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome to Sample Web Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f8ff;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
        }
        header {
            background: #333;
            color: #fff;
            padding: 10px 0;
            text-align: center;
        }
        h1 {
            margin: 0;
        }
        .content {
            padding: 20px;
            text-align: center;
        }
        button {
            padding: 10px 20px;
            font-size: 16px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
        #serverTime {
            margin-top: 20px;
            font-size: 18px;
            color: #333;
        }
    </style>
</head>
<body>

<header>
    <h1>Welcome to the Sample Web Application</h1>
</header>

<div class="container">
    <div class="content">
        <p>This is a simple web application to demonstrate WAR file packaging and deployment on an Apache server.</p>
        <button onclick="clickMe()">Click Me</button>
        <div id="clickMe"></div>
    </div>
</div>

<script>
    function clickMe() {
        var xhr = new XMLHttpRequest();
        xhr.open('GET', 'getServerTime.jsp', true);
        xhr.onload = function() {
         document.getElementById('clickMe').innerHTML = xhr.responseText;
        };
        xhr.send();
    }
</script>

</body>
</html>
