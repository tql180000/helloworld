package com.thinhle.helloworld;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hello world!", "example", JOptionPane.INFORMATION_MESSAGE);

        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "enter an integer: "));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "enter an integer: "));

        JOptionPane.showMessageDialog(null, "sum = " + add(a, b), "example", JOptionPane.INFORMATION_MESSAGE);
    }
}
