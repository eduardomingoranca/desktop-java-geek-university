package com.brazil.desktop.geek;

import javax.swing.*;

import static javax.swing.BoxLayout.PAGE_AXIS;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
        final String USER = "geek";
        final String PASS = "university";

        // criacao da tela
        JFrame jFrame = new JFrame("Geek University :: Acesso ao Sistema");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // definindo um painel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, PAGE_AXIS));

        // definindo componentes
        JLabel jLabelUsuario = new JLabel("Usuario: ");
        JTextField jTextFieldUsuario = new JTextField(20);
        jTextFieldUsuario.setToolTipText("Informe o usuario de acesso...");

        JLabel jLabelSenha = new JLabel("Senha: ");
        JPasswordField jPasswordField = new JPasswordField(20);
        jPasswordField.setToolTipText("Informe a senha de acesso....");

        JButton btnLogin = new JButton("Login");
        // acao do botao
        btnLogin.addActionListener(e -> {
            if (jTextFieldUsuario.getText().equalsIgnoreCase(USER) && new String(jPasswordField.getPassword()).equalsIgnoreCase(PASS))
                JOptionPane.showMessageDialog(jFrame, "Acesso autorizado");
            else JOptionPane.showMessageDialog(jFrame, "Acesso negado");
        });

        // adicionando os componentes no painel
        jPanel.add(jLabelUsuario);
        jPanel.add(jTextFieldUsuario);

        jPanel.add(jLabelSenha);
        jPanel.add(jPasswordField);

        jPanel.add(btnLogin);

        // adicionando o painel na tela
        jFrame.setContentPane(jPanel);
        // fixando os dados no painel
        jFrame.pack();
        // definindo a tela como visivel
        jFrame.setVisible(true);
    }
}
