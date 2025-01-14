public class Inverted_Alphabet_half_Pyramid {
    public static void main(String[] args) {
        int n = 4;

        for(int i = n; i >= 1; i--){
            char c = 65;
            for(int j = 1; j <= i; j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println("");
        }
    }
}
