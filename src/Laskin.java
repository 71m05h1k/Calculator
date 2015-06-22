import javax.swing.*;
import java.awt.*;

/**
 * andrew on 6/22/15
 */
public class Laskin {
    Laskin (){
        JFrame jfrm = new JFrame("Calculator");
        jfrm.setSize(500 , 500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridBagLayout());
//C  =
//789/
//456*
//123+
//0  -
        JLabel button_empty = new JLabel("[ ]");
        JLabel button_c = new JLabel("[C]");
        JLabel button_0 = new JLabel("[0]");
        JLabel button_1 = new JLabel("[1]");
        JLabel button_2 = new JLabel("[2]");
        JLabel button_3 = new JLabel("[3]");
        JLabel button_4 = new JLabel("[4]");
        JLabel button_5 = new JLabel("[5]");
        JLabel button_6 = new JLabel("[6]");
        JLabel button_7 = new JLabel("[7]");
        JLabel button_8 = new JLabel("[8]");
        JLabel button_9 = new JLabel("[9]");
        JLabel button_plus = new JLabel("[+]");
        JLabel button_minus = new JLabel("[-]");
        JLabel button_mul = new JLabel("[X]");
        JLabel button_div = new JLabel("[_]");
        JLabel button_summ = new JLabel("[=]");

        jfrm.add(button_c);
//        jfrm.add(button_empty);
//        jfrm.add(button_empty);
//        jfrm.add(button_summ);
//
//        jfrm.add(button_7);
//        jfrm.add(button_8);
//        jfrm.add(button_9);
//        jfrm.add(button_div);
//
//        jfrm.add(button_4);
//        jfrm.add(button_5);
//        jfrm.add(button_6);
//        jfrm.add(button_mul);
//
//        jfrm.add(button_1);
//        jfrm.add(button_2);
//        jfrm.add(button_3);
//        jfrm.add(button_plus);
//
//        jfrm.add(button_0);
//        jfrm.add(button_empty);
//        jfrm.add(button_empty);
//        jfrm.add(button_minus);

        jfrm.setVisible(true);
    }
}