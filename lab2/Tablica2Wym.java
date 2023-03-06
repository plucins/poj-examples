package pl.pjatk.tablice;

public class Tablica2Wym {
    public static void main(String[] args) {
        int[][] xy = new int[5][4];
        int liczba = 0;

        for (int i=0;i<xy.length; i++){
            for (int j=0; j<xy[0].length; j++){
                xy[i][j]=liczba++;
            }
        }

        for (int i=0;i<xy.length; i++){
            for (int j=0; j<xy[0].length; j++){
                System.out.print(xy[i][j]+"\t");
            }
            System.out.println();
        }

        int[][][] xyz =  new int [2][3][4];

        xyz[1][2][3]=2;



    }
}
