package exceptionss;

public class prac1 {
//    public static void main(String[] args) {
//        Object val = 10;
//        System.out.println((String)val);   // it is CLASSCASTEXCEPTION in which we try to print string instead of integer
//prac1 obj = new prac1();
//obj.method1();
//    }
//    private void method1 (){
//
//       throw new ArithmeticException();
//    }
//    private void method2(){
//        method3();
//    }
//    private void method3(){
////        int b = 5/0;
//    }

public static void main(String[] args) {
    int val [] = new int [2];
    //System.out.println(val[3]);// ArrayIndexOutOfBoundsException -- we have [2] but we print out of box after 2

    String value = "rhea";
    //System.out.println(value.charAt(4));   // StringIndexOutOfBoundsException , here its size is 3 and we try to access it 4
// if an obj is null and you will try to acess it null.charAt it will throw nullpointer exception

    String obj = null;
    System.out.println(obj.charAt(0));  // NullPointerException
}
}
