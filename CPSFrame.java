import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;

class CPSFrame extends JFrame {
    private static final int WIDTH = 1200;
    private static final int HEIGHT = 480;
    private JButton clickBtn;
    private CPSEngine runner = new CPSEngine();
    private int seconds = 10;

    public CPSFrame(String framename) {
        super(framename);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        add(new CPSPanel());
        setResizable(false);
        setVisible(true);



        clickBtn = new JButton("Click here!");
        clickBtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        clickBtn.setBackground(Color.GREEN);
        clickBtn.setOpaque(true);
        clickBtn.setBounds(50, 50, 100, 100);
        clickBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                runner.test();
            }
        });
        add(clickBtn);
    }
}
