import javax.swing.JFrame;
import javax.swing.JLabel;

public class PopupOmplirCamps extends JFrame {

    public PopupOmplirCamps(String mensaje) {
        setTitle("Popup");
        JLabel label = new JLabel(mensaje);
        add(label);
        setSize(300, 100);
        setLocationRelativeTo(null);
    }
}
