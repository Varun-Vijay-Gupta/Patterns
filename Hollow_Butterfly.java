public class Hollow_Butterfly {
    public static void main(String[] args) {
        int n = 5;
        

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if( j == 1 || j == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                if( j == i || j == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.println("");
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if( j == 1 || j == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= 2*(n - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                if( j == i || j == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.println("");
        }
        
    }
}
