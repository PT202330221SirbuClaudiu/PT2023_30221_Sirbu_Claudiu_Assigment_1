package org.example;

import javax.swing.*;

public class GUI {
    private JTextField textField1;
    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton adunareButton;
    private JButton impartireButton;
    private JButton derivareButton;
    private JButton integrareButton;
    private JButton scadereButton;
    private JButton inmultireButton;

    public GUI()
    {
        JFrame Frame = new JFrame("Calculator polinoame");


        Frame.setVisible(true);
        Frame.setSize(600, 400);
        Frame.add(panel1);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Controller operator = new Controller();
        adunareButton.addActionListener(operator.AdunareAction(textField3, textField2, textField1));
        scadereButton.addActionListener(operator.ScadereAction(textField3, textField2, textField1));
        inmultireButton.addActionListener(operator.InmultireAction(textField3, textField2, textField1));
        impartireButton.addActionListener(operator.ImpartireAction(textField3, textField2, textField1));
        derivareButton.addActionListener(operator.DerivareAction(textField3, textField2, textField1));
        integrareButton.addActionListener(operator.IntegrareAction(textField3, textField2, textField1));
    }

}

