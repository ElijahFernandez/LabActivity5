package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField textField1;
    private JButton checkButton;



    public LeapYearGUI() {
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int getLeapYear = (Integer.parseInt(textField1.getText()));
                boolean isLeapYear = (getLeapYear % 4 == 0 && getLeapYear % 100 != 0) || (getLeapYear % 400 == 0);

                if (isLeapYear) {
                    JOptionPane.showMessageDialog(panel1, "The year is a leap year.");
                } else {
                    JOptionPane.showMessageDialog(panel1, "The year is not a leap year.");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }


}
