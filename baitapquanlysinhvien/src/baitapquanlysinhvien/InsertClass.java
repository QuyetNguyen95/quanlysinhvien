/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapquanlysinhvien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nguyen Cuong Quyet
 */
public class InsertClass {
      public static void main(String[] args) throws SQLException, ClassNotFoundException {
    Classes.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quan_ly_sinh_vien", "root", "");
    
    String sql = "INSERT INTO class (class_name) VALUES (?);";
    List<Classes> listClass = new ArrayList<Classes>();
    listClass.add(new Classes("Lập trình PHP"));
    PreparedStatement pstmt = con.prepareStatement(sql);
    for (Classes classes : listClass) {
      pstmt.setString(1,classes.getClass_name());
      pstmt.execute();
    }
    con.close();
    System.out.println("Inserted!");
  }

}
