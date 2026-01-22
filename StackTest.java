public class StackTest {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();

        stack.pop();           // last pop
        stack.pop();           // try popping from empty stack

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}