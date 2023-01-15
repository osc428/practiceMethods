package veckan9;

public class dag2_replaceMetodu {
    public static void main(String[] args) {

        String str = "Berlin is capital of Germany";
        str = str.replace("Berlin", "London").replace("Germany", "England");
        System.out.println(str);

        String email = "isim_soyisim@gmail.com";
        String company = "eurotechstudy";
        email = email.replace("gmail", company);
        System.out.println("email = " + email);

        String cumle = "Coding is fun, it is my hobby";
        cumle = cumle.replace(" ", "");
        System.out.println("cumle = " + cumle);

        cumle = cumle.replace(",", "!!!");
        System.out.println("cumle = " + cumle);
        System.out.println();



    }
}
