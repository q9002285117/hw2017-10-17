import javafx.scene.control.PasswordField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JLabel jlbID = new JLabel("ID:");
    private JLabel jlbPW = new JLabel("Password:");
    private JTextField jtf = new JTextField();
    private JPasswordField jpf = new JPasswordField();
    private JButton jbtnexit = new JButton("Exit");
    private JButton jbtngo = new JButton("Go");
    private int width = 300, height = 200, Swidth, Sheight;
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private Container cp;

    public LoginFrame() {
        init();
    }

    private void init() {
        Swidth = dim.width;
        Sheight = dim.height;
        this.setBounds(Swidth / 2 - width / 2, Sheight / 2 - height / 2, width, height);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(3, 2, 3, 10));
        cp.add(jlbID);
        cp.add(jtf);
        cp.add(jlbPW);
        cp.add(jpf);
        cp.add(jbtnexit);
        cp.add(jbtngo);
        jlbID.setHorizontalAlignment(SwingConstants.RIGHT);
        jlbPW.setHorizontalAlignment(SwingConstants.RIGHT);

        jbtnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbtngo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jtf.getText().equals("h304") && new String(jpf.getPassword()).equals("23323456")) {
                    MainFrame mf = new MainFrame(LoginFrame.this);
                    mf.setVisible(true);
                    LoginFrame.this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "Wrong ID or Password");
                }
            }
        });
    }
}
