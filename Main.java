// // // class Test {
// // //     private int number;
// // //     public int getNumber(){
// // //         return number;
// // //     }
// // //     public void setNumber(int number){
// // //         this.number = number;
// // //     }
// // // }

// // // public class Main {

// // //     public static void main(String[] args) {
// // //         Test t = new Test();
// // //         t.setNumber(19);
// // //         System.out.println(t.getNumber());
// // //     }
// // // }

// // // class Counter{
// // //     static int count = 0;

// // //     Counter(){
// // //         count++;
// // //         System.out.println("객체 생성됨. 총 객체 수 : " + count);
// // //     }
// // // }
// // // public class Main {
// // //     public static void main(String[] args) {
// // //         new Counter();
// // //         new Counter();
// // //         new Counter();
        
// // //     }
// // // }


// // // class Animal {
// // //     String name;

// // //     void speak(){
// // //         System.out.println("소리를 냅니다.");
// // //     }
// // // }

// // // class Dog extends Animal {
// // //     void bark(){
// // //         System.out.println("멍멍!");
// // //     }
// // // }

// // // class Cat extends Animal {
// // //     void meow(){
// // //         System.out.println("야옹!");
// // //     }
// // // }
// // // public class Main {
// // //     public static void main(String[] args) {
// // //         Dog d = new Dog();
// // //         d.name = "바둑이";
// // //         d.speak();
// // //         d.bark();

// // //         Cat c = new Cat();
// // //         c.name = "뽀삐";
// // //         c.speak();
// // //         c.meow();
// // //     }
// // // }

// // class Animal{
// //     void speak(){
// //         System.out.println("동물 내는 소리");
// //     }
// // }

// // class Dog extends Animal{
// //     @Override
// //     public void speak(){
// //         System.out.println("멍멍");
// //     }
// // }

// // class Cat extends Animal{
// //     @Override
// //     public void speak(){
// //         System.out.println("냐용");
// //     }
// // }

// // public class Main {

// //     public static void main(String[] args) {
// //         Animal[] a = new Animal[2];
// //         a[0] = new Cat();
// //         a[1] = new Dog();

// //         for (Animal animal : a){
// //             animal.speak();
// //         }
// //     }
// // }

// // abstract class Shape {
// //     abstract double getArea();
// // }

// // class Circle extends Shape {
// //     double radius = 2.0;
// //     double getArea(){
// //         return 3.14 * radius * radius;
// //     }
// // }

// // class Rectangle extends Shape {
// //     int width = 3, height = 4;
// //     double getArea(){
// //         return width * height;
// //     }
// // }

// // public class Main {

// //     public static void main(String[] args) {
// //         Shape[] shapes = {new Circle(), new Rectangle()};
// //         for (Shape s : shapes){
// //             System.out.println("넓이 : " + s.getArea());
// //         }
// //     }
// // }

// // abstract class Person{
// //     String name;

// //     Person(String name){
// //         this.name = name;
// //     }

// //     abstract void printInfo();
// // }

// // class Student extends Person{
// //     int grade;

// //     Student(String name, int grade){
// //         super(name);
// //         this.grade = grade;
// //     }

// //     @Override
// //     void printInfo(){
// //         System.out.println("학생이름 : " + name + ", 학년 : " + grade);
// //     }
// // }

// // class Teacher extends Person {
// //     String subject;

// //     Teacher(String name, String subject){
// //         super(name);
// //         this.subject = subject;
// //     }

// //     @Override
// //     void printInfo(){
// //         System.out.println("교사 이름 : " + name + ", 과목 : " + subject);
// //     }
// // }

// // public class Main {

// //     public static void main(String[] args) {
// //         Person[] people = {
// //             new Student("김철수", 2),
// //             new Teacher("박선생", "수학"), 
// //             new Student("이영희", 3)
// //         };

// //         for (Person p : people){
// //             p.printInfo();
// //         }
// //     }
// // }

// interface USB {
//     void conncet();
// }
// class Mouse implements USB {
//     public void conncet() {
//         System.out.println("마우스를 연결합니다");
//     }
// }

// class keyboard implements USB {
//     public void conncet() {
//         System.out.println("키보드를 연결합니다");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         USB u = new Mouse();
//         u.conncet();
//     }
// }

import java.util.Scanner;

interface Calcultor{
    int add(int a, int b);

    default int mulitiply(int a, int b){
        return a *b;
    }

    static int subtract(int a, int b){
        return a-b;
    }
}

class simpleCalculator implements Calcultor{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        simpleCalculator calc = new simpleCalculator();

        System.out.println(calc.add(a, b));
        System.out.println(calc.mulitiply(a, b));
        System.out.println(Calcultor.subtract(a, b));
    }
}