package com.chendi.training.algorithms;


import sun.awt.image.ImageWatched;

public class LinkedList {
//    LinkedNode head;

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


    public int countLikedListLength(LinkedNode head){
        int length=0;
        if(head==null) return 0;

        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }



        public static int findMidEle(LinkedNode head){
        int length=0;
        LinkedNode current =head;
        LinkedNode middle = head;

        while(current.next!=null){
            length++;
            if(length%2==0){
                middle =middle.next;
            }
            current=current.next;
        }
        return middle.data;
//        if(length%2==1){
//            middle=middle.next;
//        }

    }

    public static int findMiddle(LinkedNode head){
        int length=0;
        LinkedNode current=head;
        LinkedNode middle=head;
        if(head==null) return 0;
        while(current!=null) {
            length++;
            if (length % 2 == 0) {
                middle = middle.next;
            }
            current = current.next;
        }
//            if (length % 2 == 0) {
//                middle = middle.next;
//            }

        return middle.data;
    }

    public static int findMiddleByTwoPointer(LinkedNode head){
        LinkedNode slow=head;
        LinkedNode quick=head;

        while(quick.next.next!=null){

            quick=quick.next.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public static int mid(LinkedNode head){
        LinkedNode slow = head;
        LinkedNode quick= head;

        while(quick != null && quick.next != null){
            quick=quick.next.next;
            slow=slow.next;
        }
        return slow.data;
    }

    public static LinkedNode middleNode(LinkedNode head) {
        LinkedNode slow = head;
        LinkedNode quick = head;

        while(quick!=null && quick.next!=null){
            quick=quick.next.next;
            slow=slow.next;
        }
        return slow;
    }


    public static void main(String []args){
        LinkedList l=new LinkedList();
        LinkedNode head= new LinkedNode(1);
        LinkedNode node1= new LinkedNode(2);
        LinkedNode node2= new LinkedNode(3);
        LinkedNode node3= new LinkedNode(4);
        LinkedNode node4= new LinkedNode(5);
        LinkedNode node5= new LinkedNode(6);

        head.next=node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next=node5;


        System.out.println(l.countNode(head));
        System.out.println( middleNode(head));
        System.out.println(mid(head));

    }
}
