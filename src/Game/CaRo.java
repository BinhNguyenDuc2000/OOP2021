package Game;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CaRo extends JFrame implements ActionListener {
    Color background_cl = Color.white;
    Color x_cl = Color.red;
    Color y_cl = Color.blue;

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

    public CaRo(String s, int columns, int rows) {
        super(s);
        this.setColumn(columns);
        this.setRow(rows);
        int column = this.getColumn();
        int row = this.getRow();
        JButton b[][] = new JButton[column + 2][row + 2];
        System.out.printf("col %d\n", column);
        System.out.printf("row %d\n", row);

        cn = this.getContentPane();
        pn = new JPanel();
        pn.setLayout(new GridLayout(column, row));
        for (int i = 0; i <= column + 1; i++)
            for (int j = 0; j <= row + 1; j++) {
                b[i][j] = new JButton(" ");
                b[i][j].setActionCommand(i + " " + j);
                if (j % 2 == 0) {
                    b[i][j].setBackground(background_cl);
                } else {
                    b[i][j].setBackground(Color.black);
                }
                b[i][j].addActionListener(this);
            }
        for (int i = 1; i <= column; i++)
            for (int j = 1; j <= row; j++)
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
            new CaRo("s", this.getColumn(), this.getRow());
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