/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import InstanciaDatos.DatosComputadora;
import InstanciaDatos.DatosTrabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 */
public class MetodoTrabajador {
    
    public boolean agregarTrabajador(DatosTrabajador datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into trabajador values(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);       
        
        ps.setString(1,datas.getIdtrabajador());
        ps.setString(2,datas.getNombre());
        ps.setString(3,datas.getApepaterno());
        ps.setString(4,datas.getApematerno());        
        ps.setString(5,datas.getDni());
        ps.setString(6,datas.getSexo());
        ps.setString(7,datas.getTelefono());
        ps.setString(8,datas.getDireccion());
        ps.setString(9,datas.getEstado());
        ps.setString(10,datas.getIdusuario());
        ps.setString(11,datas.getIdcomputadora());
        ps.setString(12,datas.getIdarea());
        
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;         
         
        return resp;
    }
      
    public DatosTrabajador buscarTrabajador(String xcod,Connection con) throws SQLException{
        
        DatosTrabajador prod=null;
        
        String sql= "select * from trabajador where idtrabajador=?";                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new DatosTrabajador();            
            prod.setIdtrabajador(rs.getString(1));
            prod.setNombre(rs.getString(2));
            prod.setApepaterno(rs.getString(3));
            prod.setApematerno(rs.getString(4));
            prod.setDni(rs.getString(5));
            prod.setSexo(rs.getString(6));
            prod.setTelefono(rs.getString(7));
            prod.setDireccion(rs.getString(8));
            prod.setEstado(rs.getString(9));
            prod.setIdusuario(rs.getString(10));
            prod.setIdcomputadora(rs.getString(11));            
            prod.setIdarea(rs.getString(12));            
          }            
            return prod;
    }

    public boolean eliminarTrabajador(String xcod, Connection con)throws SQLException{
        
        boolean resp=false;
        
        String sql="delete from trabajador where idtrabajador= ?";
        
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
        
         return resp;
    }
     public boolean actualizarTrabajador(DatosTrabajador datas,Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="UPDATE TRABAJADOR SET IDTRABAJADOR=?, NOMBRE=?, ESTADO=? WHERE IDTRABAJADOR=?;";
   
        JOptionPane.showMessageDialog(null,sql.toString());
        PreparedStatement ps=con.prepareStatement(sql);
        //sustituye los ? por los valores
         ps.setString(1, datas.getIdcomputadora());
         ps.setString(2, datas.getNombre());;
         ps.setString(3, datas.getEstado());
         
        int i=ps.executeUpdate();        
        if(i>0)
        resp=true;
        
        return resp;        
    }
    
}
