package FeaturesOfJava8.Lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindows {
    public static void main(String[] args) {

        JFrame frame=new JFrame("My Windows");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button=new JButton("Click me!");
        frame.add(button);

        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Click");
                JOptionPane.showMessageDialog(null,"Hey Click");
            }
        });*/

        button.addActionListener((ActionEvent e)->{
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null,"Hey Click");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
