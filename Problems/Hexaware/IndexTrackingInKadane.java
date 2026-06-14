class IndexTrackingInKadane{
      public static void printSubarray(int[] nums){
        int sum=0,maxSum=Integer.MIN_VALUE;
        int start=0,end=0,tempStart=0;//actual correct indexes
        for(int i=0;i<nums.length;i++){
          if(sum+nums[i] <nums[i]){
            sum=nums[i];
            tempStart=i;
          }
          else{
              sum=sum+nums[i];
          }
          if( maxSum<sum){
            maxSum=sum;
            start=tempStart; //start doesnt track anything it is updated only when the index does give the best array so far
            //think of it like we are saving a potential index 
            end=i;
          }
        }  
        for(int i=start;i<=end;i++){
          System.out.print(nums[i]);
        }
      }
      public static void main(String[] args){
        int[] a={-5,7,-8,9,-20};
        printSubarray(a);
      }
}
