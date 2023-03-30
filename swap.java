import java.util.Scanner;

class swap{

public static void main(String args[]){
 Scanner s = new Scanner(System.in);
 int first,second,temp;
 System.out.println("Enter two numbers");
 first = s.nextInt();
 second = s.nextInt();
 temp = first;
 first = second;
 second =temp;
 System.out.println("first=" +first+ "  second="+second);
}

}