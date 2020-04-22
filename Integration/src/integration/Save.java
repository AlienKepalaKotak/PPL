
package integration;
import java.sql.*; 

public class Save{  
    public static String Simpan(String nilai, String urutan){
        String s;
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pencarian","root","asawawu1234");  
            
            Statement stmt=con.createStatement();  
            stmt.executeUpdate("insert into rekampencarian value ("+nilai+","+urutan+")");  
            s="Data ditemukan dan Data berhasil disimpan";
            
        }
        catch(Exception e){
            s="Data ditemukan tapi Data tidak dapat disimpan";
        }  
    return s;
    }
}  
