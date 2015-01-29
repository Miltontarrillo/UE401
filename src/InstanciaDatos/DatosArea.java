/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanciaDatos;

/**
 *
 * @author MILTON
 */
public class DatosArea {
    
private String idarea ;
private String nombrearea;
private String estado;

    public DatosArea() {
    }

    public DatosArea(String idarea, String nombrearea, String estado) {
        this.idarea = idarea;
        this.nombrearea = nombrearea;
        this.estado = estado;
         }

    public String getIdarea() {
        return idarea;
    }

    public void setIdarea(String idarea) {
        this.idarea = idarea;
    }

    public String getNombrearea() {
        return nombrearea;
    }

    public void setNombrearea(String nombrearea) {
        this.nombrearea = nombrearea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Area{" + "idarea=" + idarea + ", nombrearea=" + nombrearea + ", estado=" + estado +'}';
    }
    
}
