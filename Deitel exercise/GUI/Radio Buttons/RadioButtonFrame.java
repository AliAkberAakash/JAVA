import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame
{
    private final JTextField textField;
    private final Font plainFont;
    private final Font boldFont;
    private final Font italicFont;
    private final Font bolditalicFont;
    private final JRadioButton plainJRadioButton;
    private final JRadioButton boldJRadioButton;
    private final JRadioButton italicJRadioButton;
    private final JRadioButton bolditalicJRadioButton;
    private final ButtonGroup radioGroup;

    public RadioButtonFrame()
    {
        super("RadioButtonTest");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change!", 25);
        add(textField);

        plainJRadioButton = new JRadioButton("Plain", true);
        boldJRadioButton = new JRadioButton("Bold", false);
        italicJRadioButton = new JRadioButton("Italic", false);
        bolditalicJRadioButton = new JRadioButton("Bold and Italic", false);
        add(plainJRadioButton);
        add(italicJRadioButton);
        add(boldJRadioButton);
        add(bolditalicJRadioButton);

        radioGroup = new ButtonGroup();
        radioGroup.add(plainJRadioButton);
        radioGroup.add(italicJRadioButton);
        radioGroup.add(boldJRadioButton);
        radioGroup.add(bolditalicJRadioButton);


        plainFont= new Font("Serif",Font.PLAIN,20);
        boldFont= new Font("Serif",Font.BOLD,20);
        italicFont= new Font("Serif",Font.ITALIC,20);
        bolditalicFont= new Font("Serif",Font.BOLD+Font.ITALIC,20);
        textField.setFont(plainFont);


        plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
        italicJRadioButton.addItemListener(new RadioButtonHandler(italicFont));
        boldJRadioButton.addItemListener(new RadioButtonHandler(boldFont));
        bolditalicJRadioButton.addItemListener(new RadioButtonHandler(bolditalicFont));
    }

    private class RadioButtonHandler implements ItemListener
    {
        private Font font;

        public RadioButtonHandler(Font f)
        {
            font=f;
        }

        @Override
        public void itemStateChanged(ItemEvent event)
        {
            textField.setFont(font);
        }

    }

}
