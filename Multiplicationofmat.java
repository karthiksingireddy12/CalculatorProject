package javalab2;

public class Multiplicationofmat {
    public static void main(String[] args) {
        int a[][] = {{1,2,1},{2,3,2},{3,4,3}};
        int b[][] = {{1,2,1},{2,4,2},{3,6,3}};
        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j] = 0;
                for (int k=0;k<3;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.println(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}
