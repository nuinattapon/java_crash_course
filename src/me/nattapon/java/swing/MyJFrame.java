package me.nattapon.java.swing;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyJFrame extends JFrame {
    private JButton button;

    MyJFrame() {
        //changing the default locale to Thailand
        Locale.setDefault(new Locale("th", "TH"));
        ResourceBundle bundle = ResourceBundle.getBundle("swing");

        this.setTitle(bundle.getString("title"));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setResizable(true);

        int width = 800, height = width * 3 / 4;
        this.setSize(width, height);

        ImageIcon icon = new ImageIcon("oracle.png");
        this.setIconImage(icon.getImage());
        this.setLayout(new FlowLayout());

        JLabel label = new JLabel();
//        label.setText("Do you know how to code?");
        label.setText(bundle.getString("label"));

        ImageIcon imageIcon = new ImageIcon(new ImageIcon("aman.png").getImage()
                .getScaledInstance(96, 96, Image.SCALE_SMOOTH));
        label.setIcon(imageIcon);
        label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label.setForeground(Color.WHITE);
        this.add(label);

        label.setHorizontalAlignment(JLabel.LEFT);
        label.setVerticalAlignment(JLabel.CENTER);

        this.add(Box.createRigidArea(new Dimension(5, 0)));


        button = new JButton();
//        button.setText("Ok");
        button.setText(bundle.getString("button"));
//        button.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button.addActionListener(e -> System.out.println("Button was clicked 2!"));
        this.add(button);
        this.pack();

        this.centerFrameToScreen();

    }

    private void centerFrameToScreen() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - this.getWidth()) / 2, (screenSize.height - this.getHeight()) / 2);
    }

}
