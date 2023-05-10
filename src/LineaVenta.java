import llibreriapkg.*;
import llibreriapkg.Libro;

public class LineaVenta {
    private Long isbLlibre;
    private int cantidad;
    
    

    public LineaVenta(Long nombreLibro, int cantidad) {
        this.isbLlibre = nombreLibro;
        this.cantidad = cantidad;
    }

    public Long getIsbLlibre() {
		return isbLlibre;
	}

	public int getQuantitat() {
        return cantidad;
    }

    public double getTotal() throws Exception {
    	Long isbn = this.getIsbLlibre();
    	
    	Libro libro = new Libro();
    	Llibreria llibreria = new Llibreria();
    	
    	libro = llibreria.retornarLlibre(isbn).getFirst();
    	
    	Double total = 0.0;
    	
    	total = libro.getPreu() * this.getQuantitat();
    	
    	
    	
    	
        return total;
    }
}
