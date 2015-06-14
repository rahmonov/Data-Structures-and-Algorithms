package data.structures.Stack;

public class BracketChecker {

    private String input;

    public BracketChecker(String in){
        input = in;
    }

    public void check(){

        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            switch (ch){
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if(!theStack.isEmpty()){
                        char chx = theStack.pop();
                        if (ch == '}' && chx != '{' || ch == ']' && chx != '[' ||
                                ch == ')' && chx != '('){
                            System.out.println("Error: " + ch + " at " + i);
                        }
                    }else{
                        System.out.println("Error: " + ch + " at " + i);   // prematurely empty
                    }
                    break;
                default:
                    break;
            }
        }

        if(!theStack.isEmpty()){
            System.out.println("Error: missing right delimeter");
        }

    }


}
