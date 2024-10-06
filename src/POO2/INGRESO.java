package POO2;

import java.util.ArrayList;
import javax.swing.*;
import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class INGRESO extends Container {
    private JPanel panel1;
    private JTextField tNombre;
    private JTextField tID;
    private JTextField tApellido;
    private JButton btRegistrar;
    private JButton btEliminar;
    private JButton btSalir;
    private JTextField tTipo;
    private JLabel Id_Empleado;
    private JLabel Nombre;
    private JLabel Tipo_Empleado;
    private JLabel Fecha_Contratacion;
    private JTextField tFecha;
    private JLabel Apellido;
    private List<JTextField> listaPersonas = new ArrayList<JTextField>();




    public INGRESO() {
        btRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre = tNombre.getText();
                String Apellido = tApellido.getText();
                String Id = tID.getText();
                listaPersonas.add(tNombre);
                JOptionPane.showMessageDialog(null,"Registro Exitoso!");
                String reporte ="";
                for (int contador=0;contador<listaPersonas.size();contador++){

                    reporte+=listaPersonas.get(contador).toString();
                }


            }
        });

        btEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(null,"Ingrese el nombre a retirar: ");
                listaPersonas.remove(tNombre);
                JOptionPane.showMessageDialog(null,"Registro Exitoso!");

            }
        });
        btSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("GESTION");
        frame.setContentPane(new INGRESO().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(300,300);
        frame.pack();
        frame.setVisible(true);
    }

}
