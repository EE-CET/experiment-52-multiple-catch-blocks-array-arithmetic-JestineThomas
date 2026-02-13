import java.util.Scanner;

public class MultipleCatch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int in = sc.nextInt();
        int d = sc.nextInt();
        try{
            int r = arr[in] / d;  
            System.out.println(r);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
}
