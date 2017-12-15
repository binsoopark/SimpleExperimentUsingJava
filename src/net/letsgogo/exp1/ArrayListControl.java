package net.letsgogo.exp1;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListControl {

    public static void main(String[] args) {
        ArrayListControl ex1 = new ArrayListControl();

        ArrayList<String> arrListStrings = new ArrayList<>();

        arrListStrings.add("A");
        arrListStrings.add("B");

        ex1.debug(arrListStrings.get(0)+" - size: "+arrListStrings.size());
        arrListStrings.remove(0);
        ex1.debug(arrListStrings.get(0)+" - size: "+arrListStrings.size());

        arrListStrings.add("C");

        arrListStrings.remove(0);
        ex1.debug(arrListStrings.get(0)+" - size: "+arrListStrings.size());

        for(int i = 10;i<20;i++) {
            arrListStrings.add(String.valueOf(i));
            ex1.debug(arrListStrings.get(0)+" - size: "+arrListStrings.size());
            arrListStrings.remove(0);
        }

    }

    private void debug(String str) {
        System.out.println("["+new Date(System.currentTimeMillis()).toString()+"] "+str);
    }
}
