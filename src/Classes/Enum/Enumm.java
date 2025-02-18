package Classes.Enum;

public class Enumm {
    public static void main(String[] args) {
   // common fns in enum class
//        - values() -
//                -Ordinal()
//                valueOf()
//                name()



        for(EnumExampole ex :EnumExampole.values()){
            // values() method return enum[] -- in an array
            System.out.println(ex.ordinal());
        }

        // usage of ValueOf() and name()
        // below we use the enum class directly instead of the new keyword it is bec it is coming from lang.enum package
            // valueof is also a static method present into java.lang.enum class
        // in value of pass the string it will internally iterate and then match one should be printed
        EnumExampole numVAR = EnumExampole.valueOf("FRIDAY");
        System.out.println(numVAR.name());
    }

public enum EnumExampole{
    Monday{
        @Override
        public void dummMethod(){
            System.out.println("not dummy");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummMethod(){    //this method is individually distributed to all mon to sunday
        // suppose you dont want that method in monday then you can also override
        System.out.println("dummy");
    }
    // the baove mon to sun is havinf 0 to 6 value in it and ordinal are those nos
}}


// public  final class TestClass{




