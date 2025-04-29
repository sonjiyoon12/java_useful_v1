package _my_test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame extends JFrame implements ActionListener {

    private JButton[] buttons = new JButton[7];

    private JPanel panel1;
    private JPanel panel2;

    public ColorChangeFrame() {
        iniData();
        setInitLayout();
        addEvenListener();
    }

    private void iniData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel();
        panel2 = new JPanel();

        for (int i = 0; i < 7; i++) {
            buttons[i] = new JButton("click" + (i + 1));
        }
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));
        panel1.setBackground(Color.WHITE);
        add(panel1);

        panel2.setBackground(Color.BLACK);
        add(panel2);

        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        panel1.add(buttons[0]);
        panel1.add(buttons[1]);
        panel1.add(buttons[2]);
        panel1.add(buttons[3]);


        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        panel2.add(buttons[4]);
        panel2.add(buttons[5]);
        panel2.add(buttons[6]);


        setVisible(true);

    }

    private void addEvenListener() {

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton);
        System.out.println(selectedButton.getText());

        if (selectedButton == buttons[0]) {
            panel1.setBackground(Color.RED);
        } else if (selectedButton == buttons[1]) {
            panel1.setBackground(Color.ORANGE);
        } else if (selectedButton == buttons[2]) {
            panel1.setBackground(Color.YELLOW);
        } else if (selectedButton == buttons[3]) {
            panel1.setBackground(Color.GREEN);
        } else if (selectedButton == buttons[4]) {
            panel2.setBackground(Color.BLUE);
        } else if (selectedButton == buttons[5]) {
            panel2.setBackground(Color.WHITE);
        } else if (selectedButton == buttons[6]) {
            panel2.setBackground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame();
    }
}
