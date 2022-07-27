package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import Principal.*;

public class CPrincipal implements ActionListener{
    
    VPrincipal vistprincipal;
    
    public CPrincipal(VPrincipal VMAIN1){
        vistprincipal = VMAIN1;
        vistprincipal.setVisible(true); 
        Main.VLOG1.setVisible(false);
        vistprincipal.btnClientesmain.addActionListener(this);
        vistprincipal.btnProveedormain.addActionListener(this);
        vistprincipal.btnMarcasmain.addActionListener(this);
        vistprincipal.btnProductosmain.addActionListener(this);
        vistprincipal.btnUsuariosmain.addActionListener(this);
        vistprincipal.btnNuevaventa.addActionListener(this);
     
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistprincipal.btnClientesmain){
            Main.VC1 = new VClientes();
            Main.controlclf1 = new CClientes (Main.VC1);
            vistprincipal.jpanelContenedor.add(Main.VC1);
            Main.VC1.setVisible(true);     
            
        }  
        if(e.getSource() == vistprincipal.btnProveedormain){
            Main.VP1 = new VProveedores();
            Main.controlproveedf2 = new CProveedores(Main.VP1);
            vistprincipal.jpanelContenedor.add(Main.VP1);
            Main.VP1.setVisible(true);          
        }
        if(e.getSource() == vistprincipal.btnMarcasmain){
            Main.VM1 = new VMarcas();
            Main.controlmarcf4 = new CMarcas (Main.VM1);
            vistprincipal.jpanelContenedor.add(Main.VM1);
            Main.VM1.setVisible(true);          
        }
        if(e.getSource() == vistprincipal.btnProductosmain){
            Main.VPR1= new VProductos();
            Main.controlproduf5 = new CProductos (Main.VPR1);
            vistprincipal.jpanelContenedor.add(Main.VPR1);
            Main.VPR1.setVisible(true);          
        }
        if(e.getSource() == vistprincipal.btnUsuariosmain){
            Main.VU1= new VUsuarios();
            Main.controlusuarf3 = new CUsuarios (Main.VU1);
            vistprincipal.jpanelContenedor.add(Main.VU1);
            Main.VU1.setVisible(true);          
        }   
        if(e.getSource() == vistprincipal.btnNuevaventa){
            Main.VV1= new VVentas();
            Main.controvent1 = new CVentas (Main.VV1);
            vistprincipal.jpanelContenedor.add(Main.VV1);
            Main.VV1.setVisible(true);          
        } 
    }    
}
