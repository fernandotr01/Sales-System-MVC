package Modelo;

public class MMarcas {
    
    private int idmarca;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String indicador;

    public MMarcas() {
    }
    
    public Object[] RegistroMarcas(){
        Object[] fila =  {idmarca,codigo,nombre,descripcion};
        return fila;
    }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
     
}    
