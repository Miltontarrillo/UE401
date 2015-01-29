/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clear;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MILTON
 */
public class Clear {
    
    public void limpiarCampos(JPanel jPanel1){  

        for(int i=0; jPanel1.getComponents().length>i;i++){ 
           //Limpia todos los JTextField de un JPanel 
            if(jPanel1.getComponents()[i]instanceof JTextField){
               ((JTextField)jPanel1.getComponents()[i]).setText("");
     } 
           //Limpia todos los JPasswordField de un JPanel 
            else if(jPanel1.getComponents()[i] instanceof JPasswordField) 

            { 
               ((JPasswordField)jPanel1.getComponents()[i]).setText(""); 
            }            
   }   
        }    
}
