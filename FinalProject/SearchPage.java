package FinalProject;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SearchPage extends JFrame implements ActionListener{
    private JTextField minCapTxt, miinSpeedTxt, modelTxt;
    private JTextArea resultArea;
    private JButton searchBtn, backBtn;

    public SearchPage() {
        super("Search Transport");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(600,400);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Transport Search Module", SwingConstants.CENTER);
        title.setFont(new Font("", Font.BOLD, 20));
        add(title, BorderLayout.NORTH);

        JPanel fields = new JPanel(new GridLayout(3,2));
        fields.add(new JLabel("Min Capacity:"));
        minCapTxt = new JTextField();
        fields.add(minCapTxt);
        fields.add(new JLabel("Min Capacity:"));
        minCapTxt = new JTextField();
        fields.add(minCapTxt);
    

       
    }
}
