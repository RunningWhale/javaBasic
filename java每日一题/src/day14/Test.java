package day14;

public class Test {
    public static void main(String[] args) {
        int[]arr={2, 2, 0, 0, 0, 3, 0, 0, 1, 0};
        smallNumber(arr);
    }
    public static void smallNumber(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        int tmp = 0;
        for (int j = 0; j <arr.length ; j++) {
            if (arr[j] != 0){
                tmp = arr[0];
                arr[0] = arr[j];
                arr[j] = tmp;
                break;
            }
        }
        //System.out.println(Arrays.toString(arr));
        for (int val:arr) {
            System.out.print(val);
        }
    }

}
