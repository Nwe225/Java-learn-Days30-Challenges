import javax.swing.*;
import java.awt.event.*;

public class Button {
    public static void main(String[] args){
        JFrame frame=new JFrame("Button Event Demo");
        JLabel label=new JLabel("Status:Waiting...",JLabel.CENTER);
        JButton button=new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Status:Button Clicked!");
            }
        });
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(button);
        frame.add(label);

        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}