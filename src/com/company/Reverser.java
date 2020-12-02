package com.company;

public class Reverser {

    //input String
    private String input;

    //output String
    private String output;

    //Constructor
    public Reverser(String in){
        input = in;
    }

    //Reverse the String
    public String doRev(){

        //get max stack size
        int stackSize = input.length();

        //make stack
        StackX theStack = new StackX(stackSize);

        for (int j=0; j < input.length(); j++){

            //get char from input
            char ch = input.charAt(j);

            //push it
            theStack.push(ch);
        }
        output = "";
        while ( !theStack.isEmpty()){

            //pop a char
            char ch = theStack.pop();

            //append to output
            output = output + ch;
        }
        return output;
    }
}
