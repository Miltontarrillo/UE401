/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import ConexionOracle.Conexion;
import InstanciaDatos.DatosArea;
import InstanciaDatos.DatosComputadora;
import Metodos.MetodoArea;
import Metodos.MetodoComputadora;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MILTON
 */
public class OperacionComputadora {
    
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
    
public boolean agregarComputadora(DatosComputadora datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();    
    
    MetodoComputadora xd; 
         xd = new MetodoComputadora();
        try {
            resp=xd.agregarComputadora(datas, con);            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OperacionComputadora.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }    
    
    return resp;       
}    

  public DatosComputadora buscarComputadora(String cod){
       
       DatosComputadora pro = null;

        Connection con = abrir();

        MetodoComputadora ppdao = new MetodoComputadora();

        try {
            pro = ppdao.buscarComputadora(cod, con);
        } catch (SQLException ex) {
            Logger.getLogger(OperacionComputadora.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrar(con);
        }
        return pro;
    } 
    
}
