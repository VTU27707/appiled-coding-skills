
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow,fast;
        slow=fast=head;
       while(fast!=null &&fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first =head;
        ListNode second =reverse(slow);
        while(second !=null)
        {
            if(first.val !=second.val)
            return false;
            first =first.next;
            second=second.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode nextNode;
        ListNode prev = null;
        ListNode current=head;
        while(current !=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }
}