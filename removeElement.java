import java.util.*;

public class removeElement {
    static Queue<Integer> que;
    static Queue<Integer> newQue;

    static void removeEven(){
        newQue = new LinkedList<>();
        while (que.size()>0) {
            que.remove();
            if(que.size()>0){
                newQue.add(que.remove());
            }
        }
        que = newQue;
    }
    public static void main(String[] args) {
        que = new LinkedList<>();
        que.add(34);
        que.add(56);
        que.add(78);
        que.add(65);
        que.add(89);
        System.out.println(que);
        removeEven();
        System.out.println(newQue);
    }    
}
