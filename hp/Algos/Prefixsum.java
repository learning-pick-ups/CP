import java.util.Scanner;

public class Prefixsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for( int i =0 ; i < n ;i++){
            a[i] = sc.nextInt();
        }
        // prefix array sum
        int[] prefix = new int[n];
        for( int i=0; i < n ; i++){
            if(i ==0){
                prefix[i] = a[i];
            }
            else{
                prefix[i] = prefix[i-1] + a[i];
            }
        }

        // suffix sum array
        int[] suffix = new int[n];
        for(int i =0 ; i < n ; i++){
            if(i==0){
                suffix[i] = a[n-1];
            }
            else{
                suffix[i] = suffix[i-1] - a[i-1];
            }
        }
        
        for(int i =0; i < n; i++){
            if(suffix[i] == prefix[i]){
                System.out.println("\n"+suffix[i]);
            }
        }
    }
  }
