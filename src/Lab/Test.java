package lab;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        // Make a new ArrayList variable called bulbasaur, that stores only integer
        // values
        // Add items into bulbasaur until it contains the following values (in this
        // order):
        // 51, 87, 17, 85, 28, 51
        // Write a for loop or for each loop that will output all the items in
        // bulbasaur, ONE ITEM ON EACH LINE

        ArrayList<Integer> bulbasaur = new ArrayList<Integer>();
        bulbasaur.add(51);
        bulbasaur.add(87);
        bulbasaur.add(17);
        bulbasaur.add(85);
        bulbasaur.add(28);
        bulbasaur.add(51);

        for (Integer b : bulbasaur) {
            System.out.println(b);
        }

    }
}