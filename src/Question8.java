import java.awt.FlowLayout;
import javax.swing.*;

public class Question8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Demo");
        String[] languages = {"Java", "Pyton", "C++", "JavaScript"};
        JComboBox<String> langComboBo = new JComboBox<>(languages);
        JLabel selectedLabel=new JLabel("Selected : Java");
        langComboBo.addActionListener(e -> {
            String selectedLang = (String) langComboBo.getSelectedItem();
            selectedLabel.setText("Selected : " + selectedLang);
        });


        frame.setLayout(new FlowLayout());
        frame.add(langComboBo);
        frame.add(selectedLabel);
        frame.setSize(300, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}