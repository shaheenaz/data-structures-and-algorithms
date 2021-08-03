package com.example.helloworld;
public class HelloWorld {
    public static void main(String[] args) {
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
}