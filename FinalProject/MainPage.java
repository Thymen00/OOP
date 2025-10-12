package FinalProject;

import java.awt.*;
import java.awt.Component;
import java.awt.event.*;

import javax.naming.directory.SearchControls;
import javax.swing.*;


public class MainPage extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel;
    private JButton enrollButton;
    private JButton searchButton;
    private JButton exitButton;

    public MainPage(){
        setTitle("Student information system");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        setLocationRelativeTo(null);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        titleLabel = new JLabel("SIS Main Menu", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font(" ", Font.BOLD, 20));

        enrollButton = new JButton("Enroll students");
        enrollButton.addActionListener(this);
        
        searchButton = new JButton("Search students");
        searchButton.addActionListener(this);

        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        enrollButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        searchButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(Box.createVerticalStrut(20));
        panel.add(enrollButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(searchButton);
        panel.add(Box.createVerticalStrut(10));
        panel.add(exitButton);
        panel.add(Box.createVerticalStrut(30));

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if (actionCommand.equals("Enroll Students")) {
            new EnrollPage();
        } else if (actionCommand.equals("Search Students")) {
            new SearchPage();
        } else if (actionCommand.equals("Exit")){
            int chosenOption = JOptionPane.showConfirmDialog(this, "Do you want to exit the program? ", "Student Information System", JOptionPane.OK_CANCEL_OPTION);
            
            if(chosenOption == JOptionPane.OK_OPTION)
            System.exit(0);
        }
        
        }
        public static void main(String[] args) {
            new MainPage();
    }
    
}
