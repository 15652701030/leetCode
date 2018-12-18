package com.chenqi.demo.leet.code.ListNode;


public class Interview2 {


    public static ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode node = mergeList(sortList(head),sortList(right));
        return node;
    }

    public static ListNode getMid(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode mergeList(ListNode head1, ListNode head2){
        if (head1 == null || head2 == null){
            return head1 != null ? head1 : head2;
        }

        ListNode head = head1.value < head2.value ? head1 : head2;
        ListNode cur1 = head == head1 ? head1 : head2;
        ListNode cur2 = head == head2 ? head1 : head2;

        ListNode pre = null;//cur1的上一个节点
        ListNode next = null;//cur2的上一个节点

        while (cur1 != null && cur2 != null){
            if (cur1.value <= cur2.value) {
                pre = cur1;
                cur1 = cur1.next;
            } else {
                next = cur2.next;
                pre.next = cur2;
                cur2.next = cur1;
                pre = cur2;
                cur2 = next;
            }
        }
        pre.next = cur1 == null ? cur2 : cur1;
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = sortList(node1);
        while (listNode != null){
            System.out.println(listNode.value);
            listNode = listNode.next;
        }
    }

}
