<html>
<body>
    <h2>Add New Product</h2>
    <form action="/products/create" method="post">
        Name: <input type="text" name="name"/><br/>
        Price: <input type="text" name="price"/><br/>
        Description: <textarea name="description"></textarea><br/>
        <input type="submit" value="Save"/>
    </form>
</body>
</html>
