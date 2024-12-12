package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("resources/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);

        //Again convert to ImageIcon, because JLabel does not support image.
        ImageIcon i3 = new ImageIcon(i2);

        //To add an image on the frame, always add it via JLabel
        JLabel label = new JLabel(i3);
        add(label);

        setSize(800, 480);
        // Only when setVisible is true, we can see the box
        setVisible(true);
        setLocation(350, 200);
    }

    public static void main(String[] args) {
        new Login();
    }
}
