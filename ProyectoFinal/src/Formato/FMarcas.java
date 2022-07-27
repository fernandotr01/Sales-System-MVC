package Formato;

import Modelo.MMarcas;
import Vista.VMarcas;

public class FMarcas {
       public static void PresentacionMarcas(VMarcas VM1){
        VM1.setTitle("Formulario Mantenimiento de Marcas");     
    }
    public static void LimpiarEntradasMarcas(VMarcas VM1){
        VM1.txtIdmarca.setText("");
        VM1.txtCodigomarca.setText("");
        VM1.txtNombremarca.setText("");
        VM1.txtDescripcionmarca.setText("");
        VM1.txtCodigomarca.requestFocus();
    }
    
    public static MMarcas LeerMarcas(VMarcas VM1){
        MMarcas marc = new MMarcas();
        marc.setCodigo(VM1.txtCodigomarca.getText());
        marc.setNombre(VM1.txtNombremarca.getText());
        marc.setDescripcion(VM1.txtDescripcionmarca.getText());
        marc.setIndicador("S");
        return marc;
    }
    
    public static void EstadoMarcas1(VMarcas VM1){
        VM1.btnRegistrarmarca.setEnabled(true);
        VM1.btnConsultarmarca.setEnabled(true);
        VM1.btnActualizarmarca.setEnabled(false);
        VM1.btnEliminarmarca.setEnabled(false);
    }
    
    public static void EstadoMarcas2(VMarcas VM1){
        VM1.btnRegistrarmarca.setEnabled(false);
        VM1.btnConsultarmarca.setEnabled(true);
        VM1.btnActualizarmarca.setEnabled(true);
        VM1.btnEliminarmarca.setEnabled(true);
    }
  
}    
