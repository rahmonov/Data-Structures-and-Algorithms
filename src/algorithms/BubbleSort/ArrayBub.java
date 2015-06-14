package algorithms.BubbleSort;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
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
     * Make around N^2/2 comparisons and N^2/4 swaps. Very slow
     */
    public void bubbleSort(){
        int out, in;
        for(out=nElems-1; out > 1; out--){   // backward outerloop
            for (in = 0; in < out; in++) {   // forward innerloop
                if(a[in] > a[in + 1])        // not in the right place?
                    swap(in, in + 1);        // swap them
            }
        }
    }

    private void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
