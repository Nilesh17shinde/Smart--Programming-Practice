package cognizantTask;

import java.util.Scanner;

public class CheckCount {
    private int size;

    public static void main(String[] args) {
        CheckCount chechCount = new CheckCount();
        chechCount.setSize(30);
        System.out.println("Size is: "+chechCount.getSize());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        this.size = s;
    }
}
