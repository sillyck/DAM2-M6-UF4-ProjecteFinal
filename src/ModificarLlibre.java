import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModificarLlibre extends JFrame {

	private JLabel etiquetaTitol;
	private JLabel etiquetaAutor;
	private JLabel etiquetaISBNAntic;
	private JLabel etiquetaISBN;
	private JLabel etiquetaStock;
	private JLabel etiquetaPVP;
	private JLabel etiquetaDataPublicacio;
	private JLabel etiquetaEditorial;
	private JLabel etiquetaTematica;
	private JLabel etiquetaUbicacio;
	private JLabel etiquetaDataAlta;
	private JTextField campTitol;
	private JTextField campAutor;
	private JTextField campISBNAntic;
	private JTextField campISBN;
	private JTextField campStock;
	private JTextField campPVP;
	private JTextField campDataPublicacio;
	private JTextField campEditorial;
	private JTextField campTematica;
	private JTextField campUbicacio;
	private JTextField campDataAlta;
	private JButton botoEnviar; 
	private JButton botoTornar;

	public ModificarLlibre() {
		super("Alta de un llibre");
		setTitle("Alta de un llibre");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		etiquetaISBNAntic = new JLabel("ISBN:");
		GridBagConstraints constraintsISBNAntic = new GridBagConstraints();
		constraintsISBNAntic.gridx = 0;
		constraintsISBNAntic.gridy = 0;
		constraintsISBNAntic.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBNAntic, constraintsISBNAntic);

		campISBNAntic = new JTextField(10);
		GridBagConstraints constraintsCampISBNAntic = new GridBagConstraints();
		constraintsCampISBNAntic.gridx = 1;
		constraintsCampISBNAntic.gridy = 0;
		constraintsCampISBNAntic.insets = new Insets(10, 10, 10, 0);
		add(campISBNAntic, constraintsCampISBNAntic);
		
		etiquetaISBN = new JLabel("ISBN:");
		GridBagConstraints constraintsISBN = new GridBagConstraints();
		constraintsISBN.gridx = 0;
		constraintsISBN.gridy = 0;
		constraintsISBN.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBN, constraintsISBN);

		campISBN = new JTextField(10);
		GridBagConstraints constraintsCampISBN = new GridBagConstraints();
		constraintsCampISBN.gridx = 1;
		constraintsCampISBN.gridy = 0;
		constraintsCampISBN.insets = new Insets(10, 10, 10, 0);
		add(campISBN, constraintsCampISBN);

		etiquetaTitol = new JLabel("Titol:");
		GridBagConstraints constraintsNom = new GridBagConstraints();
		constraintsNom.gridx = 0;
		constraintsNom.gridy = 1;
		constraintsNom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTitol, constraintsNom);

		campTitol = new JTextField(10);
		GridBagConstraints constraintsCampNom = new GridBagConstraints();
		constraintsCampNom.gridx = 1;
		constraintsCampNom.gridy = 1;
		constraintsCampNom.insets = new Insets(10, 10, 10, 10);
		add(campTitol, constraintsCampNom);

		etiquetaAutor = new JLabel("Autor:");
		GridBagConstraints constraintsCognom = new GridBagConstraints();
		constraintsCognom.gridx = 0;
		constraintsCognom.gridy = 2;
		constraintsCognom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaAutor, constraintsCognom);

		campAutor = new JTextField(10);
		GridBagConstraints constraintsCampCognom = new GridBagConstraints();
		constraintsCampCognom.gridx = 1;
		constraintsCampCognom.gridy = 2;
		constraintsCampCognom.insets = new Insets(10, 10, 10, 10);
		add(campAutor, constraintsCampCognom);
		
		etiquetaStock = new JLabel("Stock:");
		GridBagConstraints constraintsDireccio = new GridBagConstraints();
		constraintsDireccio.gridx = 0;
		constraintsDireccio.gridy = 3;
		constraintsDireccio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaStock, constraintsDireccio);

		campStock = new JTextField(10);
		GridBagConstraints constraintsCampDireccio = new GridBagConstraints();
		constraintsCampDireccio.gridx = 1;
		constraintsCampDireccio.gridy = 3;
		constraintsCampDireccio.insets = new Insets(10, 10, 10, 10);
		add(campStock, constraintsCampDireccio);
		
		etiquetaPVP = new JLabel("PVP:");
		GridBagConstraints constraintsPVP = new GridBagConstraints();
		constraintsPVP.gridx = 0;
		constraintsPVP.gridy = 4;
		constraintsPVP.insets = new Insets(10, 10, 10, 10);
		add(etiquetaPVP, constraintsPVP);

		campPVP = new JTextField(10);
		GridBagConstraints constraintsCampPVP = new GridBagConstraints();
		constraintsCampPVP.gridx = 1;
		constraintsCampPVP.gridy = 4;
		constraintsCampPVP.insets = new Insets(10, 10, 10, 10);
		add(campPVP, constraintsCampPVP);
		
		etiquetaDataPublicacio = new JLabel("Data publicació:");
		GridBagConstraints constraintsDataPublicacio = new GridBagConstraints();
		constraintsDataPublicacio.gridx = 0;
		constraintsDataPublicacio.gridy = 5;
		constraintsDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataPublicacio, constraintsDataPublicacio);

		campDataPublicacio = new JTextField(10);
		GridBagConstraints constraintsCampDataPublicacio = new GridBagConstraints();
		constraintsCampDataPublicacio.gridx = 1;
		constraintsCampDataPublicacio.gridy = 5;
		constraintsCampDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(campDataPublicacio, constraintsCampDataPublicacio);

		etiquetaEditorial = new JLabel("Editorial:");
		GridBagConstraints constraintsEditorial = new GridBagConstraints();
		constraintsEditorial.gridx = 0;
		constraintsEditorial.gridy = 6;
		constraintsEditorial.insets = new Insets(10, 10, 10, 10);
		add(etiquetaEditorial, constraintsEditorial);

		campEditorial = new JTextField(10);
		GridBagConstraints constraintsCampEditorial = new GridBagConstraints();
		constraintsCampEditorial.gridx = 1;
		constraintsCampEditorial.gridy = 6;
		constraintsCampEditorial.insets = new Insets(10, 10, 10, 10);
		add(campEditorial, constraintsCampEditorial);
		
		etiquetaTematica = new JLabel("Tematica:");
		GridBagConstraints constraintsTematica = new GridBagConstraints();
		constraintsTematica.gridx = 0;
		constraintsTematica.gridy = 7;
		constraintsTematica.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTematica, constraintsTematica);

		campTematica = new JTextField(10);
		GridBagConstraints constraintsCampTematica = new GridBagConstraints();
		constraintsCampTematica.gridx = 1;
		constraintsCampTematica.gridy = 7;
		constraintsCampTematica.insets = new Insets(10, 10, 10, 10);
		add(campTematica, constraintsCampTematica);
		
		etiquetaUbicacio = new JLabel("Ubicació:");
		GridBagConstraints constraintsUbicacio = new GridBagConstraints();
		constraintsUbicacio.gridx = 0;
		constraintsUbicacio.gridy = 8;
		constraintsUbicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaUbicacio, constraintsUbicacio);

		campUbicacio = new JTextField(10);
		GridBagConstraints constraintsCampUbicacio = new GridBagConstraints();
		constraintsCampUbicacio.gridx = 1;
		constraintsCampUbicacio.gridy = 8;
		constraintsCampUbicacio.insets = new Insets(10, 10, 10, 10);
		add(campUbicacio, constraintsCampUbicacio);
		
		etiquetaDataAlta = new JLabel("Data alta:");
		GridBagConstraints constraintsDataAlta = new GridBagConstraints();
		constraintsDataAlta.gridx = 0;
		constraintsDataAlta.gridy = 9;
		constraintsDataAlta.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataAlta, constraintsDataAlta);

		campDataAlta = new JTextField(10);
		GridBagConstraints constraintsCampDataAlta = new GridBagConstraints();
		constraintsCampDataAlta.gridx = 1;
		constraintsCampDataAlta.gridy = 9;
		constraintsCampDataAlta.insets = new Insets(10, 10, 10, 10);
		add(campDataAlta, constraintsCampDataAlta);
		
		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 10;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 10;
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
