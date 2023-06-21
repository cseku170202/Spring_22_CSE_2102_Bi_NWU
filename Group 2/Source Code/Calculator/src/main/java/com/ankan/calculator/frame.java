
package com.ankan.calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.System.exit;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author ankan
 */
public class frame extends JFrame implements ActionListener{
    
    private JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMin,btnEqual,btnMultiplication,btnDiv,btnDot,btnDel,btnPow,btnRoot,btnPM;
    private JButton btnSin,btnCos,btnTan,btnD;
    private Container c;
    JMenuBar menuBar; JMenuItem exit,about,theme,darkMode,lightMode;
    static JTextField input;JLabel op;JPanel disPanel;
    JFrame myframe;
    Double num,numRad,ans,num2;int flag;String temp;
    
        Color backColor = Color.decode("#343434");
        Color forColor = Color.decode("#FFFFFF");
        Font font = new Font("Inter",Font.BOLD,36);

    frame() {
        myframe = new JFrame("Calculator");
        c =  myframe.getContentPane();
        initComponents();
        myframe.setVisible(true);
        myframe.setBounds(100, 50, 400, 770);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setResizable(false);
    }
    
    
 
    public void initComponents(){
        
        // SET MAIN FRAME 
        c.setBackground(Color.BLACK);
        c.setLayout(null);
        // Creating Menu 
       menuBar = new JMenuBar();
       
       JMenu option = new JMenu("Option");
       JMenu help = new JMenu("Help");
       JMenu theme = new JMenu("Theme");
       exit= new JMenuItem("Exit");
       about = new JMenuItem("About");
       darkMode = new JMenuItem("Dark Mood");
       lightMode = new JMenuItem("light Mode");
        
       menuBar.add(option);
       menuBar.add(help);
       myframe.setJMenuBar(menuBar);
       option.add(theme);
       theme.add(lightMode);
       theme.add(darkMode);
       option.add(exit);
       help.add(about);
       
       // Make DISPLAY Panel
       disPanel = new JPanel();
       disPanel.setBounds(19, 20, 350, 95);
       disPanel.setBackground(Color.decode("#FFFFFF"));
       disPanel.setForeground(Color.BLACK);
       disPanel.setFont(font);
       disPanel.setLayout(null);
       c.add(disPanel);

       input = new JTextField();
       input.setBounds(0, 0, 350, 120);
       input.setForeground(Color.BLACK);
       input.setBackground(Color.decode("#FFFFFF"));
       disPanel.add(input);
       input.setLayout(null);
       input.setHorizontalAlignment(JLabel.RIGHT);
       input.setFont(new Font("Inter",Font.BOLD,46));
       input.setEditable(false);
       input.setOpaque(false);
       
       op = new JLabel();
       op.setBounds(0, 0, 340, 95);
       op.setForeground(Color.decode("#007A14"));
       op.setBackground(Color.decode("#FFFFFF"));
       op.setText("");
       disPanel.add(op);
       op.setLayout(null);
       op.setHorizontalAlignment(JLabel.RIGHT);
       op.setVerticalAlignment(JTextField.TOP);
       op.setFont(new Font("Inter",Font.BOLD,26));
       op.setVisible(false);
       op.setOpaque(false);
       
       //...............................................
        // START ALL BUTTON 
        btnSin = new JButton("Sin");
        btnSin.setBounds(19, 130, 70, 70);
        btnSin.setBackground(backColor);
        btnSin.setForeground(Color.decode("#FF5959"));
        btnSin.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnSin);
       
        btnCos = new JButton("Cos");
        btnCos.setBounds(112, 130, 70, 70);
        btnCos.setBackground(backColor);
        btnCos.setForeground(Color.decode("#FF5959"));
        btnCos.setFont(new Font("Inter",Font.BOLD,18));
        c.add(btnCos);
       
