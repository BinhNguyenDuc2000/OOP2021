package Game;

import pixel.Pixel;
import pixel.PixelMap;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Map extends JFrame implements ActionListener {
    Color background_cl = Color.white;
    Color x_cl = Color.red;
    Color y_cl = Color.blue;

    public PixelMap getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(PixelMap currentMap) {
        this.currentMap = currentMap;
    }

    PixelMap currentMap;


    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    private int column, row;
    int Size = 0;
    Container cn;
    JPanel pn, pn2;
    JLabel lb;
    JButton newGame_bt, undo_bt, exit_bt;

    public Map(String s, PixelMap currentMap) {
        super(s);
        int column = currentMap.getColumn();
        int row = currentMap.getRow();

        this.setColumn(column);
        this.setRow(row);
        this.setCurrentMap(currentMap);

        JButton b[][] = new JButton[row + 2][column + 2];


        cn = this.getContentPane();
        pn = new JPanel();
        pn.setLayout(new GridLayout(row, column));
        for (int i = 0; i < row ; i++)
            for (int j = 0; j < column ; j++) {
                b[i][j] = new JButton(" ");
                b[i][j].setActionCommand(i + " " + j);
                int indexOfCheckPixel = i * column + j;
                boolean visiable = currentMap.getPixelList().get(indexOfCheckPixel).isVisible();

                if (visiable) {
                    b[i][j].setBackground(background_cl);
                } else {
                    b[i][j].setBackground(Color.black);
                }
                b[i][j].addActionListener(this);
            }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                pn.add(b[i][j]);
        newGame_bt = new JButton("New Game");
        undo_bt = new JButton("Undo");
        newGame_bt.addActionListener(this);
        undo_bt.addActionListener(this);
        cn.add(pn);
        pn2 = new JPanel();
        pn2.setLayout(new FlowLayout());
        pn2.add(newGame_bt);
        pn2.add(undo_bt);
        cn.add(pn2, "North");
//        this.setVisible(true);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        undo_bt.setEnabled(false);
    }

    public void actionShow() {
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "New Game") {
            new Map("s", this.getCurrentMap());
            this.dispose();
        } else if (e.getActionCommand() == "Undo") {
        } else if (e.getActionCommand() == "Exit") {
            System.exit(0);
            ;
        } else {
            String s = e.getActionCommand();
            int k = s.indexOf(32);
            int i = Integer.parseInt(s.substring(0, k));
            int j = Integer.parseInt(s.substring(k + 1, s.length()));
//			if (checkWin(i, j)) {
//				lb.setBackground(Color.MAGENTA);
//				lb.setText(b[i][j].getText() + " WIN");
//				for (i = 1; i <= column; i++)
//					for (j = 1; j <= row; j++)
//						b[i][j].setEnabled(false);
//				undo_bt.setEnabled(false);
//				newGame_bt.setBackground(Color.YELLOW);
//			}
        }
    }

//    public static void main(String[] args) {
//        CaRo firstFace = new CaRo("TNA demo", 4, 3);
//        String s = (String) JOptionPane.showInputDialog(
//                null, "Get data test",
//                "Customized Dialog",
//                JOptionPane.PLAIN_MESSAGE);
//        System.out.println(s);
//        if (s.equals("TONGANH")) {
//            firstFace.actionShow();
//        }
//    }
}