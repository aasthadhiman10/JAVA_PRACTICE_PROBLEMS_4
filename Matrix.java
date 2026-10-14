class Matrix {
int a11, a12, a21, a22;
static String matrixType = "2x2 Matrix";
Matrix(int x, int y, int z, int w) {
    a11 = x;
    a12 = y;
    a21 = z;
    a22 = w;
}

void displayOperations(Matrix m) {
    int s11 = a11 + m.a11;
    int s12 = a12 + m.a12;
    int s21 = a21 + m.a21;
    int s22 = a22 + m.a22;

    int d11 = a11 - m.a11;
    int d12 = a12 - m.a12;
    int d21 = a21 - m.a21;
    int d22 = a22 - m.a22;

    System.out.println("Matrix Type: " + matrixType);

    System.out.println("Addition:");
    System.out.println(s11 + " " + s12);
    System.out.println(s21 + " " + s22);

    System.out.println("Subtraction:");
    System.out.println(d11 + " " + d12);
    System.out.println(d21 + " " + d22);
}

public static void main(String[] args) {
    Matrix m1 = new Matrix(1, 2, 3, 4);
    Matrix m2 = new Matrix(5, 6, 7, 8);

    m1.displayOperations(m2);
 }
}
