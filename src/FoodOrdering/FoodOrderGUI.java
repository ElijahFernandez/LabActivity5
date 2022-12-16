package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FoodOrderGUI extends JFrame {
    private double total = 0;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JPanel panel1;
    // List of Food and Drinks
    private JCheckBox cPizza; // 100
    private JCheckBox cBurger; // 80
    private JCheckBox cFries; // 65
    private JCheckBox cSoftDrinks; // 55
    private JCheckBox cTea; // 50
    private JCheckBox cSundae; // 40

    // List of Discounts
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;


    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cPizza.isSelected())         { total += 100; }
                if(cBurger.isSelected())        { total += 80; }
                if(cFries.isSelected())         { total += 65; }
                if(cSoftDrinks.isSelected())    { total += 55; }
                if(cTea.isSelected())           { total += 50; }
                if(cSundae.isSelected())        { total += 40; }

                if(rbNone.isSelected()) {
                    JOptionPane.showMessageDialog(panel1, "The total price is Php "+ total);
                } else if(rb5.isSelected()) {
                    total = total - (total *.05);
                } else if(rb10.isSelected()) {
                    total *= total - (total *.10);
                } else if(rb15.isSelected()) {
                    total *= total - (total *.15);
                }
                JOptionPane.showMessageDialog(panel1, "The total price is Php "+ total);
//

            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.panel1);
        app.setSize(700, 700);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
