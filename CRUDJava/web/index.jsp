<%-- 
    Document   : index
    Created on : Mar 14, 2017, 4:00:56 PM
    Author     : JC
--%>
<%@page import="java.sql.*"%>
<%@page import="java.util.Date"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet">
        <title>CRUD</title>
    </head>
    <body>
        <table class="table border">
            <thead>
                <tr>
                    <td>Name</td>
                    <td>Email</td>
                    <td>Telephone</td>
                    <td>Street</td>
                    <td>City</td>
                    <td>State</td>
                    <td>Zip</td>
                </tr>
            </thead>
            <tbody>
        <%
            try {
                String q = "SELECT * FROM customers;";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test/", "root", ""); 
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery(q);
                while(res.next()) {
                    String name = res.getString(1);
                    String email = res.getString(2);
                    int tel = res.getInt(3);
                    String street = res.getString(4);
                    String city = res.getString(5);
                    String state = res.getString(6);
                    String zip = res.getString(7);
                    System.out.println("" + name);
        %>
                <tr>
                    <td><%=name%></td>
                </tr>
        <%
                }
                con.close();
            } catch(Exception e) {
                
            }
        
        %>
            </tbody>
        </table>
        
        <script src="js/bootstrap.js" type="text/javascript"></script>
    </body>
</html>
