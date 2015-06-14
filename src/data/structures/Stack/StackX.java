package data.structures.Stack;


public class StackX {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int s){
        maxSize = s;
        stackArray = new char[maxSize];
        top = -1;   // no items yet
    }

    public void push(char j){
        stackArray[++top] = j;   // insert item after incrementing top
    }

    public char pop(){
        return stackArray[top--];   // access item and decrement top
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }

}
