import javax.swing.JOptionPane;
public class gui {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hi "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "Your are "+ age+ " year old.");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height(in m)"));
        JOptionPane.showMessageDialog(null, "Your are "+ height+ " m tall");

    }
    
}
