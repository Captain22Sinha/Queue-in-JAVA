import java.util.*;

public class PrintQueue {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        Queue<Integer> help = new LinkedList<>();
        while(que.size()>0){
            System.out.print(que.peek() + " ");
            help.add(que.remove());
        }
    }
}