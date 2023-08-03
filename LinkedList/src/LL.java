public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=size;
    }
    public void insertfirst(int val){
        Node node= new Node(val);
        node.next=head;
        head= node;
        if(tail==null){
            tail=head;
        }
        size+=1;


    }
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);

        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.value + " -> ");

            temp=temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
}
