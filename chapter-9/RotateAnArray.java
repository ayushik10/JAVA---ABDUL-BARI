import java.util.Scanner;

public class RotateAnArray  {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int A[] = new int[n];
       
        System.out.println("Enter the elements of the array : ");
        for(int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println();
        
        System.out.println("Array before rotation : ");
        for(int i:A)
        System.out.print(i + " ");

        int temp = A[0];

        for(int i=1; i<n; i++) {
            A[i-1] = A[i];
        }
        A[n-1] = temp;

        System.out.println();
        
        System.out.println("Array after rotation : " );
        for(int i:A)
        System.out.print(i + " ");
    }
    
}
