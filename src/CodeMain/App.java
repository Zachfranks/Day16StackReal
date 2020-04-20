package CodeMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class App {
    private JPanel PanelMain;
    private JButton btnpush;
    private JTextField txtmain;
    private JTextArea txtaDisplay;
    private JButton btnPop;
    double getNum;
    Stacking x;



    public App() {

        txtaDisplay.setEditable(true);
        x = new Stacking();

        btnpush.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer convert = Integer.parseInt(txtmain.getText());

                x.push(convert);

                LinkedList y = x.get();


                txtaDisplay.setText(String.valueOf(y));

            }
        });

        btnPop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x.pop();

                LinkedList y = x.get();

                txtaDisplay.setText(String.valueOf(y));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
