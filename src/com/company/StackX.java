package com.company;

public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    //constructor
    public StackX(int max){
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    //put item on top of the stack
    public void push(char j){
        stackArray[++top] = j;
    }

    //take item rom top of the stack
    public char pop(){
        return stackArray[top--];
    }

    //peek at top of the stack
    public char peek(){
        return stackArray[top];
    }

    //true if stack is empty
    public boolean isEmpty(){
        return (top == -1);
    }
}
