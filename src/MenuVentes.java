import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MenuVentes extends JFrame{
	
	public MenuVentes() {
		setSize(1200, 380);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton afegirLinea = new JButton("+");
		JButton enviar = new JButton("Enviar");
		JButton enrere = new JButton("Enrere");
		
		JTextField client = new JTextField("Nom");
		JTextField data = new JTextField("Data");
		JTextField total = new JTextField("Total");
		
		
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
		
		cp.add(client, posicioCampClient);
		cp.add(data, posicioCampData);
		cp.add(total, posicioCampTotal);
		cp.add(enviar, posicioBotoEnviar);
		cp.add(afegirLinea, posicioBotoAfegirLinea);
		cp.add(enrere, posicioBotoEnrere);
		
		
	}

}
