import java.util.EventObject;

public class LineaVentaEvent extends EventObject {

    private String nombreLibro;
    private int cantidad;

    public LineaVentaEvent(Object source, String nombreLibro, int cantidad) {
        super(source);
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

}
