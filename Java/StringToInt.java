import java.util.Scanner;

class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("Integer value = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: The input is not a valid integer.");
        }

        sc.close();
    }
}