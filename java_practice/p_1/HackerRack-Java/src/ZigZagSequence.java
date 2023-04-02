import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/*Debug the given function findZigZagSequence to return the appropriate 
zig zag sequence for the given input array.
input 
n= 7 //size of arr
a=[2,3,5,1,4]

output
[1,4,5,3,2]
input

1 2 3 4 5 6 7
output
1 2 3 7 6 5 4

https://www.hackerrank.com/challenges/one-month-preparation-kit-zig-zag-sequence/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-month-preparation-kit&playlist_slugs%5B%5D=one-month-week-two&h_r=next-challenge&h_v=zen
*/
		
public class ZigZagSequence {
    
    public static void main (String[] args) throws java.lang.Exception {
       int[] a= {2,3,5,1,4};
            findZigZagSequence(a, a.length);
   }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2 - 1;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;
    
        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



