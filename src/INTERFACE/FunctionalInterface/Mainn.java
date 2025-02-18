package INTERFACE.FunctionalInterface;
//java.util.function;//
public class Mainn {
//   interface Consumer <T>{
//
//    void accept (T t);
//    }
//    public static void main(String[] args) {
//        Consumer<Integer> login = (Integer val) -> {
//            if(val>10){
//                System.out.println("Consumer : it represents an opn that accepts single input parameter & return no result ");
//            } else {
//                System.out.println("not print");
//            }
//        };
//        login.accept(9);   // this is how we can provide
//
//}
// interface Supplier<T> {
//
//        T get();
// }

//    public static void main(String[] args) {
//        Supplier <String> isANo = ()-> {   // if you {} apply this always write return
//           return "accept no input parameter but produce a result";
//        };
//        System.out.println(isANo.get());
//    }


//    interface Function<T,R>{
//        // it accept one arguement and process it and produce a result
//       R apply(T t);   // we can write anything instead of apply
//
//    }
//
//    public static void main(String[] args) {
//        Function <Integer,String> IntToString = (Integer num)->{
//            String output = num.toString();
//            return output;
//        };
//        System.out.println(IntToString.apply(90));
//    }
    interface  Predicate <T>{
        boolean test(T t);
}
// predicate represents a boolean-valued function of a single argument.
//  It is used to test or evaluate a condition on a given input and return true or false based on whether the condition is satisfied.
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer val) -> val%2==0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(9));  // false

    };

}
