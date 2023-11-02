/**
 *
 * @author Purvam Sheth
 */
import java.util.Scanner;

public class Stack<T> {

    private final int size;
    private int cap;
    private T[] stackelement;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.size = size > 0 ? size : 10;
        cap = -1;
        stackelement = (T[]) new Object[this.size];
    }

    public void push(T item) {
        if (full()) {
            System.out.println("Stack is full");
            return;
        }
        stackelement[++cap] = item;

    }

    public T pop() {
        if (empty()) {
            System.out.println("Stack is empty");
        }
        return stackelement[cap--];
    }

    public boolean empty() {
        return (cap == -1);
    }

    public boolean full() {
        return (cap == size - 1);
    }

    public void printStack() {
        for (int i = 0; i <= cap; i++) {
            System.out.print(stackelement[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String firstStack = scr.nextLine();
        char[] mainCharArr = firstStack.toCharArray();
        Stack<Character> charStack = new Stack<Character>(mainCharArr.length + 1);

        String intString = scr.nextLine();
        String[] intStringArray = intString.split(" ");

        int intArray[] = new int[intStringArray.length];
        for (int j = 0; j < intStringArray.length; j++) {
            intArray[j] = Integer.parseInt(intStringArray[j]);
        }

        Stack<Integer> intStack = new Stack<Integer>(intArray.length + 1);
        String secondStack = scr.nextLine();
        char[] secondCharArr = secondStack.toCharArray();

        for (char character : mainCharArr) {
            charStack.push(character);
        }

        for (int num : intArray) {
            intStack.push(num);
        }

        int popNum = intStack.pop();

        for (int j = 0; j < popNum; j++) {
            charStack.pop();
        }

        for (char character : secondCharArr) {
            charStack.push(character);
        }

        charStack.printStack();
        intStack.printStack();

        scr.close();
    }
}
