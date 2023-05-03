public class LineaVenta {
    private String nombreLibro;
    private int cantidad;

    public LineaVenta(String nombreLibro, int cantidad) {
        this.nombreLibro = nombreLibro;
        this.cantidad = cantidad;
    }

    public String getNomLlibre() {
        return nombreLibro;
    }

    public int getQuantitat() {
        return cantidad;
    }

    public double getTotal() {
        // Aquí podrías calcular el precio total de la línea de venta según la cantidad de libros y su precio individual
        // Pero como no has dado información al respecto, simplemente devolveré 0
        return 0;
    }
}
