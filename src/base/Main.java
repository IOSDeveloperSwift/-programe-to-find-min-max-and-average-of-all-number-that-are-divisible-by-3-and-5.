package base;

public class Main {

    public static void main(String[] args) {

        int[] array = {56, 15, 3, 54, 6, 7, 30, 8};

        func(array);
    }
    //TODO, programe to find min,max and average of all number that are divisible by 3 and 5.

    static void func(int[] arr) {
        int min = arr[0];
        int max = arr[1];
        int count = 0;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                count++;
                total += arr[i];

                max = arr[i] > max ? arr[i] : max;
                min = arr[i] < min ? arr[i] : min;

            }

        }
        int avg = total / count;
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Avg " + avg);

    }


}
