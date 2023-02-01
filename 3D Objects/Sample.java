// import java.util.*;
//   import java.io.*;
  
//   public class Sample{
//     public static void main(String args[]) throws IOException {
      
//       //write your code here
//       Scanner sc =new Scanner(System.in);
//       int t=sc.nextInt();
//       while(t-- >0){
//         int n=sc.nextInt();
//         char[] a=new char[n];
//         int count=0;
//         for(int i=0;i<n;i++){
          
//           char c=sc.next().charAt(0);
//           a[i]= c;
          
//           if(a[i]=='x'){
//             count++;
//           }
//         }
//         System.out.println(count);
        
//       }
      
//     }
//   }
// import java.util.*;
// import java.io.*;

// public class Sample{
//     public static void main(String args[]) throws IOException{
//         Scanner sc = new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-- >0){
//             int n=sc.nextInt();
//             char[] a =new char[n];
//             int count=0;
//             for(int i=0;i<n;i++){

//                 char c=sc.next().charAt(0);
//                 a[i]=c;

//                 if(a[i]=='x'){
//                     count++;
//                 }
//             }
//             System.out.println(count);
//         }
//     }
// }
class Sample  {
    // public static void main(String arggs[]){
        void bubblesort(int arr[],int n){
            for(int i=n-1; i>=0; i--){
                 for(int j=0; j<i; j++){
                     if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                          arr[j]=arr[j+1];
                          arr[j+1]=temp;
                     }
                }
            }
        }
    }

