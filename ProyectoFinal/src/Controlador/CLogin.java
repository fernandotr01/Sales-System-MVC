
package Controlador;

import Formato.Mensajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Principal.*;

public class CLogin implements ActionListener{
    
    VLogin vistlog;
    
    public CLogin(VLogin VLOG1){
        vistlog = VLOG1;
        vistlog.btnIngresarlogin.addActionListener(this);   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistlog.btnIngresarlogin){
            //CODIGO PARA VALIDAR CODIGO Y CLAVE
            String codigo = vistlog.txtCodigo.getText();
            String contraseña = vistlog.txtContraseña.getText();
            
            if (codigo.equals("ADM001") && contraseña.equals("ADM3101")){
                Main.VMAIN1 = new VPrincipal();
                Main.controlprincipalf7 = new CPrincipal(Main.VMAIN1); 
                Mensajes.M1("Bienvendio al sistema de MOBTECH");        
            }else{
                Mensajes.M1("Verifique su codigo o contraseña");   
                
            }
                               
        } 
        
    }
    
}
