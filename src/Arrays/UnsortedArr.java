package Arrays;

public class UnsortedArr {

    public static void main(String[] args) {

        int arr[] ={12,5,6,19,20,22,1,19};
        // find minimum
        int min = arr[0];
        int max = arr.length-1;
        for(int i=0;i<arr.length;i++){
          if(min>arr[i]){
              min= arr[i];
          } else if (arr[i]>max) {
              max= arr[i];
          }
        }

            System.out.println(min);
        System.out.println(max);

    }
}

// min-> arr[i]=0,
