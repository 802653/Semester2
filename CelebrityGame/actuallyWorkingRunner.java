//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class actuallyWorkingRunner {
    public static void main(String args[]) {

        //Creating the Frame
        String output = "";
        JFrame frame = new JFrame("Funny");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Emoji");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Cool");
        JMenuItem m22 = new JMenuItem("Funs");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Ni");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Input");
        JButton reset = new JButton("RE"); 
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        
        JTextField answerField = new JTextField("Type Celebrity Name");
        JTextField clueField= new JTextField("Type Celebrity Clue");
        
        
        panel.add(answerField);
        panel.add(clueField);
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        
        //Adding Components to the frame.

        frame.setVisible(true);

        send.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // display/center the jdialog when the button is pressed
                    System.out.println(send.getText());
                }
            });
    }
}