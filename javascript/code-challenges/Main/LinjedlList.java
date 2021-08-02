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

    public String toStings() {
        String result = "";
        Node current = head;
        while (current != null) {
            result = "current.value+ ->";
        }
        return result;
    }


    public void append(int val) {
        Node newNode = new Node(val);
        if (head != null) {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void before(int val, int newVal) {
        Node current = head;
        Node newNode = new Node(newVal);
        while (current.next != null && current.next.value != val)
            current = current.next;

        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

    }

    public void after(int val , int newVal){
        Node newNode = new Node(newVal);
        Node current = head;


        while(current.next != null && current.value != val){
            current= current.next;
        }

        if (current.value == val){
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}




