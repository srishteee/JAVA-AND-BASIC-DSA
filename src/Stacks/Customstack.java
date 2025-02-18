package Stacks;

public class Customstack<T>{

    private  T[] stack;
    private int top;
    private int maxSize;

    public Customstack(int size){
        maxSize = size;
        stack = (T[]) new Object[size];
        top=-1;
    }

//    public void push(int value){
//        if(top<maxSize-1){
//            stack[++top] = value;
//            System.out.println(value + "pushed");
//        } else {
//            System.out.println("stack is full");
//        }
//    }

    public void push(T value ) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println(value + " pushed");
        } else {
            System.out.println("Stack is full");
        }
    }

    

    @Override
    public String toString() {
        if (top == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    }
