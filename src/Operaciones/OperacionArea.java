/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import ConexionOracle.Conexion;
import InstanciaDatos.DatosArea;
import InstanciaDatos.DatosUsuario;
import JFrameListar.ListarArea;
import Metodos.MetodoArea;
import Metodos.MetodoUsuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MILTON
 */
public class OperacionArea { 
    
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
    
public boolean agregarArea(DatosArea datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    MetodoArea xd; 
         xd = new MetodoArea();
        try {
            resp=xd.agregarArea(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(OperacionArea.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }    
    
    return resp;   
    
}    

  public DatosArea buscarArea(String cod){
       
       DatosArea pro = null;

        Connection con = abrir();

        MetodoArea ppdao = new MetodoArea();

        try {
            pro = ppdao.buscarArea(cod, con);
        } catch (SQLException ex) {
            Logger.getLogger(OperacionArea.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrar(con);
        }
        return pro;
    } 
    
}
