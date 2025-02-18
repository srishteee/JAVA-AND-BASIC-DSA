package Classes.singleton;

public class DbDoubleLocking {
    private static volatile DbDoubleLocking connObj;

    private DbDoubleLocking(){

    }
    public static DbDoubleLocking getInstance(){
        if(connObj==null){
        synchronized (DbDoubleLocking.class){
            if(connObj==null){
                connObj=new DbDoubleLocking();
            }
        }
        }
        return connObj;

    }
}

// it is slow
// volatile directly works w heap memory , cpu core - cache - rthedse caches cannot react w each
