/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

import ConexionOracle.Conexion;
import InstanciaDatos.DatosUsuario;
import Metodos.MetodoUsuario;
import applogin.usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MILTON
 */
public class OperacionUsuario {
    
    private Connection abrir() {

        Connection con = null;
        /**
         * instanciar la clase conexion
         */
        Conexion obj = new Conexion();
        con = obj.abrirOracle();
        return con;
    }
    
    private void cerrar(Connection con) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean agregarUsuarioNuevo(DatosUsuario datas) {
        boolean resp = false;
        //abrir conexion
        Connection con = abrir();

        MetodoUsuario xd;
        xd = new MetodoUsuario();
        try {
            resp = xd.agregarUser(datas, con);

        } catch (SQLException ex) {
            Logger.getLogger(OperacionUsuario.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            cerrar(con);
        }
        return resp;
    }

    public DatosUsuario buscarUsuarioPorCodigo1(String cod) {

        DatosUsuario pro = null;

        Connection con = abrir();

        MetodoUsuario ppdao = new MetodoUsuario();

        try {
            pro = ppdao.buscarUsuarioPorCodigo(cod, con);
        } catch (SQLException ex) {
            Logger.getLogger(OperacionUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrar(con);
        }
        return pro;
    }
    
}
