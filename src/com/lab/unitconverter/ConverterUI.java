package com.lab.unitconverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConverterUI {

    private final ConverterLogic logic;
    private JFrame frame;
    private JTextField inputField;
    private JComboBox<String> fromBox;
    private JComboBox<String> toBox;
    private JLabel resultLabel;

    public ConverterUI() {
        logic = new ConverterLogic();
        setupWindow();
    }

    private void setupWindow() {
        frame = new JFrame("Length Converter Pro");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel inputLabel = new JLabel("Enter Value:");
        inputField = new JTextField();

        String[] units = {"Meters", "Feet", "Inches", "Centimeters"};
        JLabel fromLabel = new JLabel("From Unit:");
        fromBox = new JComboBox<>(units);

        JLabel toLabel = new JLabel("To Unit:");
        toBox = new JComboBox<>(units);

        JButton convertButton = new JButton("Convert!");
        resultLabel = new JLabel("Result will appear here");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performConversion();
            }
        });

        frame.add(inputLabel); frame.add(inputField);
        frame.add(fromLabel);  frame.add(fromBox);
        frame.add(toLabel);    frame.add(toBox);
        frame.add(new JLabel("")); frame.add(convertButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private void performConversion() {
        try {
            double inputValue = Double.parseDouble(inputField.getText());
            String fromUnit = (String) fromBox.getSelectedItem();
            String toUnit = (String) toBox.getSelectedItem();

            double finalResult = logic.convert(inputValue, fromUnit, toUnit);

            String formattedResult = String.format("%.2f", finalResult);
            resultLabel.setText(inputValue + " " + fromUnit + " = " + formattedResult + " " + toUnit);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter a valid number!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}