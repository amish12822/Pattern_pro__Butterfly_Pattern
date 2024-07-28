/**
 * butterfly_pattern
 */
public class butterfly_pattern {

    public static void main(String[] args) {
        
        int n = 4;

        for ( int i=1; i<=n; i++){

            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = (n-i)*2;

            for ( int j=1; j<=space; j++){
                System.out.print("  ");
            }

            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // bottom

        for ( int i=n; i>=1; i--){

            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }

            int space = (n-i)*2;

            for ( int j=1; j<=space; j++){
                System.out.print("  ");
            }

            for ( int j=1; j<=i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

}