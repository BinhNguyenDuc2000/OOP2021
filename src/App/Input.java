package App;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Logger;

public class Input extends JFrame {
    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    private String fileURL;

    public static void main(String[] args) throws FileNotFoundException {
        JFrame parentFrame = new JFrame();
        Input app1 = new Input();
        JFileChooser fileChooser = new JFileChooser();
        File fos = new File("F:\\Study\\2020-2\\OOP\\OOP2021\\test.txt");
        try {
            FileWriter dos = new FileWriter(fos);


            fileChooser.setDialogTitle("Specify a file to save");

            int userSelection = fileChooser.showSaveDialog(parentFrame);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                System.out.println("Save as file: " + fileToSave.getAbsolutePath());
                app1.setFileURL(fileToSave.getAbsolutePath());
            }
            System.out.println(app1.getFileURL());
            String url = app1.getFileURL();
            FileInputStream fileInputStream = new FileInputStream(url);
//       Read file
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                String currentLine = scanner.nextLine();
                System.out.println(currentLine);
                int pos1 = currentLine.indexOf('(');
                int pos2 = currentLine.indexOf(')');
                while (pos1 * pos2 != 1) {
                    String coordinate = currentLine.substring(pos1 + 1, pos2);
                    coordinate = coordinate.replaceAll("\\s+", "");
                    String[] test = coordinate.split(",");
                    System.out.println(coordinate);
                    for (String i : test) {
                        System.out.println(i);
                        dos.write(i+" ");
                    }
                    dos.write("\n");
                    pos1 = currentLine.indexOf('(', pos1 + 1);
                    pos2 = currentLine.indexOf(')', pos2 + 1);
                }
            }
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
