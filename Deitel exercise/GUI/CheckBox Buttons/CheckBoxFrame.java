import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CheckBoxFrame extends JFrame
{
    private final JTextField textField;
    private final JCheckBox boldJCheckBox;
    private final JCheckBox italicJCheckBox;
    //private final JButton  clickMe;

    public CheckBoxFrame()
    {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change!");
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox= new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);

//        Icon girlIcon = new ImageIcon(getClass().getResource("bug1logo.png"));
//        clickMe = new JButton("Click Me!", girlIcon);
//        add(clickMe);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);
//        ButtonHandler handler2 = new ButtonHandler();
//        clickMe.addActionListener(handler2);

    }

    private class CheckBoxHandler implements ItemListener
    {
        @Override
        public void itemStateChanged(ItemEvent event)
        {



            Font font = null;

            if(boldJCheckBox.isSelected() && italicJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD+Font.ITALIC,14);
            else if (boldJCheckBox.isSelected())
                font = new Font("Serif", Font.BOLD, 14);
            else if (italicJCheckBox.isSelected())
                font = new Font("Serif", Font.ITALIC, 14);
            else
                font=new Font("Serif", Font.PLAIN, 14);

            textField.setFont(font);
        }

    }

//    private class ButtonHandler implements ActionListener
//    {
//        @Override
//        public void actionPerformed(ActionEvent event)
//        {
//           JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You Pressed: %s", event.getActionCommand()));
//        }
//
//    }

}
