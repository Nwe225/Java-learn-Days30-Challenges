import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
    public static void main(String[] args){
        JFrame frame=new JFrame("Label Demo");
        JLabel label=new JLabel("Welcome to Java GUI", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}