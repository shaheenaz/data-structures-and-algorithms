package com.example.helloworld;
public class HelloWorld {
    public static void main(String[] args) {
        LinjedList test = new LinjedList();
       test.insert(1);
      test.insert(2);

        Node current = test.head;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(test.includes(3));
System.out.println(test.toStings());
    }
}
