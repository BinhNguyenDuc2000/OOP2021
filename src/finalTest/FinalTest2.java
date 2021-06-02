package finalTest;

import App.Input;
import pixel.PixelMap;

public class FinalTest2 {
    public static void main(String[] args) {
        Input newInput = new Input();
        PixelMap testABCD = newInput.getNewRoom().displayABCD();
        System.out.println(testABCD.getColumn());
    }
}
