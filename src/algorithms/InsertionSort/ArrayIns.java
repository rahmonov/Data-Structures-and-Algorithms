package algorithms.InsertionSort;

public class ArrayIns {

    private long[] a;
    private int nElems;

    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }

    /***
     * O(N^2) speed, the same as Bubble Sort and Selection Sort. But for almost sorted
     * data it is the best choice
     */
    public void insertionSort(){
        int in, out;

        for(out=1; out<nElems; out++){
            long temp = a[out];
            in = out;

            while (in > 0 && a[in - 1] >= temp){
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
