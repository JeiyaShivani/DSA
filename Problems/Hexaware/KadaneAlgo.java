class KadaneAlgo{
public static void maxSumOfArray(int[] arr){
  int sum=0,maxSum=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++){
     sum=Math.max(sum+arr[i],arr[i]);
    maxSum=Math.max(sum,maxSum);
  }
  
}
  public static void main(String[] args){
       int[] a=new int[]{ -2,1,-3,4,-1,2,1,-5,4};
       maxSumOfArray(a);
  }
}

// two choices either to start a new subarray or to continue with old
