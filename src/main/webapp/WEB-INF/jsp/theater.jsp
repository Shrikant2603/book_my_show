<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Theaters</title>
</head>
<body>
<h1>Theaters</h1>

<table border="1">
    <tr>
        <th>Theater Name</th>
        <th>Location</th>
    </tr>

    <c:forEach items="${theaters}" var="theater">
        <tr>
            <td>
                <a href="theater/${theater.getId()}">${theater.getName()}</a>
                <br>
                Show Timings:
                <c:forEach items="${theater.movieScreens}" var="screening">
                    <c:if test="${screening.movie.title eq movieTitle}">
                        ${screening.time}
                    </c:if>
                </c:forEach>
            </td>
            <td>${theater.getAddress()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>