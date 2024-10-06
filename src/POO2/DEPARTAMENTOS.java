package POO2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEPARTAMENTOS extends Container {
    private JPanel Panel2;
    private JButton REGISTRARButton;
    private JButton CONSULTARButton;
    private JTextField nombreTextField;
    private JTextField idTextField;
    private JLabel ID;
    private JLabel Nombre;
    private JTextField areaTextField;
    private JLabel Area;


    public DEPARTAMENTOS() {
        REGISTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
