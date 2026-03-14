public class Binary {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int num = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 1) ? 0 : 1;
            }

            System.out.println();
        }
    }
}
