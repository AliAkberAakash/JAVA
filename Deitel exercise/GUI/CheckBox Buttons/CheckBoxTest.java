import javax.swing.JFrame;

public class CheckBoxTest
{

    public static void main(String[] args)
    {
        CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
        checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBoxFrame.setSize(300,130);
        checkBoxFrame.setVisible(true);
        ButtonFrame buttonFrame = new ButtonFrame();
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(300,230);
        buttonFrame.setVisible(true);
    }

}
