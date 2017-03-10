<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    
        <h2>File Upload demo</h2>
        <form method="post" action="uploadFile" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Name: <input type="text" name="name" size="50" /></td>
                </tr>
                <tr>
                    <td><input type="file" name="fileUpload" size="15" /></td>
                </tr>
                <tr>
                    <td align="center"><input type="submit" value="Upload File" /></td>
                </tr>
            </table>
        </form>

</body>
</html>
