package App;

import Game.Map;
import geometry.point.Point;
import pixel.PixelMap;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends GUIFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JButton button(PixelMap pmap, String title){
        JButton b = new JButton(title);// tạo button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Map test1 = new Map(title,  pmap);
                test1.setVisible(true);
            }
        });
        return b;
    }
    public App() {
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        
        Input newInput = new Input();

        PixelMap ABCD = newInput.getNewRoom().displayABCD();
        PixelMap EFGH = newInput.getNewRoom().displayEFGH();
        PixelMap ABEF = newInput.getNewRoom().displayABEF();
        PixelMap CDHG = newInput.getNewRoom().displayCDHG();
        PixelMap BCGF = newInput.getNewRoom().displayBCGF();
        PixelMap DAEH = newInput.getNewRoom().displayDAEH();
//        JButton createButton = new JButton("Create");
//        createButton.setSize(100, 40);
//        createButton.setLocation(130, 110);

//        JButton addButton = new JButton("Add item to the order");
//        JButton delButton = new JButton("Delete item by Id");
//        JButton displayButton = new JButton("Display the items of list order ");

        JButton buttonABCD =  button(ABCD,"ABCD");
        buttonABCD.setBounds(200, 10, 200, 40);
        add(buttonABCD);

        JButton buttonEFGH =  button(EFGH,"EFGH");
        buttonEFGH.setBounds(200, 60, 200, 40);
        add(buttonEFGH);

        JButton buttonABEF =  button(ABEF,"ABEF");
        buttonABEF.setBounds(200, 110, 200, 40);
        add(buttonABEF);

        JButton buttonCDHG =  button(CDHG,"CDHG");
        buttonCDHG.setBounds(200, 160, 200, 40);
        add(buttonCDHG);

        JButton buttonBCGF =  button(BCGF,"BCGF");
        buttonBCGF.setBounds(200, 210, 200, 40);
        add(buttonBCGF);

        JButton buttonDAEH =  button(DAEH,"DAEH");
        buttonDAEH.setBounds(200, 260, 200, 40);
        add(buttonDAEH);


//        System.out.println(per);
        JButton buttonper =  new JButton("Visible Percentage");
        buttonper.setBounds(200, 310, 200, 40);
        add(buttonper);
        buttonper.addActionListener(new ActionListener() {
            double per = newInput.getNewRoom().getVisiblePercentage();
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Visible Percentage: "+per+"%");
            }
        });


        JButton checkVisible =  new JButton("Check Visible");
        checkVisible.setBounds(200, 360, 200, 40);
        add(checkVisible);
        checkVisible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
	            	double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap x", "X",
	                        JOptionPane.INFORMATION_MESSAGE));
	                double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap y", "Y",
	                        JOptionPane.INFORMATION_MESSAGE));
	                double z = Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap z", "Z",
	                        JOptionPane.INFORMATION_MESSAGE));
	                Point newPoint = new Point(x,y,z);
	                boolean visible = newInput.getNewRoom().isVisible(newPoint);
	                if(visible){
	                    JOptionPane.showMessageDialog(null, "Visible!!!");
	                } else {
	                    JOptionPane.showMessageDialog(null, "Can't be seen!!!");
	
	                }
                }
                catch (Exception exception) {
//					System.out.println(exception);
				}

            }
        });



    }

    public static void main(String[] args) {

        new App();
    }
}
