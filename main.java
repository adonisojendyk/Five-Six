import java.util.Scanner;   

public class ThreeTwentySix {
    public static void main(String[] args) {
        
      Scanner randomint = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int integer = randomint.nextInt();
        
        String divisable = "";
        String kinda = "";
        String bothorneither = "";
        
        int divise5 = integer%5; 
        int divise6 = integer%6;
        
        //System.out.println("This is 5: " + divise5 + " This is 6: " +divise6);
        
        if(divise5 == 0 && divise6 == 0 ) {
            divisable = "True";
            kinda = "True";
            bothorneither = "False";
        }
        else if (divise5 != 0 && divise6 != 0) {
            divisable = "False";
            kinda = "False";
            bothorneither = "False";
        }
        else if (divise5 == 0 && divise6 != 0 || divise6 == 0 && divise5 != 0) {
            divisable = "False";
            kinda = "True";
            bothorneither = "True";
        }
      
        System.out.printf("Divisable by 5 and 6: %18s \n",  divisable);
        System.out.printf("Divisable by 5 or 6: %19s\n", kinda);
        System.out.printf("Divisable by 5 or 6, but not both: %s\n", bothorneither);
        
        
        
    }
}
