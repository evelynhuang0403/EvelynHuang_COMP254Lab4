package Exercise2;

public class TransferStack {
    // Implement a method with signature transfer(S, T) that transfers all elements from stack S onto stack T,
    // so that the element that starts at the top of S is the first to be inserted onto T,
    // and the element at the bottom of S ends up at the top of T. Write the necessary code to test the method.

    // Stack S: [1, 2, 3] -> T [3, 2, 1]
    public static <E> void transfer(Stack<E> S, Stack<E> T){
        // Transfer elements from S to tempStack
        while (!S.isEmpty()) {
            T.push(S.pop());
        }
    }

    public static void main(String[] args) {
        // Example usage of the transfer method
        Stack<Integer> stack1 = new ArrayStack<>(3);
        Stack<Integer> stack2 = new ArrayStack<>(3);

        // Push elements onto stack1
        stack1.push(1); //- bottom
        stack1.push(2);
        stack1.push(3); //- top

        // Print the contents of stack1
        System.out.println("Contents of stack1: " + stack1);

        // Transfer elements from stack1 to stack2
        System.out.println("Transferring elements from stack1 to stack2...");
        transfer(stack1, stack2);

        // Print the contents of stack2
        System.out.println("Contents of stack2: " + stack2);
    }
}
