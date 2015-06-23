import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * andrew on 6/22/15
 */
public class Laskin {
    Laskin (){

        final JTextField jtf = new JTextField("abracadabra");
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setSize(300 , 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();

        JButton button_c = new JButton("C");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 0;
        gBC.gridy = 1;
        jfrm.add(button_c,gBC);
        button_c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText("");
            }
        });

        JButton button_0 = new JButton("0");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 4;
        jfrm.add(button_0,gBC);
        button_0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "0");
            }
        });

        JButton button_1 = new JButton("1");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 3;
        jfrm.add(button_1,gBC);
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "1");
            }
        });

        JButton button_2 = new JButton("2");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 3;
        jfrm.add(button_2,gBC);
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "2");
            }
        });

        JButton button_3 = new JButton("3");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 3;
        jfrm.add(button_3,gBC);
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "3");
            }
        });

        JButton button_4 = new JButton("4");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 2;
        jfrm.add(button_4,gBC);
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "4");
            }
        });

        JButton button_5 = new JButton("5");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 2;
        jfrm.add(button_5,gBC);
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "5");
            }
        });

        JButton button_6 = new JButton("6");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 2;
        jfrm.add(button_6,gBC);
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "6");
            }
        });

        JButton button_7 = new JButton("7");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 1;
        jfrm.add(button_7,gBC);
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "7");
            }
        });

        JButton button_8 = new JButton("8");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 1;
        jfrm.add(button_8,gBC);
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "8");
            }
        });

        JButton button_9 = new JButton("9");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 1;
        jfrm.add(button_9,gBC);
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "9");
            }
        });

        JButton button_plus = new JButton("+");
        gBC.gridheight = 2;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 3;
        jfrm.add(button_plus,gBC);
        button_plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "+");
            }
        });

        JButton button_minus = new JButton("-");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 2;
        jfrm.add(button_minus,gBC);
        button_minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "-");
            }
        });

        JButton button_mul = new JButton("X");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 1;
        jfrm.add(button_mul,gBC);
        button_mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "X");
            }
        });

        JButton button_div = new JButton("/");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 5;
        gBC.gridy = 1;
        jfrm.add(button_div,gBC);
        button_div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "/");
            }
        });

        JButton button_summ = new JButton("=");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 4;
        jfrm.add(button_summ,gBC);
        button_summ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(other.rezultat(jtf.getText()));
            }
        });

        gBC.gridheight = 1;
        gBC.gridwidth = 5;
        gBC.gridx = 0;
        gBC.gridy = 0;
        jfrm.add(jtf,gBC);
        jfrm.setVisible(true);
    }
}