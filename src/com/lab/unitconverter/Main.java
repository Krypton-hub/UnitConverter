package com.lab.unitconverter;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // The Boss tells the Waiter to start working!
        SwingUtilities.invokeLater(ConverterUI::new);
    }
}