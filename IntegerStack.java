import java.util.ArrayDeque;
import java.util.Deque;

class IntegerStack {
    private Deque<Integer> stack;

    public IntegerStack() {
        stack = new ArrayDeque<>();
    }

    // a. Push element
    public void push(Integer value) {
        stack.push(value);
        System.out.println("Pushed: " + value);
    }

    // b. Pop element
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return null;
        }
        Integer value = stack.pop();
        System.out.println("Popped: " + value);
        return value;
    }

    // c. Check if stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Display stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents (top to bottom): " + stack);
        }
    }
}

