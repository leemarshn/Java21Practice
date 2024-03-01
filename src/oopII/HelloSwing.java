package oopII;

import javax.swing.*;
import java.awt.*;

public class HelloSwing extends JFrame {
    JButton btnSubmit;
    JLabel lblFName, lblLName, lblGender;
    JTextField txtFName, txtLName;
    JRadioButton male, female;
    JCheckBox courses;


    public HelloSwing() {
        lblFName = new JLabel("First Name");
        txtFName = new JTextField();

        lblLName  = new JLabel("Last Name");
        txtLName  = new JTextField();

        lblGender = new JLabel("Gender");
        male      = new JRadioButton("Male");
        female    = new JRadioButton("Female");

        btnSubmit = new JButton("Submit");


        lblFName.setBounds(50, 50,100,25);
        txtFName.setBounds(120, 50,200,25);
        lblLName.setBounds(50, 80, 100, 25);
        txtLName.setBounds(120,80,200,25);
        lblGender.setBounds(50,110, 100, 25);
        male.setBounds(120,110, 100, 25);
        female.setBounds(120,140,100,25 );
        btnSubmit.setBounds(120, 160, 100, 40);






        add(lblFName);
        add(txtFName);
        add(lblLName);
        add(txtLName);
//        add(lblGender);
        add(female);
        add(male);


        add(btnSubmit);

        setLayout(null);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}
