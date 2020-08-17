
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Queue_using_two_stacks {
    public static void main(String[] args) {
         
    }
    
     
    public final class MyQueue<E> {

        Stack<E> iStack = new Stack<>();
        Stack<E> oStack = new Stack<>();

        public void enqueue(E e) {
            iStack.push(e);
        }

        public E dequeue() {
            if (oStack.isEmpty()) {
                if (iStack.isEmpty()) {
                    throw new NoSuchElementException("No elements present in Queue");
                }
                while (!iStack.isEmpty()) {
                    oStack.push(iStack.pop());
                }
            }
            return oStack.pop();
        }

        public boolean isEmpty() {
            if (oStack.isEmpty() && iStack.isEmpty()) {
                return true;
            }
            return false;
        }

        public int size() {
            return iStack.size() + oStack.size();
        }

}
    }


 
