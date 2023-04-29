import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AltaClient extends JFrame {

	private JLabel etiquetaDNI;
	private JLabel etiquetaNom;
	private JLabel etiquetaCognom;
	private JLabel etiquetaDireccio;
	private JButton alta;
	private JButton enrere;
	private JTextField campDni;
	private JTextField campNom;
	private JTextField campCognom;
	private JTextField campDireccio;

	public AltaClient() {
		setTitle("Menu de Ventas");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panell per les dades
		JPanel panellDades = new JPanel();
		etiquetaDNI = new JLabel("DNI: ");
		etiquetaNom = new JLabel("Nom: ");
		etiquetaCognom = new JLabel("Cognom: ");
		etiquetaDireccio = new JLabel("Direccio: ");
		panellDades.add(etiquetaDNI);
		panellDades.add(etiquetaNom);
		panellDades.add(etiquetaCognom);
		panellDades.add(etiquetaDireccio);
		add(panellDades, "North");
				
		
		

	}

}
