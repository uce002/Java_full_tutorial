import javax.swing.JOptionPane;
public class Chapter6_GUI_intro {

    public static void main(String[] args) {

        //input and output dialogue boxes
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //returns string from the user. parseInt converts to int to store it in age.
        JOptionPane.showMessageDialog(null, "You are "+ age+ " years old");

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are "+ height+ " cm tall");




    }
}
