import java.util.*;
 class Solution {
    public static int[] bubbleSort(int[] arr){
        int flag=0;
        int temp;
        int n = arr.length;
        for(int i =0;i<n-1;i++){
          for(int j =0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                flag = 1;
            }
          }
          if(flag ==0){
            break;
          }

        }
        return arr;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i =0;i<m;i++){
            arr[i] = sc.nextInt();
        }
        int[] Bubble_Sort = Solution.bubbleSort(arr);
        System.out.println(Arrays.toString(Bubble_Sort));
    }
}