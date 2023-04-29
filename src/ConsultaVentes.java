import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ConsultaVentes extends JFrame{
	
	private JButton botoInici, botoSeguent, botoAnterior, botoUltim, botoEnrere;
	private DefaultTableModel taulaConsulta;
	private JTable taulaConsultaPanell;
	public ConsultaVentes() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panell de les dades dels llibres
		JPanel panelDades = new JPanel();
		botoInici = new JButton("Inici");
		botoSeguent = new JButton("Següent");
		botoAnterior = new JButton("Anterior");
		botoUltim = new JButton("Ultim");
		botoEnrere = new JButton("Enrere");
		
		panelDades.add(botoInici);
		panelDades.add(botoSeguent);
		panelDades.add(botoAnterior);
		panelDades.add(botoUltim);
		panelDades.add(botoEnrere);
		add(panelDades, "South");
		
		//Taula per veure les dades dels llibres
		taulaConsulta = new DefaultTableModel();
		taulaConsulta.addColumn("Nom valors");
		taulaConsulta.addColumn("Informació recuperada");
		taulaConsultaPanell = new JTable(taulaConsulta);
		JScrollPane scroll = new JScrollPane(taulaConsultaPanell);
		add(scroll, "Center");
		
		botoEnrere.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tornarAnterior();
			}
		});
	
	}
	
	/**
	 * Fer consulta a BBDD i guardar-ho en una llista de la classe, despres consultar
	 * la llista per poder anar canviant els llibres de la taula
	 */
	public void afegirLineaATaula() {
		
		
		
	}
	
	private void tornarAnterior() {
		MenuConsulta menuConsulta = new MenuConsulta();
		menuConsulta.setVisible(true);
		this.dispose();	
	}
	
	
}
