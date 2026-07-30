import javax.swing.*;
import java.awt.FlowLayout;

public class Question6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Demo");
        JCheckBox agreeBox=new JCheckBox("I Agree To terms");
        JButton submitBtn=new JButton("Submit");
        submitBtn.setEnabled(false);
        submitBtn.setEnabled(agreeBox.isSelected());
        frame.setLayout(new FlowLayout());
        frame.add(agreeBox);
        frame.add(submitBtn);
        frame.setSize(280, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}