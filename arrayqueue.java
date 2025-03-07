public class arrayqueue {

    public static class queue {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[10];

        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if(f == -1 && r == -1){
                f=r=0;
                arr[r] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[f++];
            size--;
            return val;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        public void display(){
            if(size==0){
                System.out.println("Que is empty");
            }
            else{
                for(int i=f ; i<=r ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue que = new queue();
        que.add(34);
        que.add(45);
        que.add(78);
        que.add(34);
        que.add(56);
        que.add(78);
        que.add(65);
        que.add(89);
        que.display();
        System.out.println(que.remove());
        System.out.println(que.size);
        System.out.println(que.peek());
    } 
}
