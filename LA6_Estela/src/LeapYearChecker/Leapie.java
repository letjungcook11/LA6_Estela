package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Leapie extends JFrame{


    private JTextField yearTextField;
    private JPanel LeapYearChecker;
    private JButton checkYearButton;
    Leapie(){

        setTitle("Leap Year Checker");

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredString =  yearTextField.getText();
                int newYear = Integer.parseInt(enteredString);
                if ((newYear % 4 == 0 && newYear % 100 != 0)|| newYear % 400 == 0){
                    JOptionPane.showMessageDialog(null,"Leap Year" + "\n");
                } else {
                    JOptionPane.showMessageDialog(null,"Not a Leap Year" + "\n");
                }
            }
        });
    }

    public static void main(String[] args){
        Leapie leapApp = new Leapie();
        leapApp.setContentPane(leapApp.LeapYearChecker);
        leapApp.setSize(600,300);
        leapApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapApp.setLocationRelativeTo(null);
        leapApp.setVisible(true);

    }
}
