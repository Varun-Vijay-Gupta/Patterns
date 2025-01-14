/*
 * concept ->
 * assume the pyramid as a matrix, and write the value in form of (i,j)
 * here, you will observe that when sum of i and j is even, 1 is present and when its odd, 0 is present.
 */

public class Half_Pyramid_0_and_1 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println("");
        }
    }
}
