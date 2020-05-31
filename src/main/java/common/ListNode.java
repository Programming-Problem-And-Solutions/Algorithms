package main.java.common;

public class ListNode<T> {
    public ListNode next;
    public T data;

    public ListNode(T data) {
        this.data = data;
        next = null;
    }
}
