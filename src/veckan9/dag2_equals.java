package veckan9;

public class dag2_equals {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "Hello Moon";

        boolean karsilastirma = str1.equals(str2);
        boolean karsilastirma2 = str1.equals(str3);

        System.out.println("karsilastirma = " + karsilastirma);
        System.out.println("karsilastirma2 = " + karsilastirma2);

        boolean karsilastirma3 = str1 == str2;
        boolean karsilastirma4 = str1 == str3;

        System.out.println("karsilastirma3 = " + karsilastirma3);
        System.out.println("karsilastirma4 = " + karsilastirma4);

        String str4 = new String("Hello World");

        boolean karsilastirma5 = str1.equals(str4);
        boolean karsilastirma6 = str1 == str4;

        System.out.println("karsilastirma5 = " + karsilastirma5);
        System.out.println("karsilastirma6 = " + karsilastirma6);

        System.out.println();

        String str = "Java String manupilation is fun";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5,11));

        System.out.println(str.substring(5,str.length()-5));

        String symbols ="{{}}";
        String word = "JAVA IS COOL";
        String newStr = symbols.substring(0,2).concat(word).concat(symbols.substring(2,symbols.length()));
        System.out.println("newStr = " + newStr);

    }
}
