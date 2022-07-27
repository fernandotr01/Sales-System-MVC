package Modelo;

public class MProveedores {
    
    private int idproveedor;
    private String ruc;
    private String codigo;
    private String nombre;
    private String telefono;
    private String direccion;
    private String indicador;

    public MProveedores() {        
    }
    
    public Object[] RegistroProveedores(int num){
        Object[] fila =  {idproveedor,ruc,codigo,nombre,telefono,direccion};
        return fila;
    } 
    

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
}
