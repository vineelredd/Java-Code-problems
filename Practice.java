// class practice {
//    static int B,H;
//    static boolean flag;
//    static {
//        Scanner cin = new Scanner(System.in);
//        B = cin.nextInt();
//        H = cin.nextInt();
//        if (B > 0 && H > 0) {
//            flag = true;
//        } else {
//            System.out.println("Error: B and H should be positive");
//        }
//    }
//        public static void main(String[] args){
//            if(flag){
//                int area = B*H;
//                System.out.println("Area is "+area);
//            }
//
//        }
//    }

//    class Overloading{
//     void show(int a){
//         System.out.println(a);
//     }
//     void show(String b){
//         System.out.println(b);
//     }
//     void show(int a,int b){
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         Overloading o = new Overloading();
//         o.show(1);
//         o.show("Hello");
//         o.show(3,4);
//
//     }
//    }
//
//public class abc{
//    public static void main(String[] args){
//
//        int val=sum(2,3);
//        int val1=sum(2,3,5);
//        System.out. println(val) ;
//        System.out.print(val1);
//    }
//    public static int sum(int a,int b, int c){ //if this int argument is not at mention error of 3 int
//        return a+c;          //  is there but two int was mentioned
//        public static int sum(int a,int b){
//            return a+b;
//        }
//    }

//    class Student {
//        int age;
//        String name;
//
//
//        //System.out.println();
//    }
//
//        public class practice {
//            public static void main(String[] args) {
//                Student s = new Student();
//                s.age = 1;
//                s.name = "John";
//                System.out.println(s.age);
//                System.out.println(s.name);
//            }
//        }

// class Student {
//    String name;
//    int rollnum;
//
//    // Constructor with parameters
//    Student(String name, int rollnum) {
//        this.name = name;         // class field = constructor parameter
//        this.rollnum = rollnum;   // same here
//    }
//
//    void display() {
//        System.out.println("Name: " + name);
//        System.out.println("Roll Number: " + rollnum);
//    }
//}

//import java.util.Scanner;
//
//class Practice {
//    String name;
//    int rollnum;
//
//    // Constructor with parameters
//    Practice(String name, int rollnum) {
//        this.name = name;         // class field = constructor parameter
//        this.rollnum = rollnum;   // same here
//    }
//    class Main{
//        public  void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter student name: ");
//            String name = sc.nextLine();
//            System.out.println("Enter student rollnum: ");
//            int rollnum = sc.nextInt();
//
//        }
//    }
//
//}
//class Car {
//    private int model;
//    private String feature;
//    int cnum;
//
//    int getModel() {
//        return model;
//    }
//
//    void setFeature(String feature) {
//        this.feature = feature;
//    }
//}
//
//public class Practice {
//    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.setFeature("Sunroof");
//        myCar.cnum = 1234;
//        myCar.model=2004;
//
//        System.out.println("Feature set successfully!");
//        System.out.println("Car Number: " + myCar.cnum);
//
//    }
//}

                        //overloading

//class Car {
//    private int model;
//    private String feature;
//    private int cnum;
//
//    // Getter for model
//    int getModel() {
//        return model;
//    }
//
//    // Setter for model
//    void setModel(int model) {
//        this.model = model;
//    }
//
//    // Getter for feature
//    String getFeature() {
//        return feature;
//    }
//
//    // Setter for feature
//    void setFeature(String feature) {
//        this.feature = feature;
//    }
//
//    // Getter for cnum
//    int getCnum() {
//        return cnum;
//    }
//
//    // Setter for cnum
//    void setCnum(int cnum) {
//        this.cnum = cnum;
//    }
//}
//
//public class Practice {
//    public static void main(String[] args) {
//        Car myCar = new Car();
//
//        myCar.setModel(2025);
//        myCar.setFeature("Sunroof");
//        myCar.setCnum(1234);
//
//        System.out.println("Model: " + myCar.getModel());
//        System.out.println("Feature: " + myCar.getFeature());
//        System.out.println("Car Number: " + myCar.getCnum());
//    }
//}
                   //overriding

//class Animal {
  //  void sound() {
    //    System.out.println("Animal makes a sound");
    //}
//}

//class Dog extends Animal {
    //@Override       // just to make compalier clarity that this method is overriding with subclass
  //  void sound() {
    //    System.out.println("Dog barks");
    //}
//}
//public class Practice {
//    public static void main(String[] args) {
//        Animal a = new Dog();  // Parent reference, child object
//        a.sound();             // Output: Dog barks (Overriding in action)
//    }
//}

              //Inheritance

//class Animal {
//    void eat() {
//        System.out.println("Eating...");
//    }
//    void sleep() {
//        System.out.println("Sleeping...");
//    }
//}
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("Barking...");
//    }
//}
//
//public class Practice {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();   // inherited from Animal
//        d.sleep(); //inherited in animal
//        d.bark();  // defined in Dog
//
//    }
//}

             //multi inheritance

//class Animal{
//    void eat(){
//        System.err.println("eating....");
//    }
//    void sleeping(){
//        System.out.print("sleeping....");
//
//    }
//
//
//
//}
//class Dog extends Animal{
//    void bark(){
//        System.out.println("Barking....");
//    }
//
//}
//class cat extends Dog{
//    void mewm(){
//        System.out.println("meow.....");
//    }
//}
//public class Practice {
//    public static void main(String[] args) {
//        Dog s = new Dog();
//        cat d = new cat();
//        Animal v = new Animal();
//        s.bark();
//        d.mewm();
//        d.eat();
//        v.sleeping();
//
//    }
//}


