public class chessboard {

    public static void main(String[] args) {
        int size = 8;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("w ");
                }  else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
/*
w B w B w B w B
B w B w B w B w
w B w B w B w B
B w B w B w B w
w B w B w B w B
B w B w B w B w
w B w B w B w B
B w B w B w B w
*/

