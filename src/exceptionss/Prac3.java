//package exceptionss;
//
//import java.io.FileNotFoundException;
//
//public class Prac3 {
//    public static void main(String[] args) {
//        try{
//method1("dummy");
//        }
//        catch (Exception exp){   // it is a parent of checked and unchecked then the exception is already caught exception  here
//            // if you write at the parent class at top
//
//        }
//        catch (ClassNotFoundException objClasss ){
//
//        } catch (InterruptedException classObj){
//
//        }
//
//        catch (FileNotFoundException file){  // it throws error bec this error is not on try block
//            // catch block can only catch exception which is in try block
//
//        }
//    }
//    public static void method1(String name) throws ClassNotFoundException,InterruptedException{
//        if(name.equals("dummy")){
//            throw new ClassNotFoundException();
//        } else if(name.equals("interupted")){
//             throw new InterruptedException();
//        }
//    }
//}
