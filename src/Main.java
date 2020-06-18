import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1,2,3,4,5,6,7,8,9,0};
        String arr2[] = {"Q","W","E","R","T"};
        replacement(arr1,1,3);
        replacement(arr2,0,2);




        String[] arrayOfString = {"A","B","C","D","E"};
        asList(arrayOfString);



    }


    public static void replacement(Object[] arr, int a1, int a2){
        System.out.println("Задание 1: " + Arrays.toString(arr));
        Object sw = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = sw;
        System.out.println("Результат смены эллемента: " + Arrays.toString(arr) + "\n");
    }

    public static <T> void asList(T[]arr){
        System.out.println("Задание 2\n");
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Преобразование массива: " + alt + "\n");
    }
}
