package gcdnumbers;
import java.util.Scanner;


public class Area_Perimeter {
    public static void main(String[] args) {
        int length, breadth, perimeter, area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextInt();

        perimeter = 2 * (length + breadth);
        area = length * breadth;

        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Area of the rectangle: " + area);
    }
}

