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
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         int len = 0;
//         List<ListNode> valList = new ArrayList<>();
//         while(head != null) {
//             valList.add(head);
//             head = head.next;
//             len++;
//         }
//         return valList.get(len / 2);
//     }
// }

// 중간 위치를 구해야 하기 때문에, slow와 fast ptr을 가지고 slow는 매번 한칸씩 이동할 때 fast는 두 칸씩 보낼 수 있습니다.
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next; // 1칸씩 움직임
            fast = fast.next.next; // 2칸씩 움직임
        }
        return slow;
    }
}