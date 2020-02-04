package br.com.dacoder.ui;

import javax.swing.*;
import java.awt.*;

public class LoginScreen {
    private JFrame frame = null;
    private final int WIDTH = 800, HEIGHT = 600;

    public LoginScreen() {
        initWindow();
    }

    private void initWindow () {
        this.frame = new JFrame();

        this.frame.setTitle("Todo List");
        this.frame.setSize(new Dimension(WIDTH, HEIGHT));
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.frame.setVisible(true);
    }

    public void setupWindow() {

    }
}
