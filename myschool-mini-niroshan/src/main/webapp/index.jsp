<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add student details</h1>
        <form method="post" action="controller">
            <table><tr><th> Student Name:</th>
                    <td> <select name="stuName">
                            <option>Nirosh</option>
                            <option>Raja</option>
                            <option>Mani</option>
                            <option>Kiri</option>
                            <option>Keerthika</option>
                            <option>Meera</option>
                            <option>Vanaja</option>
                        </select></td></tr>
                <tr><th>Grade:</th><td><select name="grade">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                        </select> </td></tr>
                <tr><th>Subject:</th><td><input type="text" name="subject" /> </td></tr>
                <tr><th>Marks:</th><td> <input type="text" name="marks" value="" size="5" /></td></tr>
                <tr><td> <input type="submit" value="Add" /></td><td> <input type="reset" value="Reset" /></td></tr>
            </table>
        </form>
    </body>
</html>
