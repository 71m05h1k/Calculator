import javax.swing.*;
import java.awt.*;

/**
 * andrew on 6/22/15
 */
public class Laskin {
    Laskin (){
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

        JButton button_0 = new JButton("0");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 4;
        jfrm.add(button_0,gBC);

        JButton button_1 = new JButton("1");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 3;
        jfrm.add(button_1,gBC);

        JButton button_2 = new JButton("2");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 3;
        jfrm.add(button_2,gBC);

        JButton button_3 = new JButton("3");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 3;
        jfrm.add(button_3,gBC);

        JButton button_4 = new JButton("4");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 2;
        jfrm.add(button_4,gBC);

        JButton button_5 = new JButton("5");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 2;
        jfrm.add(button_5,gBC);

        JButton button_6 = new JButton("6");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 2;
        jfrm.add(button_6,gBC);

        JButton button_7 = new JButton("7");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 1;
        jfrm.add(button_7,gBC);

        JButton button_8 = new JButton("8");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 1;
        jfrm.add(button_8,gBC);

        JButton button_9 = new JButton("9");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 1;
        jfrm.add(button_9,gBC);

        JButton button_plus = new JButton("+");
        gBC.gridheight = 2;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 3;
        jfrm.add(button_plus,gBC);

        JButton button_minus = new JButton("-");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 2;
        jfrm.add(button_minus,gBC);

        JButton button_mul = new JButton("X");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 1;
        jfrm.add(button_mul,gBC);

        JButton button_div = new JButton("/");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 5;
        gBC.gridy = 1;
        jfrm.add(button_div,gBC);

        JButton button_summ = new JButton("=");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 4;
        jfrm.add(button_summ,gBC);

        JTextField jtf = new JTextField("7350.1505");
        gBC.gridheight = 1;
        gBC.gridwidth = 5;
        gBC.gridx = 0;
        gBC.gridy = 0;
        jfrm.add(jtf,gBC);

        jfrm.setVisible(true);
    }
}