package DAO;

import Formato.Mensajes;

public class RecuperarIds extends Conexion {
    
// METODO QUE RECUPERA EL IDMARCAPOR MEDIO DEL NOMBRE DE LA COMPAÑIA

    
public int RecuperarIdMarcas(String nommarc){
    int idmarc=0;
    try{
        rs = st.executeQuery("SELECT idmarca FROM marcas WHERE indicador='S' AND nombre='"+nommarc+"';");
        if(rs.next()){
            idmarc=rs.getInt(1);
        }        
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede recuperar el ID MARCA"+ex);
    }    
    return idmarc;
}

//METODO QUE RECUPERA EL IDPROVEEDOR POR MEDIO DEL NOMBRE DE LA COMPAÑIA


public int RecuperarIdProveedor(String nomproveed){
    int idproveed=0;
    try{        
        ps = conexion.prepareStatement("SELECT idproveedor FROM proveedores WHERE indicador='S' AND nombre=?;");
        ps.setString(1,nomproveed);
        rs = ps.executeQuery();
        if(rs.next()){
            idproveed = rs.getInt(1);
        }
    }catch(Exception ex){
        Mensajes.M1("ERROR no se puede recuperar ID PROVEEDOR"+ex);
    }
    return idproveed;
    }
}
