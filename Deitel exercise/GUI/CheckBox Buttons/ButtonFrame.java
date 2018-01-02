import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame
{
    private final JButton plainButton;
    private final JButton fancyButton;

    public ButtonFrame()
    {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainButton = new JButton("Plain Button");
        add(plainButton);

        Icon icon1 = new ImageIcon(getClass().getResource("bug1logo.png"));
        //Icon icon2 = new ImageIcon(getClass().getResource("icon2.gif"));

        fancyButton = new JButton("Fancy Button", icon1);
        //fancyButton.setRolloverIcon(icon2);
        add(fancyButton);

        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        fancyButton.addActionListener(handler);

    }

    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
           JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You Pressed: %s", event.getActionCommand()));
        }

    }

}
