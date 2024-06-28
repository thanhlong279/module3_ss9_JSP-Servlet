<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/discount", method="post">
    <label>Product Description</label>
    <input type="text" name="product" placeholder="Product Description"/><br/>
    <label>List Price</label>
    <input type="number" name="price" placeholder="Price"><br/>
    <label>Discount Percent</label>
    <input type="number" name="discount" placeholder="Discount Percent"><br/>
    <input type="submit" id="submit" value="Discount Calculator"/>
</form>
</body>
</html>