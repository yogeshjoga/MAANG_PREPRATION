import java.util.Random;

public class InseractionSort {


    public static void inseationSortme(int[] arr){

        for(int i=1; i<arr.length; i++){
            int currentValue = arr[i];
            int maxVal = i - 1;
            if(maxVal >= 0 && arr[maxVal] > currentValue){
                arr[maxVal +1] = arr[maxVal];
                maxVal--;
            }
            arr[maxVal + 1] = currentValue;
        }

        for(int pr : arr){
            System.out.println(pr);
        }
    }

    public  static  void printArr(int[] arr){
        for(int pr : arr){
            System.out.println(pr);
        }
    }




    public static void main(String[] args) {
        // Genrate values from Random class
        Random random = new Random();
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        inseationSortme(numbers);
      //  printArr(numbers);
    }
}
