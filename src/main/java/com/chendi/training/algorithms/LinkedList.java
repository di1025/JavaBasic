package com.chendi.training.algorithms;


public class LinkedList {
    LinkedNode head;

    public LinkedList(){}

    public int countNode(LinkedNode head){
        int count =0;
        if(head==null) return 0;

        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String []args){
        LinkedList l=new LinkedList();
        LinkedNode head= new LinkedNode(1);
        LinkedNode node1= new LinkedNode(1);
        LinkedNode node2= new LinkedNode(1);
        LinkedNode node3= new LinkedNode(1);

        head.next=node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println(l.countNode(head));

    }
}
