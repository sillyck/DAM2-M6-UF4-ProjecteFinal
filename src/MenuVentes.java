import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MenuVentes extends JFrame implements LineaVentaListener {

    private ArrayList<LineaVenta> listaLineasVenta;
    private JTable tablaVentas;
    private DefaultTableModel modeloTablaVentas;
    private JLabel etiquetaCliente;
    private JLabel etiquetaFecha;
    private JLabel etiquetaTotal;
    private JTextField campoCliente;
    private JTextField campoFecha;
    private JButton botonAnadir;
    private MenuLineaVenta menuLineaVenta;
    

    public MenuVentes() {
        listaLineasVenta = new ArrayList<LineaVenta>();
        setTitle("Menu de Ventas");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel para los datos de la venta
        JPanel panelDatosVenta = new JPanel();
        etiquetaCliente = new JLabel("Cliente:");
        etiquetaFecha = new JLabel("Fecha:");
        campoCliente = new JTextField(10);
        campoFecha = new JTextField(10);
        panelDatosVenta.add(etiquetaCliente);
        panelDatosVenta.add(campoCliente);
        panelDatosVenta.add(etiquetaFecha);
        panelDatosVenta.add(campoFecha);
        add(panelDatosVenta, "North");

        // Panel para la tabla de ventas
        modeloTablaVentas = new DefaultTableModel();
        modeloTablaVentas.addColumn("Libro");
        modeloTablaVentas.addColumn("Cantidad");
        modeloTablaVentas.addColumn("Precio");
        tablaVentas = new JTable(modeloTablaVentas);
        JScrollPane scrollTablaVentas = new JScrollPane(tablaVentas);
        add(scrollTablaVentas, "Center");

        // Panel para el total
        etiquetaTotal = new JLabel("Total: $0");
        add(etiquetaTotal, "South");

        // Botón para añadir una línea de venta
        botonAnadir = new JButton("Añadir Libro");
        botonAnadir.addActionListener(e -> {
            menuLineaVenta = new MenuLineaVenta();
            menuLineaVenta.setLineaVentaListener(this);
        });
        add(botonAnadir, "East");

        setVisible(true);
    }

    // Método para agregar una línea de venta a la lista y actualizar la tabla y el total
    public void agregarLineaVenta(LineaVenta lineaVenta) {
        listaLineasVenta.add(lineaVenta);
        modeloTablaVentas.addRow(new Object[]{lineaVenta.getNomLlibre(), lineaVenta.getQuantitat(), lineaVenta.getTotal()});
        double total = 0;
        for (LineaVenta lv : listaLineasVenta) {
            total += lv.getTotal();
        }
        etiquetaTotal.setText(String.format("Total: $%.2f", total));
    }

    // Método del listener para agregar la línea de venta a la lista y actualizar la tabla y el total
    @Override
    public void onLineaVentaAgregada(LineaVentaEvent evento) {
        agregarLineaVenta(evento.getLineaVenta());
    }

}
