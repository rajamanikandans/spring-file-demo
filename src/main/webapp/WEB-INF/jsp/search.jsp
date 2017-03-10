<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    
        <h2>Search</h2>
        <form method="GET" action="getFile">
            <table>
                <tr>
                    <td>Name: <input type="text" name="name" size="15" /></td>
                </tr>
                <tr>
                    <td>Original Name:<input type="text" name="fileName" size="15" /></td>
                </tr>
                <tr>
                    <td>Size:<input type="text" name="fileSize" size="15" /></td>
                </tr>
                <tr>
                    <td align="center"><input type="submit" value="Search File" /></td>
                </tr>
            </table>
        </form>

</body>
</html>
