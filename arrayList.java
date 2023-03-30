import java.util.*;

class arrayList{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
ArrayList<Integer> al = new ArrayList<Integer>();
String input;
System.out.println("Enter the array elements (press exit to quit)");
while(true){
input = s.nextLine();
if(input.equals("exit")){
System.out.print("tata bye bye");
  break;
}
else{
   
  al.add(Integer.parseInt(input)); //Convert to integer
}
}
for(Integer i:al)
{
 System.out.print(i+" ");
}
  
}
}