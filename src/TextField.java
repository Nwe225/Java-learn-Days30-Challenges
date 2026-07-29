import javax.swing.*;
import java.awt.FlowLayout;

public class TextField {
    public static void main(String[] args){
        JFrame frame=new JFrame("Greeting App");
        JTextField nameField=new JTextField(15);
        JButton submitButton=new JButton("Greet");
        JLabel messageLabel=new JLabel("Enter your name above.");
        submitButton.addActionListener(e->
        {
            String name=nameField.getText();
            messageLabel.setText("Hello,"+name+"!");
        });
        frame.setLayout(new FlowLayout());
        frame.add(nameField);
        frame.add(messageLabel);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}