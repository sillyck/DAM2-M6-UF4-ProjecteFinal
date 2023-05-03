import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaLlibre extends JFrame {

	private JLabel etiquetaTitol;
	private JLabel etiquetaAutor;
	private JLabel etiquetaISBN;
	private JLabel etiquetaStock;
	private JLabel etiquetaPVP;
	private JLabel etiquetaDataPublicacio;
	private JLabel etiquetaEditorial;
	private JLabel etiquetaTematica;
	private JLabel etiquetaUbicació;
	private JLabel etiquetaDataAlta;
	private JTextField campNom;
	private JTextField campCognom;
	private JTextField campDNI;
	private JTextField campDireccio;
	private JTextField campPVP;
	private JTextField campDataPublicacio;
	private JTextField campEditorial;
	private JTextField campTematica;
	private JTextField campUbicacio;
	private JButton botoEnviar;
	private JButton botoTornar;

	public AltaLlibre() {
		super("Alta de un llibre");
		setTitle("Nou Menu");
		setSize(800, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		etiquetaISBN = new JLabel("DNI:");
		GridBagConstraints constraintsISBN = new GridBagConstraints();
		constraintsISBN.gridx = 0;
		constraintsISBN.gridy = 0;
		constraintsISBN.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBN, constraintsISBN);

		campDNI = new JTextField(10);
		GridBagConstraints constraintsCampDNI = new GridBagConstraints();
		constraintsCampDNI.gridx = 1;
		constraintsCampDNI.gridy = 0;
		constraintsCampDNI.insets = new Insets(10, 10, 10, 0);
		add(campDNI, constraintsCampDNI);

		etiquetaTitol = new JLabel("Nom:");
		GridBagConstraints constraintsNom = new GridBagConstraints();
		constraintsNom.gridx = 0;
		constraintsNom.gridy = 1;
		constraintsNom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTitol, constraintsNom);

		campNom = new JTextField(10);
		GridBagConstraints constraintsCampNom = new GridBagConstraints();
		constraintsCampNom.gridx = 1;
		constraintsCampNom.gridy = 1;
		constraintsCampNom.insets = new Insets(10, 10, 10, 10);
		add(campNom, constraintsCampNom);

		etiquetaAutor = new JLabel("Cognom:");
		GridBagConstraints constraintsCognom = new GridBagConstraints();
		constraintsCognom.gridx = 0;
		constraintsCognom.gridy = 2;
		constraintsCognom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaAutor, constraintsCognom);

		campCognom = new JTextField(10);
		GridBagConstraints constraintsCampCognom = new GridBagConstraints();
		constraintsCampCognom.gridx = 2;
		constraintsCampCognom.gridy = 2;
		constraintsCampCognom.insets = new Insets(10, 10, 10, 10);
		add(campCognom, constraintsCampCognom);
		
		etiquetaStock = new JLabel("Direcció:");
		GridBagConstraints constraintsDireccio = new GridBagConstraints();
		constraintsDireccio.gridx = 0;
		constraintsDireccio.gridy = 3;
		constraintsDireccio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaStock, constraintsDireccio);

		campDireccio = new JTextField(10);
		GridBagConstraints constraintsCampDireccio = new GridBagConstraints();
		constraintsCampDireccio.gridx = 3;
		constraintsCampDireccio.gridy = 3;
		constraintsCampDireccio.insets = new Insets(10, 10, 10, 10);
		add(campDireccio, constraintsCampDireccio);

		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 4;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 4;
		constraintsBotoTornar.insets = new Insets(10, 10, 10, 10);
		add(botoTornar, constraintsBotoTornar);

		setVisible(true);

		botoTornar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tornar();
			}
		});
		
	}
	
	private void tornar() {
		MenuClients menuClients = new MenuClients();
		menuClients.setVisible(true);
		this.dispose();
	}
	
	

}
