import java.util.*;

public class ReverseQueueUsingStack {
    static Queue<Integer> que;

    static void reversequeue(){
        Stack<Integer> st = new Stack<>();
        while(!que.isEmpty()){
            st.push(que.remove());
        }
        while(!st.isEmpty()){
            que.add(st.pop());
        }
    }
    public static void main(String[] args) {
        que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        System.out.println(que);
        reversequeue();
        System.out.println(que);
    }
}
