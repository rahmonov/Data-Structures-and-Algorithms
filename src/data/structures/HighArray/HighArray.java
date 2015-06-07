package data.structures.HighArray;

/***
 * An array class with high-level interface
 */
public class HighArray {

    private long[] a;  // 'database'
    private int nElems;  // number of elements

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;

        for(j=0; j<nElems; j++){
            if(a[j] == searchKey){  // found the item
                break;
            }
        }

        if(j == nElems)  // reached the end?
            return false;   // could not find it
        else
            return true;  // found it
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j;

        for(j=0; j<nElems; j++){
            if(value == a[j]){
                break;
            }
        }

        if(j == nElems)
            return false;
        else{
            for(int k = j; k<nElems; k++){  // move higher ones one step down
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }
    }

    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
