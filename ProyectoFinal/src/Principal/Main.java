package Principal;

import Vista.*;
import Controlador.*;

public class Main {
    
    //VISTA CLIENTES Y CONTROLADOR
    public static VClientes VC1;
    public static CClientes controlclf1;
    
    //VISTA PROVEEDORES Y CONTROLADOR
    public static VProveedores VP1;
    public static CProveedores controlproveedf2;
    
    //VISTA USUARIOS Y CONTROLADOR
    public static VUsuarios VU1;
    public static CUsuarios controlusuarf3;
    
    //VISTA MARCAS Y CONTROLADOR
    public static VMarcas VM1;
    public static CMarcas controlmarcf4;
    
    //VISTA PRODUCTOS Y CONTROLADOR
    public static VProductos VPR1;
    public static CProductos controlproduf5;
    
    //VISTA LOGIN Y CONTROLADOr   
    public static VLogin VLOG1;
    public static CLogin contrologf6;
    
    //VISTA VENTAS Y CONTROLADOR   
    public static VVentas VV1;
    public static CVentas controvent1;
       
    //VISTA PRINCIPAL Y CONTROLADOR
    public static VPrincipal VMAIN1;
    public static CPrincipal controlprincipalf7;
    
    
    public static void main(String[] args) {
        
        VLOG1 = new VLogin();
        VLOG1.setVisible(true);
        contrologf6 = new CLogin(VLOG1);
       
    }
    
}
