package data.structures.Stack;

/**
 * Class that reverses a string with the help of Stack.
 */
public class Reverser {

    private String input;
    private String output;

    public Reverser(String in){
        input = in;
    }

    public String doRev(){
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            theStack.push(ch);
        }
        output = "";

        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            output = output + ch;
        }

        return output;
    }

}
