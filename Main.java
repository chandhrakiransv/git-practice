// public class Main {
//     public static void main(String[] args) {
//         int[] arr={0,1,0,12,3};
//         int[] arr1=new int[arr.length];
//         int j=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 arr1[j]=arr[i];
//                 j++;
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]!=0){
//                 arr1[j]=arr[i];
//                 j++;
//             }
//         }
//         for(int i=0;i<arr1.length;i++){
//             System.out.println(arr1[i]);
//         }
//     }
// }


public class Main {
    public static void main(String[] args) {
        int[] arr={0,1,0,12,3};
        int[] arr1=new int[arr.length];
        int j=0;
       
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[j]=arr[i];
                j++;
            }
        }
         for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                arr1[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}


