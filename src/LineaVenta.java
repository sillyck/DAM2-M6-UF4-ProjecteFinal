import llibreriapkg.*;

public class LineaVenta {
    private int isbLlibre;
    private int cantidad;
    
    

    public LineaVenta(int nombreLibro, int cantidad) {
        this.isbLlibre = nombreLibro;
        this.cantidad = cantidad;
    }

    public int getIsbLlibre() {
		return isbLlibre;
	}

	public int getQuantitat() {
        return cantidad;
    }

    public double getTotal() {
    	int isbn = this.getIsbLlibre();
    	
    	Libro libro = new Libro();
    	Llibreria llibreria = new Llibreria();
    	
    	llibreria.retornarLlibre(isbn);
    	
    	
    	
    	
        return 0;
    }
}
