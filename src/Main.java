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



        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задание 3: ");
        System.out.println("Добавляем фрукты в коробки: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(),15);
        ap.addFruit(new Apple(),15);
        ap1.addFruit(new Apple(),5);
        System.out.println("Коробка 1: " + or.getWeight());
        System.out.println("Коробка 2: " + or1.getWeight());
        System.out.println("Коробка 3: " + ap.getWeight());
        System.out.println("Коробка 4: " + ap1.getWeight());
        System.out.println("Сравниваем коробки:\ntrue - веса равны\nfalse - веса не равны");
        System.out.println("Коробка 1 равна коробки 3? -  "+or.compare(ap));
        System.out.println("Коробка 2 равна коробки 4? -  "+or1.compare(ap1));
        System.out.println("Пересыпаем фрукты из одной коробки в другую!");
        or.putTo(or1);
        ap.putTo(ap1);
        System.out.println("Новый вес коробок: ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
    }


    public static void replacement(Object[] arr, int a1, int a2){
        System.out.println("Задание 1: " + Arrays.toString(arr));
        Object sw = arr[a1];
        arr[a1] = arr[a2];
        arr[a2] = sw;
        System.out.println("Результат смены эллемента: " + Arrays.toString(arr) + "\n");
    }

    public static <T> void asList(T[]arr){
        System.out.println("Задание 2:\n");
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Преобразование массива: " + alt + "\n");
    }
}
