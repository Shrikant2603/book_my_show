<%@ taglib prefix = "c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>BookMyShow</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
    <header>
        <h1>BookMyShow</h1>
    </header>
    <main>
        <div id="movies">
            <ul>
                <c:if test="${not empty movies}">
                    <c:forEach var="movie" items="${movies}">
                        <li>
                            <a href="movies/${movie.getTitle()}">
                                "${movie.getTitle()}"
                            </a>
                        </li>
                    </c:forEach>
                </c:if>
                <c:if test="${empty movies}">
                    <li>No movies found.</li>
                </c:if>
            </ul>
        </div>
    </main>
</body>
</html>
