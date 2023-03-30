package matrix;

class Matrix3D extends Matrix2D {
	int num;
	int matrix[][][];

	Matrix3D() {
		super();
		// matrix=new int[row][column][num];
		System.out.println("3d Matrix is born");
	}

	Matrix3D(int row, int column, int num) {
		this();
		System.out.println("Matrix of size " + row + " , " + column + " , " + num + " is created");
	}

	public void get() {
		super.get();

		System.out.println("Num of matrix is " + num);
	}

	public void set() {
		super.set();
		System.out.println(" enter the num");
		this.num = s.nextInt();
		matrix = new int[row][column][num];
	}
}
