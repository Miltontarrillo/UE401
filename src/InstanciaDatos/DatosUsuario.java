/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanciaDatos;

/**
 *
 * @author MILTON
 */
public class DatosUsuario {
    
private String idusuario ;
private String login;
private String password;
private String estado;
private String fechacreacion;
private String fechamodificacion;
private String idrol;

    public DatosUsuario() {
    }

    public DatosUsuario(String idusuario, String login, String estado, String password,String fechacreacion
            ,String fechamodificacion, String idrol ){
      
        this.idusuario = idusuario;
        this.login = login;
        this.estado = estado;
        this.password = password;
        this.fechacreacion=fechacreacion;
        this.fechamodificacion=fechamodificacion;
        this.idrol=idrol;
        
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

    @Override
    public String toString() {
        return "USUARIO{" + "idusuario=" + idusuario + ", login=" + login + ", password=" + password + ", fechacreacion=" + fechacreacion +
                ", fechamodificacion=" + fechamodificacion +", idrol=" + idrol+'}';
    }
    
}
