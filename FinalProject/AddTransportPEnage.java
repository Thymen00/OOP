package FinalProject;

import javax.swing.JFrame;

public class Enrol extends JFrame implements ActionListener {
    private EnrollPage() {
        JFrame frame = new JFrame("Student Information System");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
