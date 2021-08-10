package com.example.helloworld;
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        LinjedList test = new LinjedList();
       test.insert(1);
      test.insert(2);

       test.append(3);
       test.after(1,2);
       test.before(4,5);
        System.out.println(test.includes(3));
System.out.println(test.toStings());
System.out.println(test.KTH(6));

    }
      public static LinkedList zipLists(LinkedList ll1, LinkedList ll2) {
    LinkedList newLl = new LinkedList();
    Node current = ll1.head;
    Node current2 = ll2.head;

    while (current != null || current2 != null) {
      if (current == null) {
       newLl.append(current2.data);
        current2 = current2.next;
      } else if (current2 == null) {
        newLl.append(current.data);
        current = current.next;
      } else {
        newLl.append(current.data);
        newLl.append(current2.data);

        current = current.next;
        current2 = current2.next;
      }
    }
    return newLl;
  }
}