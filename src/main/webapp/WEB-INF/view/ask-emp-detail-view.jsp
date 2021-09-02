<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>

<body>

<h2>my name is Aydar and I can do anything</h2>
</body>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee" method="get">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>

    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>

    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>

    Which car do you want? <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    Foreign Language(s) <form:checkboxes path="languages" items="${employee.languagesList}"/>

    <br>
    <br>
    <input type="submit" value="OK">


</form:form>

</html>