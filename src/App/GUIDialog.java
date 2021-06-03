package App;

import javax.swing.*;
import java.awt.*;

public class GUIDialog extends JDialog {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//    create label
    private JLabel coordinates1 = new JLabel("Coordinates 1");
    private JLabel coordinates2 = new JLabel("Coordinates 2");
    private JLabel coordinates3 = new JLabel("Coordinates 3");
    private JLabel coordinates4 = new JLabel("Coordinates 4");
    private JLabel coordinates5 = new JLabel("Coordinates 5");
    private JLabel coordinates6 = new JLabel("Coordinates 6");
    private JLabel coordinates7 = new JLabel("Coordinates 7");
    private JLabel coordinates8 = new JLabel("Coordinates 8");


    //    get data
    private JTextField coordinates1Field = new JTextField();
    private JTextField coordinates2Field = new JTextField();
    private JTextField coordinates3Field = new JTextField();
    private JTextField coordinates4Field = new JTextField();
    private JTextField coordinates5Field = new JTextField();
    private JTextField coordinates6Field = new JTextField();
    private JTextField coordinates7Field = new JTextField();
    private JTextField coordinates8Field = new JTextField();

    public GUIDialog(Frame frame, String title) {
        super(frame, title);
        setSize(600, 400);
        setLayout(null);
        setResizable(false);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();


        int x = (int) ((dimension.getWidth()) - 600) / 2;
        int y = (int) ((dimension.getHeight()) - 400) / 2;
        setLocation(x, y);

        coordinates1.setSize(200, 30);
        coordinates1.setLocation(100, 20);
        add(coordinates1);
        coordinates1Field.setSize(200, 30);
        coordinates1Field.setLocation(300, 20);
        add(coordinates1Field);

        coordinates2.setSize(200, 30);
        coordinates2.setLocation(100, 60);
        add(coordinates2);
        coordinates2Field.setSize(200, 30);
        coordinates2Field.setLocation(300, 60);
        add(coordinates2Field);

        coordinates3.setSize(200, 30);
        coordinates3.setLocation(100, 100);
        add(coordinates3);
        coordinates3Field.setSize(200, 30);
        coordinates3Field.setLocation(300, 100);
        add(coordinates3Field);

        coordinates4.setSize(200, 30);
        coordinates4.setLocation(100, 140);
        add(coordinates4);
        coordinates4Field.setSize(200, 30);
        coordinates4Field.setLocation(300, 140);
        add(coordinates4Field);

        coordinates5.setSize(200, 30);
        coordinates5.setLocation(100, 180);
        add(coordinates5);
        coordinates5Field.setSize(200, 30);
        coordinates5Field.setLocation(300, 180);
        add(coordinates5Field);

        coordinates6.setSize(200, 30);
        coordinates6.setLocation(100, 220);
        add(coordinates6);
        coordinates6Field.setSize(200, 30);
        coordinates6Field.setLocation(300, 220);
        add(coordinates6Field);

        coordinates7.setSize(200, 30);
        coordinates7.setLocation(100, 260);
        add(coordinates7);
        coordinates7Field.setSize(200, 30);
        coordinates7Field.setLocation(300, 260);
        add(coordinates7Field);

        coordinates8.setSize(200, 30);
        coordinates8.setLocation(100, 300);
        add(coordinates8);
        coordinates8Field.setSize(200, 30);
        coordinates8Field.setLocation(300, 300);
        add(coordinates8Field);

        setVisible(false);
        setModal(true);
    }

    public static void main(String[] args) {
        GUIDialog test = new GUIDialog(null, "Rec");
        test.setVisible(true);
    }
}
