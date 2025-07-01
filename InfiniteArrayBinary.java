public class InfiniteArrayBinary {
     public static void main(String[] args) {
    int[] arr = {5,8,9,14,25,36,45,56,61,64,69,72,78,81,85,88,92,94,96,97,99,100};
     int target = 14;
     int answer = ans(arr, target);
     System.out.println(answer);
     }
     static  int ans(int[] arr , int target){
        int start =0;
        int end =1;
        while(target>arr[end]){
            int newstart = end + 1 ;
            end =   end + (end -start +1)*2;
            start = newstart;
        }
        return binarysearch(arr, target, start, end);
     }
    static  int binarysearch(int[] arr,int target,int start , int end){
        while(start<=end) {
          int mid = start + (end - start )/2;
      if(arr[mid]>target)
      {
        end = mid - 1;
      }
      else if(arr[mid]<target){
        start = mid + 1;
      }

      else{
        return mid;
      }
    }
      return -1;
     }
}
