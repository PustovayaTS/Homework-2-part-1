import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        //Array1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //Array2
        double[] arr2 = {1.57, 7.654, 9.986};

        //Array3
        int[] arr3 = {20, 25, 30, 35};

        {
            System.out.println("Задача №2");
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr2));
            System.out.println(Arrays.toString(arr3));
        }
        System.out.println("Задача №3");
        //Array1
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        //Array2
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }
        //Array3
        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
        System.out.println("Задача №4");
        //Array1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
        //Array3
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 != 0) {
                arr3[i] = arr3[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}