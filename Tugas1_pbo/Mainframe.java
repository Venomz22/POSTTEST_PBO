package src;
import java.awt.*;
import javax.swing.*;

public class Mainframe extends JFrame{
    final private Font mainfont = new Font("Geneva", Font.BOLD, 25);
    public void initialize(User user){
        
        JLabel lbLoginForm = new JLabel("Login Form",SwingConstants.CENTER);
        lbLoginForm.setFont(mainfont);
        
        JLabel lbtext = new JLabel("SELAMAT DATANG");
        lbtext.setFont(mainfont);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0,1,10,10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        formPanel.add(lbLoginForm);
        formPanel.add(lbtext);

        add(formPanel, BorderLayout.NORTH);
        setTitle("SELAMAT DATANG");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(900,600);
        setMinimumSize(new Dimension(350,450));

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
