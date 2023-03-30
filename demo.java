class demo{
 public static void main(String[] args){
   int[] arr = {3,0,1};
int output = missingNumber(arr);
System.out.println(output);
}
public static int missingNumber(int[] nums)
{
 int n = nums.length; //9
int sum=0;
for(int i=0; i<=n; i++)
	sum+=i;//45
for(int i=0; i<n; i++)
 	sum-=nums[i];
return sum;
}

}