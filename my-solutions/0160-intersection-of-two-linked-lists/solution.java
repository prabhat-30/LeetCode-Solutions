/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count1=0;
        int count2=0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1!=null){ 
            count1++;
            temp1=temp1.next;
        }
        System.out.println(count1);

       
        while(temp2!=null){ 
            count2++;
            temp2=temp2.next;
        }
        System.out.println(count2);
        int res=0;
        if(count1>count2){
           res= count1-count2;
        }else{
           res= count2-count1;
        }
          temp1=headA;
          temp2=headB;
         for(int i=1; i<=res; i++){
            if(count1>count2){
                temp1=temp1.next;
            }
            else{
                temp2=temp2.next;
            }
        } 
      while(temp1!=null ||temp2!=null ){
        if(temp1==temp2){
            return temp1;
        }else{
            temp1=temp1.next;
            temp2=temp2.next;
        }
      }
      return temp1;
    }
}
