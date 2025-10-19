public class Lab16_InvertedRightTriangleStar {
    public static void main(String[] args) {
        for (int i = 3; i > 0; i--) {
            // System.out.print("\n");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}