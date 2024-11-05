package SimpleCalculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcu extends JFrame {
    private JPanel CalcuForm;
    private JComboBox cbCompute;
    private JTextField secondText;
    private JTextField firstText;
    private JLabel firstN;
    private JLabel ResultLabel;
    private JTextField ResultField;
    private JLabel secondN;
    private JButton btnBotton;

    Calcu(){
        setTitle("Simple Calculator");


        btnBotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstString = firstText.getText();
                String secondString = secondText.getText();
                int firstDigits = Integer.parseInt(firstString);
                int secondDigits = Integer.parseInt(secondString);
                int result;
                String HI = (String)cbCompute.getSelectedItem();
                char op = HI.charAt(0);

                switch(op){
                    case '*':
                        result = firstDigits * secondDigits;
                        ResultField.setText(String.valueOf(result));
                        break;
                    case '+':
                        result = firstDigits + secondDigits;
                        ResultField.setText(String.valueOf(result));
                        break;
                    case '/':
                        result = firstDigits / secondDigits;
                        ResultField.setText(String.valueOf(result));
                        break;
                    case '-':
                        result = firstDigits - secondDigits;
                        ResultField.setText(String.valueOf(result));
                        break;
                }

            }
        });
    }
    
    public static void main(String[] args){
        Calcu calcu = new Calcu();
        calcu.setContentPane(calcu.CalcuForm);
        calcu.setSize(900,300);
        calcu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calcu.setLocationRelativeTo(null);
        calcu.setVisible(true);

    }
}
