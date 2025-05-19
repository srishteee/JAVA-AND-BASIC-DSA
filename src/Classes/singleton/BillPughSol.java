package Classes.singleton;

public class BillPughSol {
    private BillPughSol(){

    }
    // STATIC INNER CLASS
    // THE BELOW NESTED CLASS DONOT GET LOADED AT THE TIME OF EXECUTION
    private static class DBConnectionHelper{ // USING NESTED CLASS
        private static final BillPughSol INSTANCE_OBJECT = new BillPughSol();
    }
    public static BillPughSol getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT; // bec it static
    }
}










































// YOU CAN USE ENUM
//enum Db {
//    INSTANCE;
//}


