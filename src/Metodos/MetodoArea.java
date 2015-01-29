/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import InstanciaDatos.DatosArea;
import InstanciaDatos.DatosUsuario;
import JFrameListar.ListarArea;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 */
public class MetodoArea {
    
    public boolean agregarArea(DatosArea datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into area values(?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);       
        
        ps.setString(1,datas.getIdarea());
        ps.setString(2,datas.getNombrearea());
        ps.setString(3,datas.getEstado());
        
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
      
    public DatosArea buscarArea(String xcod,Connection con) throws SQLException{
        
        DatosArea prod=null;
        
        String sql="select * from area where idarea=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new DatosArea();            
            prod.setIdarea(rs.getString(1));
            prod.setNombrearea(rs.getString(2));
            prod.setEstado(rs.getString(3));            
          }            
                return prod;
    }

    public boolean eliminarArea(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from area where idarea= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
         return resp;
    }
     public boolean actualizarArea(DatosArea datas,Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="UPDATE AREA SET IDAREA=? NOMBREAREA=? ESTADO=? WHERE IDAREA=?;";
   
        JOptionPane.showMessageDialog(null,sql.toString());
        PreparedStatement ps=con.prepareStatement(sql);
        //sustituye los ? por los valores
         ps.setString(1, datas.getIdarea());
         ps.setString(2, datas.getNombrearea());
         ps.setString(3, datas.getEstado());
         
        int i=ps.executeUpdate();        
        if(i>0)
        resp=true;
        
        return resp;        
    }    
}
