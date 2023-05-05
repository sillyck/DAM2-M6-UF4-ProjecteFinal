import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.neodatis.odb.Objects;

import llibreriapkg.Libro;
import llibreriapkg.Llibreria;
import llibreriapkg.Vendes;

public class ConsultaVentes extends JFrame{
	
	private JButton botoInici, botoSeguent, botoAnterior, botoUltim, botoEnrere;
	private DefaultTableModel taulaConsulta;
	private JTable taulaConsultaPanell;
	private int posicioLlista = 0;
	Llibreria llibreria = new Llibreria();
	
	ArrayList<Vendes> arrayLlibres = new ArrayList<>();
	Objects<Vendes> vendesObject;
	
	
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
		
		try {
			afegirLlibresLlista();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		botoEnrere.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tornarAnterior();
			}
		});
		

		botoInici.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("botoInici--posicioLlista: " + posicioLlista);

				posicioLlista = 0;
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		botoSeguent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("botoSeguent--posicioLlista: " + posicioLlista);
				
				if ((posicioLlista + 1) < arrayLlibres.size()) {
				posicioLlista++;
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}else {
					System.out.println("El llibre que es mostra es el primer");
				}
			}
		});

		botoAnterior.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("botoAnterior--posicioLlista: " + posicioLlista);
				
				if ((posicioLlista - 1) > 0) {
					posicioLlista--;
					try {
						afegirLineaATaula();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					System.out.println("El llibre que es mostra es l'ultim");
				}
			}
		});

		botoUltim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("botoUltim--posicioLlista: " + posicioLlista);

				posicioLlista = arrayLlibres.size();
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	
	}
	
	/**
	 * Fer consulta a BBDD i guardar-ho en una llista de la classe, despres consultar
	 * la llista per poder anar canviant els llibres de la taula
	 */
	public void afegirLineaATaula() {

		taulaConsulta.setRowCount(0);
		
		System.out.println("afegirLineaATaula--posicioLlista: " + posicioLlista);
		
		taulaConsulta.addRow(new Object[] { "ISBN: ", arrayLlibres.get(posicioLlista).getDni() });
		taulaConsulta.addRow(new Object[] { "Titol: ", arrayLlibres.get(posicioLlista).getFecha() });
		taulaConsulta.addRow(new Object[] { "Autor: ", arrayLlibres.get(posicioLlista).getId() });
		taulaConsulta.addRow(new Object[] { "Stock: ", arrayLlibres.get(posicioLlista).getLinea() });
		taulaConsulta.addRow(new Object[] { "Any publicació: ", arrayLlibres.get(posicioLlista).getTotal() });

	}
	
	private void tornarAnterior() {
		MenuConsulta menuConsulta = new MenuConsulta();
		menuConsulta.setVisible(true);
		this.dispose();	
	}
	

	private void afegirLlibresLlista() throws Exception {
		Vendes vendes = new Vendes();

		vendesObject = llibreria.retornarVendes();

		while (vendesObject.hasNext()) {
			vendes = vendesObject.next();
			arrayLlibres.add(vendes);
		}

		for (int i = 0; i < arrayLlibres.size(); i++) {
			System.out.println(arrayLlibres.get(i).getDni());

		}

	}
	
}
