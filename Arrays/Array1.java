public class Array1 {
    public static void main(String[] args) {
        int[] a1 = new int[6];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }
        for (int j = 0; j < a1.length; j++) {
            System.out.print(a1[j] + " ");
        }
    }
}
