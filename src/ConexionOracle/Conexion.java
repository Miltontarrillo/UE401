/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author MILTON
 */
public class Conexion {
    public ResultSet rs=null;
            public Statement ts=null ;
            public Connection con=null;
            
            
            
    public Connection abrirOracle(){       

    try{
        
   DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","ue","ue");
   ts=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);
   System.out.println("La conexion se realizo con exito");     
        
    }catch(Exception e){
        System.out.println("Error de conexion: "+e.toString());
    }
      return con;
    }
    
}
