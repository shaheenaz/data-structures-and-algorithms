package com.example.helloworld;

public class LinjedList {
    Node head;
    Node tail;
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            newNode.next = head;
        }
        head = newNode;
    }


   public boolean includes(int val) {
        boolean includedData = false;
        Node current = head;
        while (current != null) {
            if (val == current.value) {
               includedData = true;
            }
            current = current.next;
        }
        return includedData;
    }

    public String toStings(){
        String result= "";
        Node current = head;
        while (current != null){
result = "current.value+ ->";
        }
        return result;
    }

}
