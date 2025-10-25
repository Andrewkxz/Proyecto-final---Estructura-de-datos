package modelo;
public class EquipoRescate {

    private String tipo;
    private String ubicacion;

    public EquipoRescate(String tipo, String ubicacion) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }   
}
