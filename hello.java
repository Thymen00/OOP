import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Enter name: ");
        name = scan.nextLine();
    }
}


// package FinalProject;

// import java.awt.BorderLayout;
// import java.awt.Component;
// import java.awt.event.ActionEvent;

// import javax.swing.JButton;
// import javax.swing.JFrame;

// public class MainPage extends JFrame implements ActionListener {
//     private JPanel panel;
//     private JLabel titleLabel;
//     private JButton enrollButton;
//     private JButton searchButton;
//     private JButton exitButton;

//     public MainPage(){
//         setTitle("Student information system");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(300,300);
//         setLocationRelativeTo(null);
        
//         Container contentPane = getContentPane();
//         contentPane.setLayout(new BorderLayout());

//         titleLabel = new JLabel("SIS Main Menu", SwingConstants.CENTER);
//         titleLabel.setForeground(Color.BLUE);
//         titleLabel.setFont(new Font(" ", Font.BOLD, 20));

//         enrollButton = new JButton("Enroll students");
//         enrollButton.addActionListener(this);
//         searchButton = new JButton("Search students");
//         searchButton.addActionListener(this);

//         exitButton = new JButton("Exit");
//         exitButton.addActionListener(this);

//         panel = new JPanel();
//         panel.setLayout(new GridLayout(3,1));
//         enrollButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//         searchButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//         exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);

//         panel.add(enrollButton);
//         panel.add(searchButton);
//         panel.add(exitButton);

//         add(titleLabel, BorderLayout.NORTH);
//         add(panel, BorderLayout.CENTER);
//         setVisible(true);
//     }
//     @Override
//     public void actionPerformed(ActionEvent e) {
//         String actionCommand = e.getActionCommand();
//         System.out.println(actionCommand);

//         if (actionCommand.equals("Enroll Students")) {

//         } else if (actionCommand.equals("Search Students")) {

//         } else if (actionCommand.equals("Exit")){
//             System.exit(0);
//         }
//         public static void main(String[] args) {
//             new MainPage();
//         }
//     }
    
// }



