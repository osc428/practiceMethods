package veckan9;

import java.util.Scanner;

public class dag1_length {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        int c = b.length();
        System.out.println("c = " + c);
        System.out.println(b.charAt(0));
        System.out.println(b.charAt(b.length()-1));

        for (int i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }

    }
}
