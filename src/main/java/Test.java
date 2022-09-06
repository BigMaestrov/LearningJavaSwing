import javax.swing.*;
import java.awt.event.*;

public class Test extends JDialog {
    private JPanel contentPane;
    private JButton загрузитьButton;
    private JTextField путьКФайлуTextField;
    private JTextField сдвигатьКодыНаTextField;
    private JCheckBox a1CheckBox;
    private JCheckBox a2CheckBox;
    private JCheckBox a3CheckBox;
    private JTextField верхниеСтрокиИзображенийTextField;
    private JTextField a300TextField;
    private JButton задатьButton;
    private JTextField визуализируемыеМатрицы3КTextField;
    private JCheckBox a1CheckBox1;
    private JCheckBox a2CheckBox1;
    private JCheckBox a3CheckBox1;
    private JCheckBox a4CheckBox;
    private JCheckBox a5CheckBox;
    private JCheckBox a6CheckBox;
    private JScrollBar scrollBar1;
    private JTextField координатыКурсораTextField;
    private JTextField x3KTextField;
    private JTextField a810TextField;
    private JTextField xМатрицаTextField;
    private JTextField a810TextField1;
    private JTextField yTextField;
    private JTextField a302TextField;
    private JTextField яркостьTextField;
    private JTextField a127TextField;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Test() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Test dialog = new Test();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
