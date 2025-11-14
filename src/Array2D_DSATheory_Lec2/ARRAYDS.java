package Array2D_DSATheory_Lec2;

import java.util.NoSuchElementException;

public class ARRAYDS {
    int arr[];
    int counter;

    public ARRAYDS(int initialCapacity) {
        this.arr = new int[initialCapacity];
        this.counter = 0;
    }

    public void resizeIfFull(){
        if (arr.length == counter){
            int[] newArray = new int[counter * 2];

            for (int i=0 ; i< counter ; i++){
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
    }
    public void insertInteger(int value){
        resizeIfFull();
        arr[counter++] = value;
    }
    public void removeNumber(int index){
        for (int i = index ; i<counter ; i++){
            arr[i] = arr[i+1];
        }
        counter--;
    }

    public void SearchElement(int value){
        for (int i = 0 ; i< counter ; i++){
            if (arr[i] == value){
                System.out.println("Element Found at Index "+i);
                return;
            }
        }
        throw new NoSuchElementException("Element Not Found!");
    }

    public void UniqueNumbers(){
        for (int i=0 ; i<counter ; i++){
            int element = arr[i];
            boolean isDuplicate = false;

            for (int j=0 ; j<counter ; j++){
                if (i == j){
                    continue;
                }
                if (arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                System.out.println(element);
            }
        }
    }
    public void Fibonacci(int range){
        int a=0;
        int b=1;
        System.out.print(a + " " + b+" ");
        for (int i=2; i<range ; i++){
            int next = a + b;
            System.out.print(next+" ");
            a = b;
            b = next;
        }
    }

    public void DisplayElements(){
        for (int i=0 ; i<counter ; i++){
            System.out.println(arr[i]);
        }
    }

}