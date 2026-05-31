package Stack;
import java.util.*;

//Link: https://leetcode.com/problems/min-stack/description/
//T.C: O(1)
//S.C: O(N to 2N)
public class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
/*
    List<Integer> list = new ArrayList<>();
    List<Integer> minList =  new ArrayList<>();
    int top;
    public MinStack() {
        top = -1;
    }

    public void push(int val) {
        list.add(val);
        if(top == -1 || val < minList.get(top)) {
            minList.add(val);
        } else {
            minList.add(Math.min(val, minList.get(top)));
        }
        top++;
    }

    public void pop() {
        int x = list.get(top);
        list.remove(top);
        minList.remove(top);
        top--;
    }

    public int top() {
        return list.get(top);
    }

    public int getMin() {
        return minList.get(top);
    }
    }
 */

