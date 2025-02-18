package Classes.singleton;

public class EagerSingleton {

//    public static final EagerSingleton conObj=  new EagerSingleton();
//
//    private EagerSingleton(){
//
//    }
//    private static EagerSingleton getInstance(){
//        return conObj;
//    }
//
//    public static void main(String[] args) {
//       EagerSingleton connObjj = EagerSingleton.getInstance();
//
//    }
//


    public static final EagerSingleton obj = new EagerSingleton();  // creating a instance of a class and instantiated as sooon as the class loaded


    private EagerSingleton(){

    }
    private static EagerSingleton getInstance(){
        return obj;
    }

    public static void main(String[] args) {
        EagerSingleton obj1 = EagerSingleton.getInstance();
    }


}

// disadvanctages all variables are preloaded , even they not using this method they already stored it
// to over come there is lazy


