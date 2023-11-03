package Actividad4;

import javax.swing.*;

public class CalculadoraGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Primer número:");
        label1.setBounds(10, 20, 100, 20);
        frame.add(label1);

        JTextField num1Field = new JTextField();
        num1Field.setBounds(120, 20, 150, 20);
        frame.add(num1Field);

        JLabel label2 = new JLabel("Segundo número:");
        label2.setBounds(10, 50, 100, 20);
        frame.add(label2);

        JTextField num2Field = new JTextField();
        num2Field.setBounds(120, 50, 150, 20);
        frame.add(num2Field);

        JButton sumButton = new JButton("Suma");
        sumButton.setBounds(10, 80, 70, 25);
        frame.add(sumButton);

        JButton subtractButton = new JButton("Resta");
        subtractButton.setBounds(90, 80, 70, 25);
        frame.add(subtractButton);

        JButton multiplyButton = new JButton("Multiplicación");
        multiplyButton.setBounds(170, 80, 110, 25);
        frame.add(multiplyButton);

        JButton divideButton = new JButton("División");
        divideButton.setBounds(10, 110, 70, 25);
        frame.add(divideButton);

        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(10, 140, 200, 20);
        frame.add(resultLabel);

        sumButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            resultLabel.setText("Suma: " + (num1 + num2));
        });

        subtractButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            resultLabel.setText("Resta: " + (num1 - num2));
        });

        multiplyButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            resultLabel.setText("Multiplicación: " + (num1 * num2));
        });

        divideButton.addActionListener(e -> {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            if (num2 == 0) {
                resultLabel.setText("Error: División por cero");
            } else {
                resultLabel.setText("División: " + ((double) num1 / num2));
            }
        });

        frame.setVisible(true);
    }
}
