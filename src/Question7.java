import javax.swing.*;
import java.awt.FlowLayout;

public class Question7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Demo");
        JRadioButton maleRadio=new JRadioButton("Male");
        JRadioButton femaleRadio=new JRadioButton("Female");

        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Select Gender:"));
        frame.add(maleRadio);
        frame.add(femaleRadio);
        frame.setSize(310, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}