/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanciaDatos;
/**
 *
 * @author MILTON
 */
public class DatosTrabajador {
    private String idtrabajador ;
    private String nombre;
    private String apepaterno;
    private String apematerno;
    private String dni;
    private String sexo;
    private String telefono;
    private String direccion;
    private String estado;
    private String idusuario;
    private String idcomputadora;
    private String idarea;
    
    
     public DatosTrabajador() {
    }

    public DatosTrabajador(String idtrabajador, String nombre, String apepaterno, String apematerno, String dni, String sexo,
            String telefono, String direccion, String estado, String idusuario, String idcomputadora, String idarea) {
        
        this.idtrabajador = idtrabajador;
        this.nombre = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
        this.idusuario = idusuario;
        this.idcomputadora = idcomputadora;        
        this.idarea = idarea;
         }

    public String getIdtrabajador() {
        return idtrabajador;
    }

    public void setIdtrabajador(String idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }
    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }
    public String getIdcomputadora() {
        return idcomputadora;
    }

    public void setIdcomputadora(String idcomputadora) {
        this.idcomputadora = idcomputadora;
    }
    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idtrabajador=" + idtrabajador + ", nombre=" + nombre + ", apepaterno=" + apepaterno + ", apematerno=" + apematerno 
                + ",dni=" + dni + ",sexo=" + sexo + ",telefono=" + telefono + ",direccion=" + direccion + ",estado=" + estado
                + ",idusuario=" + idusuario + ",idcomputadora=" + idcomputadora + ",idarea=" + idarea +'}';
    }
    
}
