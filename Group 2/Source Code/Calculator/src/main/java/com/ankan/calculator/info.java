package com.ankan.calculator;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.*;

/**
 *
 * @author ankan
 */
public class info {
      JLabel nwu,about,name1,name2,name3,name4;
      JLabel id1,id2,id3,id4;
      JLabel pic1,pic2,pic3,pic4;
      ImageIcon ankanPic,prantoPic,labonnoPic,suconaPic;
      private Container c;
      private JFrame f = new JFrame("Information");
      Font font = new Font("Inter",Font.BOLD,20);
	public info() {
                f.setBounds(100, 200, 400, 450);
		f.setVisible(true);
                f.setResizable(false);
                c =  f.getContentPane();
                 initComponents();
	}
        
        public void initComponents(){
        
        c.setBackground(Color.WHITE);
        c.setLayout(null);
        
        nwu = new JLabel("North Western University,Khulna");
        c.add(nwu);
        nwu.setBounds(10, 0, 400, 40);
        nwu.setFont(font);
         
        nwu.setIcon(new ImageIcon("C:\\Users\\ankan\\Documents\\NetBeansProjects\\Calculator\\src\\main\\java\\com\\ankan\\calculator\\img\\nwu.png"));
       // nwu.setIcon(new ImageIcon("img nwu.png"));
        nwu.setForeground(Color.decode("#007A14"));
        
        
        JLabel dept = new JLabel("Depertment of CSE");
        c.add(dept);
        dept.setBounds(120, 20, 400, 40);
        dept.setFont(new Font("Inter",Font.BOLD,16));
        dept.setForeground(Color.decode("#007A14"));
        
        
        about = new JLabel("Project Name: Basic Calculator");
        c.add(about);
        about.setBounds(70, 50, 300, 20);
        about.setFont(font);
        about.setForeground(Color.decode("#120DFF"));
        
        JLabel d = new JLabel("------------------------------------------------------------------------------------------------------------------------");
        c.add(d);
        d.setBounds(15, 70, 400, 10);
         d.setFont(new Font("Inter",Font.BOLD,10)); 
        
        
        ankanPic = new ImageIcon("C:\\Users\\ankan\\Documents\\NetBeansProjects\\Calculator\\src\\main\\java\\com\\ankan\\calculator\\img\\ankan.png");
        pic1 = new JLabel(ankanPic);
        c.add(pic1);
        pic1.setBounds(10, 80, 70, 80);
        pic1.setFont(font);
        pic1.setLayout(null);
        
        name1 = new JLabel("Name: Ankan Das");
        c.add(name1);
        name1.setBounds(80, 90, 300, 30);
        name1.setFont(font);
 
        id1 = new JLabel("ID      : 20221057010");
        c.add(id1);
        id1.setBounds(80, 120, 300, 30);
        id1.setFont(font);
        
        // pranto Info start 
        prantoPic = new ImageIcon("C:\\Users\\ankan\\Documents\\NetBeansProjects\\Calculator\\src\\main\\java\\com\\ankan\\calculator\\img\\pranto.png");
        pic2 = new JLabel(prantoPic);
        c.add(pic2);
        pic2.setBounds(10, 160, 70, 70);
        pic2.setFont(font);
        pic2.setLayout(null);
        
        name2 = new JLabel("Name: Pranto Mallick");
        c.add(name2);
        name2.setBounds(80, 170, 300, 30);
        name2.setFont(font);
 
        id2 = new JLabel("ID      : 20221047010");
        c.add(id2);
        id2.setBounds(80, 200, 300, 30);
        id2.setFont(font);
        
        
        // Labonno Info start 
        labonnoPic = new ImageIcon("C:\\Users\\ankan\\Documents\\NetBeansProjects\\Calculator\\src\\main\\java\\com\\ankan\\calculator\\img\\labonno.png");
        pic3 = new JLabel(labonnoPic);
        c.add(pic3);
        pic3.setBounds(10, 230, 70, 70);
        pic3.setFont(font);
        pic3.setLayout(null);
        
        name3 = new JLabel("Name: Fariha Afrin Labonno");
        c.add(name3);
        name3.setBounds(80, 240, 300, 30);
        name3.setFont(font);
 
        id3 = new JLabel("ID      : 20221045010");
        c.add(id3);
        id3.setBounds(80, 270, 300, 30);
        id3.setFont(font);
        
        
         
        
        }

}