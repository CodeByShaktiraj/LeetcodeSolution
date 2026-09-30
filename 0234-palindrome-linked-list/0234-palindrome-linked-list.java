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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode prev =null;

        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
             // Compare first half and reversed second half
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;

        
    
}
}





 /*
class Solution {
    public boolean isPalindrome(ListNode head) {

        int[] nums = new int[100000];
        int length = 0;

        // Store linked list values in array
        ListNode current = head;

        while (current != null) {
            nums[length] = current.val;
            length++;
            current = current.next;
        }

        // Check palindrome
        int left = 0;
        int right = length - 1;

        while (left < right) {

            if (nums[left] != nums[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
*/