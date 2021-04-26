<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Insert Title Here</title>

    </head>
        <body>
        <form action="addSelskap">
            <input type ="text" name="selskap_id" ><br>
            <input type = "text" name ="name"> <br>
            <input type="submit"> <br>
        </form>

        <form action="getSelskap">
            <input type ="text" name="selskap_id" ><br>
            <input type="submit"> <br>
        </form>

        <form action="addBoatParking">
            <input type ="text" name="boatParking_id" ><br>
            <input type = "text" name ="locationName"> <br>
            <input type="submit"> <br>
        </form>

        </body>
</html>

