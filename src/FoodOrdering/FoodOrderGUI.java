package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


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
    private DecimalFormat df = new DecimalFormat("0.00");



    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(e.getSource() == btnOrder) {
                    if(cPizza.isSelected())         { total += 100; }
                    if(cBurger.isSelected())        { total += 80; }
                    if(cFries.isSelected())         { total += 65; }
                    if(cSoftDrinks.isSelected())    { total += 55; }
                    if(cTea.isSelected())           { total += 50; }
                    if(cSundae.isSelected())        { total += 40; }

                    if(rbNone.isSelected()) {
                        String formattedNumber = df.format(total);
                        JOptionPane.showMessageDialog(panel1, "The total price is Php "+ formattedNumber);
                        cPizza.setSelected(false);
                        cBurger.setSelected(false);
                        cFries.setSelected(false);
                        cSoftDrinks.setSelected(false);
                        cTea.setSelected(false);
                        cSundae.setSelected(false);
                    }
                    if(rb5.isSelected()) {
                        total = total - (total *.05);
                    }

                    if(rb10.isSelected()) {
                        total *= total - (total *.10);
                    }

                    if(rb15.isSelected()) {
                        total *= total - (total *.15);
                    }

                    String formattedNumber = df.format(total);
                    JOptionPane.showMessageDialog(panel1, "The total price is Php "+ formattedNumber);
                    cPizza.setSelected(false);
                    cBurger.setSelected(false);
                    cFries.setSelected(false);
                    cSoftDrinks.setSelected(false);
                    cTea.setSelected(false);
                    cSundae.setSelected(false);
                }

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
