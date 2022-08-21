import javax.swing.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class SqlQueries {
    static String query = null;
    public SqlQueries(String query){
        SqlQueries.query = query;
    }
    Map<String, Object> resultList = new HashMap<>();

    public boolean entryExists(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/astronomical_objects", "root", "1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if(!rs.next()){
                throw new ExceptionClass("Cannot find object. Please try again");
            }
        }
        catch(ExceptionClass exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return true;
    }
    public Map<String, Object> getResult(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/astronomical_objects", "root", "1234");
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            while (rs.next()) {
                for (int i = 1; i <= metaData.getColumnCount(); i++) {
                    resultList.put(metaData.getColumnName(i), rs.getObject(i));
                }
            }
            con.close();
            return resultList;
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
        return resultList;
    }

    public void updateTable(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/astronomical_objects", "root", "1234");
            Statement stmt = con.createStatement();
            int success =stmt.executeUpdate(query);

            if(success != 0){
                JOptionPane.showMessageDialog(null, "Entry successfully inserted!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Unknown error occurred. Please try again.\n");
            }
            con.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

    public void removeEntry(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/astronomical_objects", "root", "1234");
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.execute();
            JOptionPane.showMessageDialog(null, "Entry deleted successfully!\n");
            con.close();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }

}