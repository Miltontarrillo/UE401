/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import InstanciaDatos.DatosUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 * private String idusuario ;
private String login;
private String password;
private String estado;
private String fechacreacion;
private String fechamodificacion;
private String idrol;
 */
public class MetodoUsuario {
    
    public boolean agregarUser(DatosUsuario datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into usuario (IDUSUARIO, LOGIN, PASSWORD, ESTADO, IDROL) values(?,?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
         ps.setString(1, datas.getIdusuario());
         ps.setString(2, datas.getLogin());
         ps.setString(3, datas.getPassword());
         ps.setString(4, datas.getEstado());
         ps.setString(5, datas.getIdRol());
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }
    
    public DatosUsuario buscarUsuarioPorCodigo(String xcod,Connection con) throws SQLException{
        
      DatosUsuario prod=null;
        
        String sql="select * from usuario where idusuario=?";
                
        
        PreparedStatement ps=con.prepareStatement(sql);
       
        ps.setString(1, xcod);
        ResultSet rs=ps.executeQuery();
                   
        //recorre el rs y extrae la datapara poner
          if(rs.next())
          {
            prod=new DatosUsuario();
            
            prod.setIdusuario(rs.getString(1));
            prod.setLogin(rs.getString(2));
            prod.setPassword(rs.getString(3));
            prod.setEstado(rs.getString(4));            
            prod.setIdRol(rs.getString(5));
            
          } 
            return prod;
    }

    public boolean eliminarRegistroUsuario(String xcod, Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="delete from usuario where idusuario= ?";
       
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1, xcod);
        //int i=st.executeUpdate(sql);
        int i=st.executeUpdate();
       
         return resp;
    }
     public boolean actualizarRegistroUsuario(DatosUsuario datas,Connection con)throws SQLException{
        boolean resp=false;
        
        String sql="UPDATE USUARIO SET IDUSUARIO=? LOGIN=? PASSWORD=?, ESTADO=?, IDROL=? WHERE IDUSUARIO=?;";
   
        JOptionPane.showMessageDialog(null,sql.toString());
        PreparedStatement ps=con.prepareStatement(sql);
        //sustituye los ? por los valores
         ps.setString(1,datas.getIdusuario());
         ps.setString(2, datas.getLogin());
         ps.setString(3, datas.getPassword());
         ps.setString(4, datas.getEstado());
         ps.setString(5, datas.getIdRol());
         
        int i=ps.executeUpdate();        
        if(i>0)
        resp=true;
        
        return resp;
        
    }
    
}
