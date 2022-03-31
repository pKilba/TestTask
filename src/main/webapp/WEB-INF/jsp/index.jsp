<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<fmt:setLocale value="${sessionScope.lang}"/>
<fmt:setBundle basename="locale"/>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<a type="button" href="?locale=ru_RU"
   class="btn btn-outline-light me-2 langToggle" data-onstyle="light"><fmt:message key="ru.lang"/></a>
<a type="button" href="?locale=en"
   class="btn btn-outline-light me-2 langToggle" data-onstyle="light"><fmt:message key="en.lang"/></a>
    <form action="" method="post">
    <button type="button" id="submit" onclick="alerted();"><fmt:message key="translate.button"/></button>
</form>

<script>
    var msg = {
        prop: "<fmt:message key="message" />"};
    function alerted() {
        alert(msg.prop);
    }
</script>
</body>
</html>
