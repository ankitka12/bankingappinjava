import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class deleteque {
    public static void main(String args[]) throws ClassNotFoundException { //therows keyword is writtened after any method

        String url="jdbc:mysql://localhost:3306/ankit";
        String username="root";
        String password="Ankit@27";
        String quary="delete from students where id =3" ;
        try{
            Class.forName("com.mysql.jdbc.Driver");// statement in " " have all sql drivers of jdbc which we want to load
            System.out.println("drivers loaded");

        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con= DriverManager.getConnection(url ,username,password);
            System.out.println("connection done");
            Statement stmt=con.createStatement();
            int rowsaffected=stmt.executeUpdate(quary);
            if(rowsaffected>0){
                System.out.println("deletion sucessfull"+" "+rowsaffected+" "+"rows effected");
            }
            else {
                System.out.println("failed");
            }


            stmt.close();
            con.close();
            System.out.println("================");
            System.out.println("connection closed");


        }catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}


