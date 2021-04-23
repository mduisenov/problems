package hackerrank.data_structures.promlems;

import java.util.Stack;

public class QueueWithTwoStacks<T>{

        private Stack<T> stackNewestOnTop = new Stack<>();
        private Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T data) {
            stackNewestOnTop.push(data);
        }

        public T dequeue() {
            shiftStacks();
            return stackOldestOnTop.pop();
        }

        public T peek() {
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        private void  shiftStacks() {
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

}
