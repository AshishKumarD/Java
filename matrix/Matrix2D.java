package matrix;

import java.util.*;

class Matrix2D {
  Scanner s = new Scanner(System.in);
  // defining attribtes
  int row, column;
  // constructor
  int matrix[][];

  Matrix2D() {

    // matrix=new int[row][column];
    System.out.println("2d Matrix is born");
  }

  Matrix2D(int row, int column) {
    this();
    this.set(row, column);
    this.get();
  }

  public void get() {
    System.out.println("Row of matrix is " + row);
    System.out.println("Column of matrix is " + column);
  }

  public void set() {
    System.out.println(" enter the rows and columns");
    this.row = s.nextInt();
    this.column = s.nextInt();
    matrix = new int[row][column];
  }

  public void set(int row, int column) {
    this.row = row;
    this.column = column;
    matrix = new int[row][column];
  }

  public void create() {
    System.out.println(" enter the element of matrix of size ");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {

        matrix[i][j] = s.nextInt();
      }
    }
  }

  public void display() {
    System.out.println("MAtrix is");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(matrix[i][j] + " ");

      }
      System.out.println();
    }
  }

}
