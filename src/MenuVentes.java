import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MenuVentes extends JFrame implements LineaVentaListener {

	private MenuLineaVenta menuLineaVenta;
	private JTextArea textArea;

	JTextField client = new JTextField("Nom");
	JTextField dataField = new JTextField("Data");
	JTextField totalField = new JTextField("Total");

	public MenuVentes() {
		setSize(1200, 380);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton afegirLinea = new JButton("+");
		JButton enviar = new JButton("Enviar");
		JButton enrere = new JButton("Enrere");

		Container cp = getContentPane();
		cp.setLayout(new GridBagLayout());

		GridBagConstraints posicioBotoAfegirLinea = new GridBagConstraints();
		posicioBotoAfegirLinea.gridx = 0;
		posicioBotoAfegirLinea.gridy = 0;
		posicioBotoAfegirLinea.insets = new Insets(100, 50, 0, 0);

		GridBagConstraints posicioBotoEnviar = new GridBagConstraints();
		posicioBotoEnviar.gridx = 0;
		posicioBotoEnviar.gridy = 0;
		posicioBotoEnviar.insets = new Insets(100, 200, 0, 0);

		GridBagConstraints posicioBotoEnrere = new GridBagConstraints();
		posicioBotoEnrere.gridx = 0;
		posicioBotoEnrere.gridy = 0;
		posicioBotoEnrere.insets = new Insets(100, 400, 0, 0);

		GridBagConstraints posicioCampClient = new GridBagConstraints();
		posicioCampClient.gridx = 0;
		posicioCampClient.gridy = 0;
		posicioCampClient.insets = new Insets(0, 0, 0, 100);

		GridBagConstraints posicioCampData = new GridBagConstraints();
		posicioCampData.gridx = 0;
		posicioCampData.gridy = 0;
		posicioCampData.insets = new Insets(0, 0, 0, 0);

		GridBagConstraints posicioCampTotal = new GridBagConstraints();
		posicioCampTotal.gridx = 0;
		posicioCampTotal.gridy = 0;
		posicioCampTotal.insets = new Insets(0, 100, 0, 0);
		
		textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        menuLineaVenta = new MenuLineaVenta();
        menuLineaVenta.addLineaVentaListener(this);

		cp.add(client, posicioCampClient);
		cp.add(dataField, posicioCampData);
		cp.add(totalField, posicioCampTotal);
		cp.add(enviar, posicioBotoEnviar);
		cp.add(afegirLinea, posicioBotoAfegirLinea);
		cp.add(enrere, posicioBotoEnrere);

		afegirLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}


	 @Override
	    public void agregarLineaVenta(LineaVenta lineaVenta) {
	        // Agregar nueva linea de venta a la lista
	        lineasVenta.add(lineaVenta);

	        // Actualizar modelo de la tabla
	        modeloTabla.setLineasVenta(lineasVenta);

	        // Actualizar total de la venta
	        double totalVenta = 0;
	        for (LineaVenta lv : lineasVenta) {
	            totalVenta += lv.getPrecioTotal();
	        }
	        menuLineaVenta.setTotal(totalVenta);
	    }

}