        btnTan = new JButton("Tan");
        btnTan.setBounds(205, 130, 70, 70);
        btnTan.setBackground(backColor);
        btnTan.setForeground(Color.decode("#FF5959"));
        btnTan.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnTan);
       
        btnD = new JButton("\u232B");
        btnD.setBounds(298, 130, 70, 70);
        btnD.setBackground(backColor);
        btnD.setForeground(forColor);
        btnD.setFont(new Font("Inter",Font.BOLD,20));
        c.add(btnD);
       
       
        btnDel = new JButton("C");
        btnDel.setBounds(19, 220, 70, 70);
        btnDel.setBackground(Color.decode("#FF5959"));
        btnDel.setForeground(Color.BLACK);
        btnDel.setFont(font);
        c.add(btnDel);
       
        btnPow = new JButton("x\u00B2");
        btnPow.setBounds(112, 220, 70, 70);
        btnPow.setBackground(backColor);
        btnPow.setForeground(forColor);
        btnPow.setFont(font);
        c.add(btnPow);
       
        btnRoot = new JButton("\u221A");
        btnRoot.setBounds(205, 220, 70, 70);
        btnRoot.setBackground(backColor);
        btnRoot.setForeground(forColor);
        btnRoot.setFont(font);
        c.add(btnRoot);
       
        btnDiv = new JButton("/");
        btnDiv.setBounds(298, 220, 70, 70);
        btnDiv.setBackground(backColor);
        btnDiv.setForeground(Color.decode("#66FF7F"));
        btnDiv.setFont(font);
        c.add(btnDiv);
       
       
        
       
        btn7 = new JButton("7");
        btn7.setBounds(19, 315, 70, 70);
        btn7.setBackground(backColor);
        btn7.setForeground(forColor);
        btn7.setFont(font);
        c.add(btn7);
        
        btn8 = new JButton("8");
        btn8.setBounds(112, 315, 70, 70);
        btn8.setBackground(backColor);
        btn8.setForeground(forColor);
        btn8.setFont(font);
        c.add(btn8);
        
        btn9 = new JButton("9");
        btn9.setBounds(205, 315, 70, 70);
        btn9.setBackground(backColor);
        btn9.setForeground(forColor);
        btn9.setFont(font);
        c.add(btn9);
        
        btnMultiplication = new JButton("x");
        btnMultiplication.setBounds(298, 315, 70, 70);
        btnMultiplication.setBackground(backColor);
        btnMultiplication.setForeground(Color.decode("#66FF7F"));
        btnMultiplication.setFont(font);
        c.add(btnMultiplication);
        
        
        
        btn4 = new JButton("4");
        btn4.setBounds(19, 410, 70, 70);
        btn4.setBackground(backColor);
        btn4.setForeground(forColor);
        btn4.setFont(font);
        c.add(btn4);
        
        btn5 = new JButton("5");
        btn5.setBounds(112, 410, 70, 70);
        btn5.setBackground(backColor);
        btn5.setForeground(forColor);
        btn5.setFont(font);
        c.add(btn5);
        
        
        btn6 = new JButton("6");
        btn6.setBounds(205, 410, 70, 70);
        btn6.setBackground(backColor);
        btn6.setForeground(forColor);
        btn6.setFont(font);
        c.add(btn6);
        
        btnMin = new JButton("-");
        btnMin.setBounds(298, 410, 70, 70);
        btnMin.setBackground(backColor);
        btnMin.setForeground(Color.decode("#66FF7F"));
        btnMin.setFont(font);
        c.add(btnMin); 
        

        
        
        btn1 = new JButton("1");
        btn1.setBounds(19, 505, 70, 70);
        btn1.setBackground(backColor);
        btn1.setForeground(forColor);
        btn1.setFont(font);
        c.add(btn1);
         
        btn2 = new JButton("2");
        btn2.setBounds(112, 505, 70, 70);
        btn2.setBackground(backColor);
        btn2.setForeground(forColor);
        btn2.setFont(font);
        c.add(btn2);
        
        
        btn3 = new JButton("3");
        btn3.setBounds(205, 505, 70, 70);
        btn3.setBackground(backColor);
        btn3.setForeground(forColor);
        btn3.setFont(font);
        c.add(btn3);
        
        btnPlus = new JButton("+");
        btnPlus.setBounds(298, 505, 70, 70);
        btnPlus.setBackground(backColor);
        btnPlus.setForeground(Color.decode("#66FF7F"));
        btnPlus.setFont(font);
        c.add(btnPlus);
        
        
        btnPM = new JButton("+/-");
        btnPM.setBounds(19, 600, 70, 70);
        c.add(btnPM);
        btnPM.setBackground(backColor);
        btnPM.setForeground(forColor);
        btnPM.setFont(new Font("Inter",Font.BOLD,30));
        
        
        btn0 = new JButton("0");
        btn0.setBounds(112, 600, 70, 70);
        c.add(btn0);
        btn0.setBackground(backColor);
        btn0.setForeground(forColor);
        btn0.setFont(font);
        
        btnDot = new JButton(".");
        btnDot.setBounds(205, 600, 70, 70);
        c.add(btnDot);
        btnDot.setBackground(backColor);
        btnDot.setForeground(forColor);
        btnDot.setFont(font);
       
        
        btnEqual = new JButton("=");
        btnEqual.setBounds(298, 600, 70, 70);
        c.add(btnEqual);
        btnEqual.setBackground(Color.GREEN);
        btnEqual.setForeground(Color.BLACK);
        btnEqual.setFont(font);
        
       
        
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMin.addActionListener(this);
        btnEqual.addActionListener(this);
        btnMultiplication.addActionListener(this);
        btnDiv.addActionListener(this);
        btnDot.addActionListener(this);
        btnDel.addActionListener(this);
        btnPow.addActionListener(this);
        btnRoot.addActionListener(this);
        btnSin.addActionListener(this);
        btnCos.addActionListener(this);
        btnTan.addActionListener(this);
        btnD.addActionListener(this);
        btnPM.addActionListener(this);
        
        //menu item
        exit.addActionListener(this);
        about.addActionListener(this);
        darkMode.addActionListener(this);
        lightMode.addActionListener(this);         
     
    }
    
    // Creating method for Roundup a long double number into 3 degit 
     String roundNum(double x){
          DecimalFormat df = new DecimalFormat("#.###");
          df.setRoundingMode(RoundingMode.CEILING);
          return df.format(x);
      }

    @Override
    public void actionPerformed(ActionEvent e) {
      
       String s = e.getActionCommand();
       Object source = e.getSource();

       if (source == btn0) {
           input.setText(input.getText()+"0");          
      }
      else if (source == btn1) {
          input.setText(input.getText() + "1");   
        }   
      else if (source == btn2) {
          input.setText(input.getText() + "2");   
        }
      else if (source == btn3) {
          input.setText(input.getText() + "3");   
        }
      else if (source == btn4) {
          input.setText(input.getText() + "4");   
        }
      else if (source == btn5) {
          input.setText(input.getText() + "5");   
        }
      else if (source == btn6) {
          input.setText(input.getText() + "6");   
        }
      else if (source == btn6) {
          input.setText(input.getText() + "6");   
        }
      else if (source == btn7) {
          input.setText(input.getText() + "7");   
        }
      else if (source == btn8) {
          input.setText(input.getText() + "8");   
        }  
      else if (source == btn9) {
          input.setText(input.getText() + "9");   
        }   
      else if (source == btnDot) {
          input.setText(input.getText() + ".");   
        } 
      
      // Arithmatic button source 
      else if (source == btnPlus) {
          
          String temp =input.getText();
          num = Double.parseDouble(temp);  
          input.setText("");
          op.setVisible(true);
          op.setText(temp+" +");
          flag = 1;
        }
       
      else if (source == btnMin) {
          String temp =input.getText();
         num = Double.parseDouble(temp);
         input.setText("");
         op.setVisible(true);
         op.setText(temp+" -");
         flag = 2;
        }
    
      else if (source == btnMultiplication) {
         String temp =input.getText();
         num = Double.parseDouble(temp);
         input.setText("");
         op.setVisible(true);
         op.setText(temp+" x");
         flag = 3;
        }
     
      else if (source == btnDiv) {
          
          String temp =input.getText();
          num = Double.parseDouble(input.getText());
          input.setText("");
          op.setVisible(true);
          op.setText(temp+" /");
          flag = 4;
        }
    
     else if (source == btnSin) {
         
         op.setVisible(true);
         op.setText("sin"); 
         input.setText("");
         flag = 5;
        }
     
     else if (source == btnCos) {

         op.setVisible(true);
         op.setText("cos"); 
         input.setText("");
         flag = 6; 
        }
     
     else if (source == btnTan) {

         op.setVisible(true);
         op.setText("tan"); 
         input.setText("");
         flag = 7; 
        }
     
     // Power 
     else if (source == btnPow) {         
          num = Double.parseDouble(input.getText());
          input.setText(""); 
          op.setVisible(true);
          op.setText(num+" ^");
          flag = 8;
        }
     
     // Root
     else if (source == btnRoot) {

          input.setText("");
          op.setVisible(true);
          op.setText(" \u221A");
          flag = 9; 
        }
     else if (source == btnPM) {

          String temp =input.getText();
          num = Double.parseDouble(input.getText());
          if(num>0){
          input.setText("- "+temp);    
          }
          else{
            input.setText("+ "+temp);
          }
          flag = 10; 
        }
     //**************************
      // EQUAL BUTTON & ANS
     //**************************
      else if (source == btnEqual) {
          if(flag==1){
                    
                    num2 =  Double.parseDouble(input.getText());
                    ans = num +num2;
                    input.setText(""); 
                    input.setText(roundNum(ans));
                    op.setText(roundNum(num)+" + "+roundNum(num2));
                    flag=0;
            }
        else if (flag==2) {
                    num2 =  Double.parseDouble(input.getText());
                    ans = num - num2;
                    input.setText(""); 
                    input.setText(roundNum(ans));
                    op.setText(roundNum(num)+" - "+roundNum(num2));
                    flag=0;
            }
         else if (flag==3) {
                   
                    num2 =  Double.parseDouble(input.getText());
                    ans = num * num2;
                    input.setText(""); 
                    input.setText(roundNum(ans));
                    op.setText(roundNum(num)+" x "+roundNum(num2));
                    flag=0;
            }
         else if (flag==4) {
                   
                    num2 =  Double.parseDouble(input.getText());
                    ans = num / num2;
                    input.setText(""); 
                    input.setText(roundNum(ans));
                    op.setText(roundNum(num)+"/"+roundNum(num2));
                    flag=0;
            }
          
         else if (flag==5) {
                    num = Double.parseDouble(input.getText());
                    numRad = Math.toRadians(num);
                    ans =Math.sin( numRad);
                    op.setText("Sin("+roundNum(num)+")");
                    input.setText(roundNum(ans)); // Callling RoundUp for round 3 degit 
                    flag=0;  
                    
            }
         else if (flag==6) {
                    num = Double.parseDouble(input.getText());
                    numRad = Math.toRadians(num);
                    ans =Math.cos( numRad);
                    op.setText("cos("+roundNum(num)+")");
                    input.setText(roundNum(ans));// Callling RoundUp for round 3 degit 
                    flag=0;  
            }
         else if (flag==7) {
             
                    num = Double.parseDouble(input.getText());
                    numRad = Math.toRadians(num);
                    ans =Math.tan( numRad);
                    op.setText("Tan("+roundNum(num)+")");
                    input.setText(roundNum(ans)); // Callling RoundUp for round 3 degit 
                    flag=0;
            }
           
         else if (flag==8) {
                   num2 = Double.parseDouble(input.getText());
                   ans = Math.pow(num,num2 );
                   input.setText("");
                   op.setText(roundNum(num)+"^"+roundNum(num2));
                   input.setText(roundNum(ans));
                   flag=0;
            }
         
         else if (flag==9) {
                   
                   num = Double.parseDouble(input.getText());
                   ans = Math.sqrt( num);
                   input.setText("");
                   input.setText(roundNum(ans));
                   op.setText("\u221A"+roundNum(num));
                   flag=0;
            }
         else if (flag==0) { 
                   input.setText("Error");
                   flag=0;
            }
        }
       
      
      // delete button
      else if (source == btnDel) {
          input.setText("");   
          op.setText("");   
        }
      else if (source == btnD) {
            int length = input.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(input.getText());
                back.deleteCharAt(number);
                input.setText(back.toString());
            }
            if (input.getText().endsWith("")) {
            }
        }

       // Menu Bar Action
        if(e.getSource()==exit){
          System.exit(0);
        }
        if(e.getSource()==about){
         info obj = new info();
        }
       
       if(e.getSource()==lightMode){
       c.setBackground(Color.WHITE); 
       backColor = Color.decode("#C0C0C0"); // Background Color for Light Mode
       forColor = Color.decode("#000000"); // Foreground Color dor Light Mode
       disPanel.setBackground(Color.decode("#000000"));
       disPanel.setForeground(Color.WHITE);
       input.setForeground(Color.WHITE);
       input.setBackground(Color.decode("#000000"));
        }
        
        if(e.getSource()==darkMode){
        c.setBackground(Color.BLACK);
        backColor = Color.decode("#343434");
        forColor = Color.decode("#FFFFFF");
        disPanel.setBackground(Color.decode("#FFFFFF"));
        disPanel.setForeground(Color.BLACK);
        input.setForeground(Color.BLACK);
        input.setBackground(Color.decode("#FFFFFF"));
        
        }

       }

    }

