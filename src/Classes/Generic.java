package Classes;
import java.util.*;


class Student <T, K>{
               // generic class where T is object
      private   T data ;// storiugn the type of T
        private K value;
        public void setMarks(T data , K value){
            this.data = data;
            this.value=value;
        }
        public  T  getData( ){
        return data;
        }
public K getValue (){
            return value;
}
    }

public class Generic {
    public static void main(String[] args) {
        Student<Integer, String> stu = new Student<>();
        stu.setMarks(25, "Rhea");
        System.out.println("Data: " + stu.getData()); // Get and print the data
        System.out.println("Value: " + stu.getValue()); // Get and print the
    }
}

// class School < K,V> {

// class Teacher <T extends String>



