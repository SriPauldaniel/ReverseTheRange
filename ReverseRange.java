import java.util.Scanner;
public class ReverseRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        reverseArray(arr, n, start, end);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] reverseArray(int[] arr,int n,int start,int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
        return arr;
    }
}