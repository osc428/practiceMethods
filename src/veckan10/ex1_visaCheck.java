package veckan10;

public class ex1_visaCheck {
    public static void main(String[] args) {
        String cardNum = "4916170486048941";
        System.out.println("Is this a valid Visa : " + checkCardNum(cardNum));

    }

    public static boolean checkCardNum (String cardNum) {
        String dropped = cardNum.substring(0, cardNum.length() - 1);
        int lastDigit = Integer.parseInt(cardNum.substring(cardNum.length()-1));
        String reverseDropped = reverse(dropped);

        int bTotal = 0;
        for (int i = 0; i < reverseDropped.length(); i += 2) {
            int b = Integer.parseInt(String.valueOf(reverseDropped.charAt(i)));
            if (b * 2 > 9) {
                b = b * 2 - 9;
            } else {
                b = b * 2;
            }
            bTotal += b;
        }

        int cTotal = 0;
        for (int i = 1; i < reverseDropped.length(); i += 2) {
            int c = Integer.parseInt(String.valueOf(reverseDropped.charAt(i)));
            cTotal += c;
        }
        return (bTotal + cTotal + lastDigit) % 10 == 0;
    }

    public static String reverse(String toReverse) {
        String reverse = "";
        for (int i = toReverse.length()-1; i >=0 ; i--) {
        reverse = reverse.concat(String.valueOf(toReverse.charAt(i)));
        }
        return reverse;
    }
}
