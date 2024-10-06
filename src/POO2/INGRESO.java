package POO2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class INGRESO extends Container {
    private static JPanel panel1;
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


    public INGRESO() {
        btRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Nombre = tNombre.getText();
                String Apellido = tApellido.getText();
                String Id = tID.getText();

                System.out.println(" Se ha registrado un empleado!");
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("GESTION");
        frame.setContentPane(new INGRESO().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
