/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applogin;

import ConexionOracle.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author MILTON
 */
public class usuario {
    Connection cn;
    public String idusuario,login,password,estado,fechacreacion,fechamodificacion,idrol;
    
    public usuario(){
        Conexion con = new Conexion();
        cn= con.abrirOracle();
    }
    

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
 
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
     public String getFechamodificacion() {
        return fechamodificacion;
    }

    public void setFechamodificacion(String fechamodificacion) {
        this.fechamodificacion = fechamodificacion;
    }
    
    public String getIdRol() {
        return idrol;
    }

    public void setIdRol(String idrol) {
        this.idrol = idrol;
    }
    public void ingreso(){
        try{
            String id;
            
         PreparedStatement cmd = cn.prepareStatement("SELECT LOGIN, PASSWORD FROM USUARIO WHERE LOGIN=?");
         cmd.setString(1,getLogin());
         ResultSet rs = cmd.executeQuery() ;
         
         if(rs.next()){
             id = rs.getString(1);
             this.setPassword(rs.getString(2));        
         }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }        
    }
}
