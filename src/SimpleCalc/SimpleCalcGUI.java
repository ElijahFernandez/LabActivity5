package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getFirstInt = tfNumber1.getText();
                String getSecondInt = tfNumber2.getText();
                String operator = (String) cbOperations.getSelectedItem();

                int parseFirstInt = (Integer.parseInt(getFirstInt));
                int parseSecondInt = (Integer.parseInt(getSecondInt));
                int result;
                switch(operator) {
                    case "+":
                        result = parseFirstInt + parseSecondInt;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = parseFirstInt - parseSecondInt;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "*":
                        result = parseFirstInt * parseSecondInt;
                        lblResult.setText(String.valueOf(result));
                        break;
                    case "/":
                        result = parseFirstInt / parseSecondInt;
                        lblResult.setText(String.valueOf(result));
                        break;

                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.panel1);
        app.setSize(600, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
