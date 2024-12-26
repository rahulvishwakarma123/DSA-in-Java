import java.util.Stack;
import java.util.Queue;
import java.util.Deque;
import java.util.LinkedList;

public class Queues {


    static void printSlidingWindowMaximumBruteForce(int arr[], int N, int K) {
        for (int i = 0; i <= N - K; i++) {

            int currMax = arr[i];

            for (int j = 1; j < K; j++) {
                if (arr[i + j] > currMax)
                    currMax = arr[i + j];
            }
            System.out.print(currMax + " ");
        }
    }


    static void printSlidingWindowMaximumDeque(int arr[], int N, int K) {

        Deque<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < K; ++i) {

            // For every element, the previous
            // smaller elements are useless so
            // remove them from Qi
            while (!queue.isEmpty()
                    && arr[i] >= arr[queue.peekLast()])
                // Remove from rear
                queue.removeLast();

            // Add new element at rear of queue
            queue.addLast(i);
        }

        // Print first window maximum
        System.out.print(arr[queue.peek()] + " ");

        // Process rest of the elements,
        // i.e., from arr[k] to arr[n-1]
        for (int i = K; i < N; ++i) {

            // Remove the elements which
            // are out of this window
            while ((!queue.isEmpty()) && queue.peek() <= i - K)
                queue.removeFirst();

            // Remove all elements smaller
            // than the currently
            // being added element (remove
            // useless elements)
            while ((!queue.isEmpty())
                    && arr[i] >= arr[queue.peekLast()])
                queue.removeLast();
            // Add current element at the rear of Qi
            queue.addLast(i);

            // Print the maximum element of last window
            System.out.print(arr[queue.peek()] + " ");
        }
    }


    static void reverseQueueFirstKElementsUsingStack(Queue<Integer> queue, int k) {
        if (queue.isEmpty() == true || k > queue.size())
            return;
        if (k <= 0)
            return;

        Stack<Integer> stack = new Stack<Integer>();

        // Push the first K elements into a Stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }

        // Enqueue the contents of stack
        // at the back of the queue
        while (!stack.empty()) {
            queue.add(stack.peek());
            stack.pop();
        }

        // Remove the remaining elements and enqueue
        // them at the end of the Queue
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }


    static void reverseQueueFirstKElementsUsingRecursion(Queue<Integer> queue, int k) {
        helper(queue, k); // Step 1 and 2
        int sz = queue.size() - k; // Step 3
        while (sz-- > 0) {
            int x = queue.poll();
            queue.add(x);
        }
    }


    static void helper(Queue<Integer> queue, int k) {
        if (k == 0)
            return;
        int front = queue.peek();
        queue.poll();
        helper(queue, k - 1);
        queue.add(front);
    }

   
   
    // Driver code
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int K = 3;

        printSlidingWindowMaximumDeque(arr, arr.length, K);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        reverseQueueFirstKElementsUsingStack(queue, k);

        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
}
