/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        //create two dummy nodes:
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode  leftTail= left;
        ListNode  rightTail = right;
        
        ListNode current =head;

        while(current != null){
            ListNode nextNode = current.next;
            if(current.val <x ){
                leftTail.next=current; // Attach node to left list
                leftTail = leftTail.next;  // Move left pointer forward

            }else{
             rightTail.next=current;
                rightTail=rightTail.next;
            }
            current= nextNode; // Continue through original list
        }
                // Connect both lists
        leftTail.next = right.next;

                // Prevent unwanted links or cycles
         rightTail.next =null;

         return left.next;

        
    }
}