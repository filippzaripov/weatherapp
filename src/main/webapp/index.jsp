<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns="http://www.w3.org/1999/xhtml"
        xmlns:h="http://java.sun.com/jsf/html"
        xmlns:f="http://java.sun.com/jsf/core">
<head>

    <meta charset="UTF-8">
    <style type="text/css">

        body{
            background-color: #babbbb;
        }
    </style>

</head>

<body>
    <form action="russianWeather" method="post">
            <select name="City" id="City" >

            <option value="Kazan" >Kazan</option>
            <option value="Moscow" >Moscow</option>
            <option value="Saint-Petersburg" >Saint-Petersburg</option>
        </select>
        <input type="submit" value="Weather"/>



        <div><c:out value="${city}"/></div>



        <div id="weatherDiv"></div>

    </form>

</body>
</html>
