public class Array2d {
    public static void main(String[] args) {
        int[][] a2 = new int[3][4];
        int count = 1;
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.print(a2[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}
