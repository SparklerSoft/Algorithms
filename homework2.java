import java.util.Arrays;

public class homework2 {
    public static void main(String[] args) {


        int numbers = 20;
        int n1 = 0;
        int n2 = 1;
        int n3;
        int t = 0;
        int numbers2 = 30;

        for (int i = 2; i <= numbers; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
        System.out.println();
        //printFibonacci(10);

        System.out.println();

        System.out.println("Second type "  + numbersFib(20));

        System.out.println();
        while (t <= numbers2){
            int [] arr = new int[numbers2 + 1];
            arr[0] = 0;
            arr[1] = 1;
            for (t = 2; t <= numbers2; t++){
                arr[t] = arr[t-1] + arr[t-2];
                System.out.print(" " + arr[t]);
            }
        }
    }

//    public static String printFibonacci(int numbers) {
//        String[] arr2;
//        if (numbers <= 1) {
//        } else if (numbers <= 2) {
//        } else {
//            int [] arr = new int[numbers + 1];
//            int i = 2;
//            arr[0] = 0;
//            arr[1] = 1;
//            for (i = 2; i <= numbers; i++){
//                arr [i] = Integer.parseInt(printFibonacci(numbers - 1) + printFibonacci(numbers - 2));
//            }
//            System.out.print(" " + Arrays.toString(arr));
//
//        }
//        return Arrays.toString(arr2);
//    }

    public static String numbersFib(int num){
        int [] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        return Arrays.toString(arr);
    }
}

