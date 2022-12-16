package LeapYearChecker;

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
                String leapYear = textField1.getText();
                try{
                    int getLeapYear = (Integer.parseInt(leapYear));
                    boolean isLeapYear = (getLeapYear % 4 == 0 && getLeapYear % 100 != 0) || (getLeapYear % 400 == 0);

                    if (isLeapYear) {
                        JOptionPane.showMessageDialog(panel1, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(panel1, "Not a leap year");
                    }
                } catch (NumberFormatException i) {
                    JOptionPane.showMessageDialog(panel1, "Invalid input!");
                }

            }

        });
    }

    public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.panel1);
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }


}
