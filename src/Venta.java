import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private String nombreCliente;
    private Date fecha;
    private ArrayList<LineaVenta> lineasVenta;

    public Venta(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.fecha = new Date();
        this.lineasVenta = new ArrayList<>();
    }

    public void agregarLineaVenta(LineaVenta lineaVenta) {
        lineasVenta.add(lineaVenta);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public ArrayList<LineaVenta> getLineasVenta() {
        return lineasVenta;
    }

    public double getTotal() {
        double total = 0;
        for (LineaVenta lineaVenta : lineasVenta) {
            total += lineaVenta.getTotal();
        }
        return total;
    }
}
