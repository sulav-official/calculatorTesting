<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background-color: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }
        h1 {
            margin-bottom: 20px;
            color: #2c3e50;
        }
        input {
            margin: 15px 10px;
            padding: 10px;
            width: 60px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            margin: 10px 5px; /* Adjusted margin for spacing */
            padding: 10px 20px;
            background-color: #3498db;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        button:hover {
            background-color: #2980b9;
        }
        .result {
            margin-top: 20px;
            font-size: 1.5em;
            color: #e74c3c;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Calculator</h1>
    <input type="number" id="num1" placeholder="First Number" required>
    <input type="number" id="num2" placeholder="Second Number" required>
    <input type="number" id="num3" placeholder="Third Number" required>
    <br>
    <button onclick="calculate('add')">Add</button>
    <button onclick="calculate('subtract')">Subtract</button>
    <button onclick="calculate('multiply')">Multiply</button>
    <button onclick="calculate('divide')">Divide</button>
    <button onclick="calculate('percentage')">Percentage</button>
    <div class="result" id="result"></div>
</div>

<script>
    function calculate(operation) {
        const num1 = parseFloat(document.getElementById('num1').value);
        const num2 = parseFloat(document.getElementById('num2').value);
        const num3 = parseFloat(document.getElementById('num3').value);
        let result;

        switch (operation) {
            case 'add':
                result = num1 + num2 + num3;
                break;
            case 'subtract':
                result = num1 - num2 - num3;
                break;
            case 'multiply':
                result = num1 * num2 * num3;
                break;
            case 'divide':
                if (num2 === 0 || num3 === 0) {
                    result = 'Cannot divide by zero!';
                } else {
                    result = num1 / num2 / num3;
                }
                break;
            case 'percentage':
                if (num2 === 0) {
                    result = 'Cannot calculate percentage with zero!';
                } else {
                    result = (num1 / num2) * 100; // Calculate percentage based on first and second numbers
                }
                break;
            default:
                result = 'Invalid operation';
        }

        document.getElementById('result').innerText = `Result: ${result}`;
    }
</script>

</body>
</html>
