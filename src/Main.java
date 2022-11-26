public class Main {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        float[] array = {1.57f, 7.654f, 9.986f};
        boolean[] array2 = {true, false};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

for (int i = 0; i < array.length; i++) {
        System.out.print(array[i]);
        if (i != array.length - 1) {
        System.out.print(",");
        }
        }
        System.out.println();


        for (int i = 0; i < array2.length; i++) {
        System.out.print(array2[i]);
        if (i != array2.length - 1) {
        System.out.print(",");
        }
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}