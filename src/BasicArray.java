import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Jarred on 2/4/2017.
 */
public class BasicArray {
    public int sumArray(int [] array){
        if(array.length == 0 || array == null) return 0;
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public int[] getEvenNumbers(int input){
        if(input < 0) return null;
        if(input < 0){
            return null;
        }
        int[] evens = new int[input];
        int index = 0;
        for (int i = input; i >= 0; i--) {
            if (i%2 == 0){
                evens[index] = i;
                index++;
            }
        }
        return evens;
    }

    public boolean isPrime(int input){
        //credit: http://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
        if(input==2) return true;
        if(input==1) return false;
        if(input%2==0) return false;
        for(int i=3; i*i<=input; i+=2){
            if(input%i==0) return false;
        }
        return true;
    }

    public int[] getPrimeNumbers(int input){
        if(input < 0) return null;
        if(input < 0) {
            return null;
        }
        int[] primes = new int[input];
        int index = 0;
        for (int i = input; i >= 0; i--) {
            if (isPrime(i)){
                primes[index] = i;
                index++;
            }
        }
        return primes;
    }

    public double[] findSmallestAndLargest(double [] array){
        if(array == null) return null;
        double[] boxes = new double[2];
        double largest = array[0];
        double smallest = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] > largest){
                largest = array[i];
            }
            if(array[i] < smallest){
                smallest = array[i];
            }
        }
        boxes[0] = smallest;
        boxes[1] = largest;

        return boxes;
    }

    public String findDuplicate(String [] array){
        if(array == null) return null;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array.length; j++){
                if(Objects.equals(array[i], array[j]) && i != j){
                    return array[i];
                }
            }
        }
        return null;
    }

    public int[] remove(int [] array, int input){
        if(array == null) return null;
        if(input < 0) return null;
        int[] newArray = new int[array.length-1];
        int index = 0;
        for (int i = 0; i<array.length; i++){
            if(array[i] != input){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }



}
