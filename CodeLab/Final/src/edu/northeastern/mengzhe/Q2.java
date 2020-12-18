package edu.northeastern.mengzhe;

public class Q2 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode l3=new ListNode(0);
        ListNode temp=l3;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                l2=l2.next;
            }
            temp=temp.next;
        }
        if(l1!=null){
            temp.next=l1;
        }
        else if(l2!=null){
            temp.next=l2;
        }
        return l3.next;
    }




    static void print(ListNode ln){
        while(ln!=null){
            System.out.println(ln.val);
            ln=ln.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1= new ListNode(1);
        l1.next= new ListNode(2);
        l1.next.next=new ListNode(4);

        ListNode l2= new ListNode(1);
        l2.next= new ListNode(3);
        l2.next.next=new ListNode(4);

        print(mergeTwoLists(l1,l2));
    }
}
/**
 * Run Result

 1
 1
 2
 3
 4
 4

 *
 * ***/
