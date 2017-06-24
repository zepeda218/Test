package hotel;

public class Cliente {
private int cedula;
private boolean tipoCliente;
private Double descuento;
private String nombre;
    
public Cliente(){}

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(boolean tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
