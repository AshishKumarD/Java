import java.util.*;

class ArrayInsert{

public static int[] insert(int[] arr, int val, int pos){
	int newArr[] = new int[arr.length+1]; 
  for(int i=0;i<=arr.length;i++){
	if(i==pos){
	newArr[i]=val;
        continue;
        }
	else if(i<pos)
         newArr[i]=arr[i]; 
        else if(i>pos)
	 newArr[i]= arr[i-1];
   }
   return newArr;

}
public static void main(String args[]){
  int arr[] = {1,2,3,4,5};
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the value and index");
  int val = s.nextInt();
  int pos = s.nextInt(); 
  System.out.println("Array before insertion"+Arrays.toString(arr));
  arr =  insert(arr,val,pos); 
  for  (int v: arr)
    System.out.print(v+" ");

  //System.out.println("Array after insertion"+Arrays.toString(arr));  
 }
}