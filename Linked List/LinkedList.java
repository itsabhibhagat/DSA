class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList{
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void length(Node head){
        int cnt =0;
        Node temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;    
        }
        System.out.println(cnt);
    }

    //remobve from head
    public static Node removeHead(Node head){
        // Node temp = head;
        if(head == null) return head;
        head = head.next;
        return head;
    }

    //remove from tail
    public static Node removeTail(Node head){
        // Node temp = head;
        if(head == null || head.next == null) return head;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static void main(String[] args){
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;

        Node head = first;
        // print(head);
        // length(head);

        //remove from head
        // Node temp = removeHead(head);
        // print(temp);

        //remove from tail
        Node temp = removeTail(head);
        print(temp);


    }
}