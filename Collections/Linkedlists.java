package Collections;
import java.util.*;

public class Linkedlists {
    Node head;
    private int size;

    Linkedlists(){
        this.size=0;
    }

    class Node{  // Create class to store data and next pointer
        String data;
        Node next;

        Node(String data ){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;

        }
        currentNode.next= newNode;
    }

    //print LinkedList
    public void printList(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;

        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
            head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }


    public static void main(String[] args) {
        Linkedlists list = new Linkedlists();    //create obj of class
        list.addFirst("stuti");
        list.addFirst("megha");
        list.printList();

        list.addLast("Guru");
        list.printList();

        list.addFirst("My name is ");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("My name is ");
        list.printList();
        System.out.println(list.getSize());

    }
}

