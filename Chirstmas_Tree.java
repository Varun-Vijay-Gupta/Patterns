public class Chirstmas_Tree {
    public static void main(String[] args) {
        int n = 18;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 2*i - 1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i = 1; i <= (2*n - 1)/4; i++){
            for(int j = 1; j <= ((2*n - 1)/2) - 2; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= 4; j++){
                System.out.print("# ");
            }
            System.out.println("");
        }
    }
}
