
package hotel;
import java.util.Date;
public class Reserva {
private int numNoches;
private Date fecha;

public Reserva(){}

    public int getNumNoches() {
        return numNoches;
    }

    public void setNumNoches(int numNoches) {
        this.numNoches = numNoches;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


}
