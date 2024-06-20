package Oops;

public class Main {

    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();
        for(int i = 1 ; i<=100 ;i++){
            arr.add(100+i);
        }
        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.getElement(4));
        arr.setElement(4,220);
        System.out.println(arr.getElement(4));
        arr.removeLast();
        System.out.println(arr.getElement(100 ));















//        Fraction f1 = new Fraction(13,20);
//        f1.print();
//        //f1.increment();
//        Fraction f2 = new Fraction(19,47);
////        f1.add(f2);
////        f1.print();
//
//        Fraction f3 = Fraction.add(f1,f2);
//        f3.print();





    }

}
