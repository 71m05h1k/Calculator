import javax.swing.*;
import java.awt.*;

/**
 * andrew on 6/22/15
 */
public class Laskin {
    Laskin (){
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setSize(200 , 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridBagLayout());
        GridBagConstraints gBC = new GridBagConstraints();

        JLabel button_c = new JLabel("C");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 0;
        gBC.gridy = 1;
        jfrm.add(button_c,gBC);

        JLabel button_0 = new JLabel("0");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 4;
        jfrm.add(button_0,gBC);

        JLabel button_1 = new JLabel("1");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 3;
        jfrm.add(button_1,gBC);

        JLabel button_2 = new JLabel("2");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 3;
        jfrm.add(button_2,gBC);

        JLabel button_3 = new JLabel("3");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 3;
        jfrm.add(button_3,gBC);

        JLabel button_4 = new JLabel("4");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 2;
        jfrm.add(button_4,gBC);

        JLabel button_5 = new JLabel("5");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 2;
        jfrm.add(button_5,gBC);

        JLabel button_6 = new JLabel("6");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 2;
        jfrm.add(button_6,gBC);

        JLabel button_7 = new JLabel("7");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 1;
        gBC.gridy = 1;
        jfrm.add(button_7,gBC);

        JLabel button_8 = new JLabel("8");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 2;
        gBC.gridy = 1;
        jfrm.add(button_8,gBC);

        JLabel button_9 = new JLabel("9");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 1;
        jfrm.add(button_9,gBC);

        JLabel button_plus = new JLabel("+");
        gBC.gridheight = 2;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 3;
        jfrm.add(button_plus,gBC);

        JLabel button_minus = new JLabel("-");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 2;
        jfrm.add(button_minus,gBC);

        JLabel button_mul = new JLabel("X");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 4;
        gBC.gridy = 1;
        jfrm.add(button_mul,gBC);

        JLabel button_div = new JLabel("/");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 5;
        gBC.gridy = 1;
        jfrm.add(button_div,gBC);

        JLabel button_summ = new JLabel("=");
        gBC.gridheight = 1;
        gBC.gridwidth = 1;
        gBC.gridx = 3;
        gBC.gridy = 4;
        jfrm.add(button_summ,gBC);

        JTextField jtf = new JTextField("7350.1505");
        gBC.gridheight = 1;
        gBC.gridwidth = 6;
        gBC.gridx = 0;
        gBC.gridy = 0;
        jfrm.add(jtf,gBC);

        jfrm.setVisible(true);
    }
}