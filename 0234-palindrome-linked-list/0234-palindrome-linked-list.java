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