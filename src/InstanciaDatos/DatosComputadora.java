/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InstanciaDatos;

/**
 *
 * @author MILTON
 */
public class DatosComputadora {
    private String idcomputadora ;
    private String nombrepc;
    private String ip;
    private String so;
    private String estado;
    
    public DatosComputadora() {
    }

    public DatosComputadora(String idcomputadora, String nombrepc, String ip, String so, String estado) {
        this.idcomputadora = idcomputadora;
        this.nombrepc = nombrepc;
        this.ip = ip;
        this.so = so;
        this.estado = estado;
         }

    public String getIdcomputadora() {
        return idcomputadora;
    }

    public void setIdcomputadora(String idcomputadora) {
        this.idcomputadora = idcomputadora;
    }

    public String getNombrepc() {
        return nombrepc;
    }

    public void setNombrepc(String nombrepc) {
        this.nombrepc = nombrepc;
    }
    
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idcomputadora=" + idcomputadora + ", nombrepc=" + nombrepc + ", ip=" + ip + ", so=" + so + ",estado=" + estado +'}';
    }
    
}
