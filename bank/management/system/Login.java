package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login;
    JButton clear;
    JButton signup;
    JTextField cardTextField, pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("resources/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        //Again convert to ImageIcon, because JLabel does not support image.
        ImageIcon i3 = new ImageIcon(i2);

        //To add an image on the frame, always add it via JLabel
        JLabel label = new JLabel(i3);

        label.setBounds(70, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 24));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardNo = new JLabel("Card Number");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 20));
        cardNo.setBounds(120, 140, 150, 40);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setBounds(300, 140, 230, 40);
        add(cardTextField);

        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(120, 240, 400, 40);
        add(pin);

        pinTextField = new JTextField();
        pinTextField.setBounds(300, 240, 230, 40);
        add(pinTextField);

        //Buttons

        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        // Only when setVisible is true, we can see the box
        setVisible(true);
        setLocation(350, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(e.getSource() == signup) {

        }
        else {

        }
    }

    public static void main(String[] args) {
        new Login();
    }

}
