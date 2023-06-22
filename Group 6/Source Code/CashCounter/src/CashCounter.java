import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class CashCounter extends JFrame {
      private JTextField txtthousands;    
    private JTextField txtfiveHundreds;    
    private JTextField txtHundreds;
    private JTextField txtFifties;
    private JTextField txtTwenties;
    private JTextField txtTens;
    private JTextField txtFives;
    private JTextField txtOnes;
    private JLabel lblTotal;

    public CashCounter() {
        setTitle("Cash Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(12,12));
        setResizable(false);
        
        JLabel lblthousands = new JLabel("1000*");
        txtthousands = new JTextField();
        add(lblthousands);
        add(txtthousands);
        
        
        JLabel lblfiveHundreds = new JLabel("500*");
        txtfiveHundreds = new JTextField();
        add(lblfiveHundreds);
        add(txtfiveHundreds);

        JLabel lblHundreds = new JLabel("100*");
        txtHundreds = new JTextField();
        add(lblHundreds);
        add(txtHundreds);

        JLabel lblFifties = new JLabel("50*");
        txtFifties = new JTextField();
        add(lblFifties);
        add(txtFifties);

        JLabel lblTwenties = new JLabel("20*");
        txtTwenties = new JTextField();
        add(lblTwenties);
        add(txtTwenties);

        JLabel lblTens = new JLabel("10*");
        txtTens = new JTextField();
        add(lblTens);
        add(txtTens);

        JLabel lblFives = new JLabel("5*");
        txtFives = new JTextField();
        add(lblFives);
        add(txtFives);

        JLabel lblOnes = new JLabel("1*");
        txtOnes = new JTextField();
        add(lblOnes);
        add(txtOnes);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotal();
            }
        });
        add(btnCalculate);

        lblTotal = new JLabel("tk=");
        add(lblTotal);

        pack();
        setLocationRelativeTo(null);
    }

    private void calculateTotal() {
        
        int thousands = Integer.parseInt(txtthousands.getText());
        int fiveHundreds = Integer.parseInt(txtfiveHundreds.getText());
        int Hundreds = Integer.parseInt(txtHundreds.getText());
        int fifties = Integer.parseInt(txtFifties.getText());
        int twenties = Integer.parseInt(txtTwenties.getText());
        int tens = Integer.parseInt(txtTens.getText());
        int fives = Integer.parseInt(txtFives.getText());
        int ones = Integer.parseInt(txtOnes.getText());

        int total = (thousands * 1000)+(fiveHundreds * 500) +(Hundreds * 100) + (fifties * 50) + (twenties * 20) + (tens* 10) + (fives * 5) + ones;

        lblTotal.setText("Total:" + total);
    }

    public static void main(String[] args) {
        CashCounter cashCounter = new CashCounter();
        cashCounter.setVisible(true);
    }
}
