package org.example;

import javax.swing.*;

public class FormChelin extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton tumbaLaCasaMamiButton;

    public FormChelin(){
        setTitle("Mi Aplicación Principal");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);
        add(mainPanel);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormChelin();
        });
    }
}
