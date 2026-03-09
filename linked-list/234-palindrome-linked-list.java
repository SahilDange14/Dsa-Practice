//Linked list easy problem 
// 3 simple steps find mid ; revrse from mid ; then comapre 2 halves !



class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head , slow = head ;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next ;
            slow = slow .next ;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        while(curr != null){
            ListNode temp = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = temp;
        }
        ListNode left = head;
        ListNode right = prev;
        while (right != null) {
            if (right.val != left.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        
        return true;
    }
}
