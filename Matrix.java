import java.util.*;


public class Matrix{
	public static void main(String[] args){  
    	Scanner s= new Scanner(System.in);
 	//matrix2d m = new matrix2d();
	matrix3d m = new matrix3d();
	m.set();
	m.get();
        //m.create();
	//m.display();
	//
	}
}


public class matrix2d{
Scanner s= new Scanner(System.in);
//defining attribtes
   	int row,column;
//constructor
 	int matrix[][];
     
 	matrix2d(){
   	 	  
   		 //matrix=new int[row][column];
		 System.out.println("2d Matrix is born");
	}
	
 	matrix2d(int row, int column){
		this();
		this.set(row,column);
		this.get();
	}

 public void get(){
	System.out.println("Row of matrix is "+ row);
	System.out.println("Column of matrix is "+ column);
	}

 public void set(){
System.out.println(" enter the rows and columns");
this.row = s.nextInt();
this.column =s.nextInt();
matrix = new int[row][column];
 }


  public void set(int row, int column){
	this.row = rowSys;
	this.column= column;
	matrix = new int[row][column];
	}

	public void create(){
  System.out.println(" enter the element of matrix of size ");

for(int i=0;i<row;i++){
  for(int j=0;j<column;j++){
    
	matrix[i][j]=s.nextInt();
  }
 }
}

public void display(){
  System.out.println("MAtrix is");

for(int i=0;i<row;i++){
  for(int j=0;j<column;j++){
    System.out.print(matrix[i][j]+" "); 
	
  }
	System.out.println();
 }
}

}

  

public class matrix3d extends matrix2d{
	int num;
	int matrix[][][];
	matrix3d(){
   	 	 super(); 
   		// matrix=new int[row][column][num];
		 System.out.println("3d Matrix is born");
	}
	matrix3d(int row, int column, int num){
		this();
		System.out.println("Matrix of size "+ row+" , "+column+" , "+num+" is created");
	}

	public void get(){
	super.get();
	
	System.out.println("Num of matrix is "+ num);
	}

 public void set(){
super.set();
System.out.println(" enter the num");
this.num= s.nextInt();
matrix = new int[row][column][num];
 }
}



