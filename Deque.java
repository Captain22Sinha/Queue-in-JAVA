public class Deque {
    static class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class DequeLL {
        Node front;
        Node rear;
        int size;
        DequeLL(){
            front = rear = null;
            size = 0;
        }

        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }

        int size(){
            return size;
        }

        void insertFront(int val){
            Node newNode = new Node(val);
            if(front==null){
                rear = front = newNode;
            }
            else{
                newNode.next = front;
                front.prev =  newNode;
                front = newNode;
            }
            size++;
        }

        void insertRear(int val){
            Node newNode = new Node(val);
            if(rear==null){
                front = rear = newNode;
            }
            else{
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode; 
            }
            size++;
        }

        void deleteFront(){
            if(size==0) System.out.println("underflow");
            else{
                front =  front.next;
                if(front==null) rear=null;
                else front.prev=null;
                size--;
            }
        }

        void deleteRear(){
            if(size==0) System.out.println("Queue is Empty");
            else{
                rear = rear.prev;
                if(rear==null) front=null;
                else rear.next=null;
                size--;
            }
        }

        int getFront(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            } 
            else return front.val;
        }

        int getRear(){
            if(size==0){
                System.out.println("Underflow");
                return -1;
            } 
            else return rear.val;
        }
        
    }
    public static void main(String[] args) {
        DequeLL dq = new DequeLL();
        dq.insertRear(74);
        dq.insertRear(57);
        dq.insertFront(34);
        dq.insertFront(78);
        dq.insertRear(87);
        dq.deleteFront();
        dq.deleteRear();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
        System.out.println(dq.size());
    }
}
