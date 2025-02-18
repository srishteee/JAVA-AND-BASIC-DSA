package Classes.singleton;

public class DbSynchronised {

    private static DbSynchronised conObject ;

    private DbSynchronised () {
    }
    synchronized public static DbSynchronised getInstance(){
        if(conObject==null){
            conObject=new DbSynchronised();

        }return conObject;
    }
}

// this method is slow bec we are synchronising at method level.
// if 100 of places we calling getInstance method sequentially it will lock and unlock and becomes slow.
// to over come this double check locking system.