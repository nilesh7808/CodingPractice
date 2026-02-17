import java.util.Scanner;

public class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        System.out.print("Enter a name that you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(originalString);
        stringBuilder.reverse();
        System.out.println("The final String will be : " + stringBuilder);
    }
}
