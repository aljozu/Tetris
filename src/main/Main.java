package main;

import main.GamePanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        var window = new JFrame("Simple tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        var gp = new GamePanel();
        window.add(gp);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.launchGame();
    }
}