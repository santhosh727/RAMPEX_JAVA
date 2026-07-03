package Day_6.Class_task;

public class star_pattern {
    public static void main(String [] args ){
        for (int i=5;i>=1;i--)
        {
            for (int j = 1; j <= i; j++) { // prints * * * * *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
