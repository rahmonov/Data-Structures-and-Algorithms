package algorithms.InsertionSort;

import java.util.Random;

public class InsertSortApp {
    public static void main(String[] args) {
        ArrayIns arr = new ArrayIns(100);
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            arr.insert(rand.nextInt(1000));
        }

        arr.display();
        arr.insertionSort();
        arr.display();
    }
}
