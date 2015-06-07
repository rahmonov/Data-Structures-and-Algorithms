package data.structures.OrderedArray;

/***
 * Ordered array class with binary search in find()
 */
public class OrderedArray {

    private long[] a;
    private int nElems;

    public OrderedArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public int find(long searchKey){
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true){
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn] == searchKey)
                return curIn;                // found it
            else if(lowerBound > upperBound)
                return nElems;               // could not find it
            else{
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1;  // it is in upper half
                else
                    upperBound = curIn - 1;  // it is in lower half
            }

        }
    }

    public void insert(long value){
        int j;

        for(j = 0; j < nElems; j++){  // find where it should be inserted
            if(a[j] > value)          // linear search
                break;
        }

        for(int k = nElems; k>j; k--)  // move bigger ones up
            a[k] = a[k-1];

        a[j] = value;                  // insert it
        nElems++;
    }

    public boolean delete(long value){
        int j = find(value);

        if(j == nElems)
            return false;                     // could not find it
        else{
            for(int k = j; k < nElems; k++){
                a[k] = a[k+1];                // move bigger ones down
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
