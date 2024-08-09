import java.util.Scanner;

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long num = sc.nextLong();
        long result = square(num);
        System.out.println("Square of the number is: " + result);
    }

    public static long square(long num) {
        String numStr = Long.toString(num);
        int n = numStr.length();

        if (n == 1) {
            return num * num;
        }

        int mid = n / 2;

        String highStr = numStr.substring(0, mid);
        String lowStr = numStr.substring(mid);

        long high = Long.parseLong(highStr);
        long low = Long.parseLong(lowStr);

        // Formula : (high*10^(mid)+low)^2
        long result = (high * (long) Math.pow(10, mid) + low)
                * (high * (long) Math.pow(10, mid) + low);

        return result;
    }
}
