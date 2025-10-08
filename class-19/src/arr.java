public class arr {
    public static void abc(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 56, 67};
        abc(arr);
    }
}
