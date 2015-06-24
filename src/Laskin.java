import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * andrew on 6/22/15
 */
public class Laskin {
    JFrame jfrm;

    Laskin() {

        final JTextField jtf = new JTextField("abracadabra");
        jfrm = new JFrame("Calculator");
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfrm.setLayout(new GridBagLayout());

        createButton("C", 0, 1, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText("");
            }
        });

        createButton("0", 1, 4, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "0");
            }
        });

        createButton("1", 1, 3, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "1");
            }
        });

        createButton("2", 2, 3, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "2");
            }
        });

        createButton("3", 3, 3, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "3");
            }
        });

        createButton("4", 1, 2, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "4");
            }
        });

        createButton("5", 2, 2, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "5");
            }
        });

        createButton("6", 3, 2, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "6");
            }
        });

        createButton("7", 1, 1, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "7");
            }
        });

        createButton("8", 2, 1, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "8");
            }
        });

        createButton("9", 3, 1, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "9");
            }
        });

        createButton("+", 4, 3, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "+");
            }
        });

        createButton("-", 4, 2, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "-");
            }
        });

        createButton("*", 4, 1, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "*");
            }
        });

        createButton("/", 4, 4, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + "/");
            }
        });

        createButton(" ", 2, 4, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(jtf.getText() + " ");
            }
        });


        createButton("=", 3, 4, new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                jtf.setText(other.rezultat(jtf.getText()));
            }
        });

        GridBagConstraints gBC = new GridBagConstraints(0, 0, 5, 1, 0, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0);
        jfrm.setLocationRelativeTo(null);
        jfrm.add(jtf, gBC);
        jfrm.setVisible(true);
    }

    void createButton(String text, int x, int y, ActionListener listener) {
        JButton button = new JButton(text);
        GridBagConstraints gBC = new GridBagConstraints(x, y, 1, 1, 0, 0, GridBagConstraints.BASELINE, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0);
        button.setFocusable(false);
        button.addActionListener(listener);
        jfrm.add(button, gBC);
    }
}