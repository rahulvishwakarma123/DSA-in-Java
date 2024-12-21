// leetcode 160

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
    public ListNode findStartingPointofCycle(ListNode head){
        if(head==null || head.next== null){
            return null;
        }

        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while(slow != fast && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // there is no cycle, no intersection point
        if(slow != fast) return null;
        
        slow = head;
        // now move by same speed
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }

        ListNode temp = headA;

        while(temp.next != null){
            temp = temp.next;
        }

        // temp is at tail
        temp.next = headB;

        ListNode ans = findStartingPointofCycle(headA);

        // fixing the LL again;
        temp.next = null;

        return ans;
    }
}


// keep m, delete n nodes

public class Solution {
    /**
     * @param head: Head of a linked list.
     * @param m: Nodes to be kept.
     * @param n: Nodes to be deleted.
     * @return: The head of the modified list after removing the mentioned nodes.
     */
    ListNode ogHead;
    ListNode ogTail;
    public void addLast(ListNode curr){
        ogTail.next = curr;
        ogTail = curr;
    }

    public addNodes(ListNode curr, int m){
        while(curr!=null && m>0){
            ListNode currKaNext = curr.next;
            curr.next = null;

            addLast(curr);

            curr = currKaNext;
            m--;
        }

        return curr;
    }

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);

        ogHead = dummy;
        ogTail = dummy;

        ListNode curr = head;
        int N = n;

        while(curr!= null){
            curr = addNodes(curr,m);

            // delete n nodes
            while(N>0 && curr!=null){
                curr = curr.next;
                N--;
            }
            N=n;
        }

        return dummy.next;
    }
}