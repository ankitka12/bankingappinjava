import java.sql.*;
public class Main {
    public static void main(String args[]) throws ClassNotFoundException { //therows keyword is writtened after any method

        String url="jdbc:mysql://localhost:3306/ankit";
        String username="root";
        String password="Ankit@27";
        String quary="Select * from students" ;
        try{
            Class.forName("com.mysql.jdbc.Driver");// statement in " " have all sql drivers of jdbc which we want to load
            System.out.println("drivers loaded");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con=DriverManager.getConnection(url ,username,password);
            System.out.println("connection done");
            Statement stmt=con.createStatement();
            ResultSet rs= stmt.executeQuery(quary);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String mobile=rs.getString("mobile");
                System.out.println("=================");
                System.out.println("=================");
                System.out.println("id:"+" " + id);
                System.out.println("name:" + "  " +name);
                System.out.println("address:" +"  "+address);
                System.out.println("mobile:" +"  "+mobile);
            }
            rs.close();
            stmt.close();
            con.close();
            System.out.println("================");
            System.out.println("connection closed");


        }catch (Exception e){
            System.out.println(e.getMessage());

        }}
    }
