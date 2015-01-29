/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import InstanciaDatos.DatosArea;
import InstanciaDatos.DatosComputadora;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 */
public class MetodoComputadora {
    
     public boolean agregarComputadora(DatosComputadora datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into computadora values(?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);       
        
        ps.setString(1,datas.getIdcomputadora());
        ps.setString(2,datas.getNombrepc());
        ps.setString(3,datas.getIp());
        ps.setString(4,datas.getSo());        
        ps.setString(5,datas.getEstado());
        
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;         
         
        return resp;
    }
      
    public DatosComputadora buscarComputadora(String xcod,Connection con) throws SQLException{
        
        DatosComputadora prod=null;
        
        String sql= "select * from computadora where idcomputadora=?";                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new DatosComputadora();            
            prod.setIdcomputadora(rs.getString(1));
            prod.setNombrepc(rs.getString(2));
            prod.setIp(rs.getString(3));
            prod.setSo(rs.getString(4));
            prod.setEstado(rs.getString(5));            
          }            
            return prod;
    }

    public boolean eliminarComputadora(String xcod, Connection con)throws SQLException{
        
        boolean resp=false;
        
        String sql="delete from computadora where idcomputadora= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
         return resp;
    }
     public boolean actualizarComputadora(DatosComputadora datas,Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="UPDATE COMPUTADORA SET IDCOMPUTADORA=?, NOMBREPC=?, IP=?, SO=?, ESTADO=? WHERE IDAREA=?;";
   
        JOptionPane.showMessageDialog(null,sql.toString());
        PreparedStatement ps=con.prepareStatement(sql);
        //sustituye los ? por los valores
         ps.setString(1, datas.getIdcomputadora());
         ps.setString(2, datas.getNombrepc());
         ps.setString(3, datas.getIp());
         ps.setString(3, datas.getSo());
         ps.setString(3, datas.getEstado());
         
        int i=ps.executeUpdate();        
        if(i>0)
        resp=true;
        
        return resp;        
    }        
}
