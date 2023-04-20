import java.util.Scanner;

public class lab6A {
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.print("Enter start number: ");
    //     int startNo = input.nextInt();
    //     System.out.print("Enter end number: ");
    //     int endNo = input.nextInt();


    //     if (startNo < 0) {
    //         System.out.println("startNo cannot be less than 0");
    //         return;
    //     }

    //     if (endNo < 0) {
    //         System.out.println("endNo cannot be less than 0");
    //         return;
    //     }

    //     if (endNo > 9) {
    //         System.out.println("endNo cannot be greater than 9");
    //         return;
    //     }

    //     if (startNo > endNo) {
    //         System.out.println("startNo must NOT be greater than endNo");
    //         return;
    //     }

    //     int sumCube = 0;
    //     for (int i = startNo; i <= endNo; i++) {
    //         sumCube += i * i * i;
    //     }

    //     System.out.println("Sum of Cube of Numbers = " + sumCube);
    // }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers separated by space (startNo and endNo): ");
        int startNo = input.nextInt();
        int endNo = input.nextInt();
        
        if (startNo < 0) {
            System.out.println("startNo cannot be less than 0");
            return;
        }
        
        if (endNo < 0) {
            System.out.println("endNo cannot be less than 0");
            return;
        }
        
        if (endNo > 9) {
            System.out.println("endNo cannot be greater than 9");
            return;
        }
        
        if (startNo > endNo) {
            System.out.println("startNo must NOT be greater than endNo");
            return;
        }
        
        int sumCube = 0;
        for (int i = startNo; i <= endNo; i++) {
            sumCube += i * i * i;
        }
        
        System.out.println("Sum of Cube of Numbers = " + sumCube);
    
}

}
