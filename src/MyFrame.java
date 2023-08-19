//import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MyFrame extends JFrame {

        BookCataloging bookCataloging = new BookCataloging();


        JLabel l1,l2,l3,l4,l5;
        JTextField textField;
        MyFrame(){

                while (true) {

//                        this.setTitle("Book Catalogue System"); //sets title of the frame
//                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out of the application
//                        this.setResizable(true); // prevents frame from being resized
//                        this.setSize(300,200); //sets the x-dimension and y-dimension of the frame
//                        this.setLayout(new GridLayout(5,1,1,1) );


//                        l1 = new JLabel("Choose an option: ");
//                        l2 = new JLabel("1. Add a book ");
//                        l3 = new JLabel("2. Display books ");
//                        l4 = new JLabel("3. Delete a book ");
//                        l5 = new JLabel("4. Exit");

                        String input = JOptionPane.showInputDialog("""
                                Choose an option\s
                                 1. Add a book\s
                                 2. Display books\s
                                 3. Delete a book\s
                                 4. Exit\s

                                 What would you like to do today?\s""");

                        if (input != null) {
                                try {
                                        int choice = Integer.parseInt(input);
                                        switch (choice){
                                                case 1 : {
                                                        String title = JOptionPane.showInputDialog("Enter Book title: ");
                                                        String author = JOptionPane.showInputDialog("Enter Book author: ");
                                                        bookCataloging.addBook(new Book(title,author));
                                                        JOptionPane.showMessageDialog(null, "Book added...", "Book Added", JOptionPane.INFORMATION_MESSAGE);
                                                        break;
                                                }
                                                case 2: {
                                                        bookCataloging.displayBooks();
                                                        JOptionPane.showMessageDialog(null,"Check your terminal" , "All Books", JOptionPane.INFORMATION_MESSAGE);
                                                        break;
                                                }
                                                case 3:{
                                                        String deleteTitle = JOptionPane.showInputDialog("Enter book title to delete: ");
                                                        bookCataloging.deleteBooks(deleteTitle);
                                                        JOptionPane.showMessageDialog(null,"Check your terminal" , "Delete action", JOptionPane.INFORMATION_MESSAGE);
                                                        break;
                                                }
                                                case 4: {
                                                        JOptionPane.showMessageDialog(null ,"Exiting the program..." , "Exit", JOptionPane.WARNING_MESSAGE);
                                                        System.exit(0);
                                                        break;
                                                }
                                                default:{
                                                        JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again.", "Invalid choice", JOptionPane.ERROR_MESSAGE);
                                                }

                                        }

                                } catch (NumberFormatException e) {
                                        // Handle the case where the user entered a non-numeric input
                                        JOptionPane.showMessageDialog(null, "Invalid choice. Please choose again.", "Invalid choice", JOptionPane.ERROR_MESSAGE);

                                }
                        } else {
                                // Handle the case where the user canceled the input dialog
                                JOptionPane.showMessageDialog(null ,"Exiting the program..." , "Exit", JOptionPane.WARNING_MESSAGE);
                                System.exit(0);
                        }


//                        this.add(l1);
//                        this.add(l2);
//                        this.add(l3);
//                        this.add(l4);
//                        this.add(l5);
//                        this.setVisible(true);
                }
        }
}


