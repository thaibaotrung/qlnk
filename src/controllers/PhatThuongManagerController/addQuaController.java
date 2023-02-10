/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.PhatThuongManagerController;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.PhanQuaModel;
import services.MysqlConnection;
import views.PhatThuongManagerFrame.QuanLyPhanQuaJFrame;
import models.quaModel;

/**
 *
 * @author oOOo
 */
public class addQuaController {
    public boolean insert(quaModel q) throws Exception{
        String sql = "insert into phatqua(ID, hoTen,tuoi, tenphanthuong) values(?,?,?,?)";
        try(
                Connection con = MysqlConnection.getMysqlConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                ){
             pstmt.setInt(1,q.getId());
              pstmt.setString(2, q.getHoTen());
              pstmt.setInt(3, q.getTuoi());
              pstmt.setString(4, q.getTenqua());
                   return pstmt.executeUpdate() > 0;
        }
    }
}
