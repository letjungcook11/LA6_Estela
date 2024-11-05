package Foodie;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Food extends JFrame {

    private JPanel Food;
    private JLabel foodName;
    private JLabel discountsName;
    private JCheckBox friesCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton orderButton;

    private JCheckBox[] btnGroupFoods = {pizzaCheckBox,burgerCheckBox,friesCheckBox,softDrinksCheckBox,teaCheckBox,sundaeCheckBox};
    private JRadioButton[] BtnGroupDiscounts = {noneRadioButton,a5OffRadioButton,a10OffRadioButton,a15OffRadioButton};

    Food(){
        setTitle("Food Ordering System");

        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int discount;
                int php= 0;
                int total = 0;

//{pizzaCheckBox,burgerCheckBox,friesCheckBox,softDrinksCheckBox,teaChe  for(JCheckBox hello: btnGroupFoods){
                    if (pizzaCheckBox.isSelected()){
                        php += 100;
                    }
                    if (burgerCheckBox.isSelected()){
                        php += 80;
                    }
                    if (friesCheckBox.isSelected()){
                        php += 65;
                    }
                    if (softDrinksCheckBox.isSelected()){
                        php += 55;
                    }
                    if (teaCheckBox.isSelected()){
                        php+=50;
                    }
                    if (sundaeCheckBox.isSelected()){
                        php+=40;
                    }

                // {noneRadioButton,a5OffRadioButton,a10OffRadioButton,a15OffRadioButton};
                double doubledPHP = (double) php;
                for (JRadioButton hello: BtnGroupDiscounts){
                    if (hello.isSelected()){
                        if (hello == noneRadioButton){

                            JOptionPane.showMessageDialog(null , "The total is Php " + doubledPHP);
                        } else if (hello == a5OffRadioButton){
                            doubledPHP -= (doubledPHP*0.05);
                            JOptionPane.showMessageDialog(null , "The total is Php " + doubledPHP);
                        } else if (hello == a10OffRadioButton){
                            doubledPHP -= (doubledPHP*0.10);
                            JOptionPane.showMessageDialog(null , "The total is Php " + doubledPHP);
                        } else if (hello == a15OffRadioButton){
                            doubledPHP -= (doubledPHP*0.15);
                            JOptionPane.showMessageDialog(null , "The total is Php " + doubledPHP);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args){

        Food fud = new Food();
        fud.setContentPane(fud.Food);
        fud.setSize(900,300);
        fud.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fud.setLocationRelativeTo(null);
        fud.setVisible(true);

    }
}
