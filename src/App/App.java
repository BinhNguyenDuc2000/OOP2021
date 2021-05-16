package App;

import Game.CaRo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends GUIFrame {
    public App() {
        JButton createButton = new JButton("Create");
        createButton.setSize(100, 40);
        createButton.setLocation(130, 110);

        JButton addButton = new JButton("Add item to the order");
        JButton delButton = new JButton("Delete item by Id");
        JButton displayButton = new JButton("Display the items of list order ");

        JButton b = new JButton("click");// tạo button
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap row", "Row",
                        JOptionPane.INFORMATION_MESSAGE));
                int col = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhap col", "col",
                        JOptionPane.INFORMATION_MESSAGE));
                CaRo test1 = new CaRo("tong ngoc anh", col, row);
                test1.setVisible(true);
            }
        });
        b.setBounds(130, 50, 100, 40);
        add(b);// thêm button vào JFrame
        add(createButton);
        add(addButton);
        add(delButton);
        add(displayButton);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();
    }
}
