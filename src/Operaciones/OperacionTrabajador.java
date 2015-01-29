/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import ConexionOracle.Conexion;
import InstanciaDatos.DatosComputadora;
import InstanciaDatos.DatosTrabajador;
import Metodos.MetodoComputadora;
import Metodos.MetodoTrabajador;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MILTON
 */
public class OperacionTrabajador {
    
    private Connection abrir(){
        
        Connection con=null;
        /**
         * instanciar la clase conexion
         */
        Conexion obj=new Conexion();
        con=obj.abrirOracle();
        return con;
    }
    private void cerrar(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
public boolean agregarTrabajador(DatosTrabajador datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();    
    
    MetodoTrabajador xd; 
         xd = new MetodoTrabajador();
        try {
            resp=xd.agregarTrabajador(datas, con);            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OperacionTrabajador.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }    
    
    return resp;       
}    

  public DatosTrabajador buscarTrabajador(String cod){
       
       DatosTrabajador pro = null;

        Connection con = abrir();

        MetodoTrabajador ppdao = new MetodoTrabajador();

        try {
            pro = ppdao.buscarTrabajador(cod, con);
        } catch (SQLException ex) {
            Logger.getLogger(OperacionTrabajador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrar(con);
        }
        return pro;
    }
    
}
