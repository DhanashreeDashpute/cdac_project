<html>
<body>
    <h2>Edit Product</h2>
    <form action="/products/update/${product.id}" method="post">
        Name: <input type="text" name="name" value="${product.name}"/><br/>
        Price: <input type="text" name="price" value="${product.price}"/><br/>
        Description: <textarea name="description">${product.description}</textarea><br/>
        <input type="submit" value="Update"/>
    </form>
</body>
</html>
