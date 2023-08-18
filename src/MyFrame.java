import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
        MyFrame(){
                this.setTitle("JFrame title goes here"); //sets title of the frame
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of the application
                this.setResizable(false); // prevents frame from being resized
                this.setSize(420,420); //sets the x-dimension and y-dimension of the frame
                this.setLayout(new FlowLayout());


                JPanel instructions=new JPanel();
                instructions.setBackground(Color.red);
                instructions.setBounds(0,0,250,250);
                instructions.setPreferredSize(new Dimension(100,250));
                instructions.setLayout(new FlowLayout());

                this.add(instructions);
                this.setVisible(true); // make frame visible

        }
        }


