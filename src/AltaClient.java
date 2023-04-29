import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaClient extends JFrame {

	private JLabel etiquetaNom;
	private JLabel etiquetaCognom;
	private JLabel etiquetaDNI;
	private JLabel etiquetaDireccio;
	private JTextField campNom;
	private JTextField campCognom;
	private JTextField campDNI;
	private JTextField campDireccio;
	private JButton botoEnviar;
	private JButton botoTornar;

	public AltaClient() {
		super("Ventana con campos de texto");
		setTitle("Nou Menu");
		setSize(800, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		etiquetaDNI = new JLabel("DNI:");
		GridBagConstraints constraintsDni = new GridBagConstraints();
		constraintsDni.gridx = 0;
		constraintsDni.gridy = 0;
		constraintsDni.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDNI, constraintsDni);

		campDNI = new JTextField(10);
		GridBagConstraints constraintsCampDNI = new GridBagConstraints();
		constraintsCampDNI.gridx = 1;
		constraintsCampDNI.gridy = 0;
		constraintsCampDNI.insets = new Insets(10, 10, 10, 0);
		add(campDNI, constraintsCampDNI);

		etiquetaNom = new JLabel("Nom:");
		GridBagConstraints constraintsNom = new GridBagConstraints();
		constraintsNom.gridx = 0;
		constraintsNom.gridy = 1;
		constraintsNom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaNom, constraintsNom);

		campNom = new JTextField(10);
		GridBagConstraints constraintsCampNom = new GridBagConstraints();
		constraintsCampNom.gridx = 1;
		constraintsCampNom.gridy = 1;
		constraintsCampNom.insets = new Insets(10, 10, 10, 10);
		add(campNom, constraintsCampNom);

		etiquetaCognom = new JLabel("Cognom:");
		GridBagConstraints constraintsCognom = new GridBagConstraints();
		constraintsCognom.gridx = 0;
		constraintsCognom.gridy = 2;
		constraintsCognom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaCognom, constraintsCognom);

		campCognom = new JTextField(10);
		GridBagConstraints constraintsCampCognom = new GridBagConstraints();
		constraintsCampCognom.gridx = 2;
		constraintsCampCognom.gridy = 2;
		constraintsCampCognom.insets = new Insets(10, 10, 10, 10);
		add(campCognom, constraintsCampCognom);
		
		etiquetaDireccio = new JLabel("Direcció:");
		GridBagConstraints constraintsDireccio = new GridBagConstraints();
		constraintsDireccio.gridx = 0;
		constraintsDireccio.gridy = 3;
		constraintsDireccio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDireccio, constraintsDireccio);

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

	}

}
