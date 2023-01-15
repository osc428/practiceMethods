package veckan9;

public class dag2_concatContainIndexof {
    public static void main(String[] args) {

        String word = "Hello ";
        System.out.println(word);
        System.out.println(word.concat("World"));
        System.out.println(word);
        word = word.concat("World");
        System.out.println(word);

        //word = word.concat(123);
        word.concat("123");
        //word.concat('C');
        word = word + 123;

        word = word.concat(" -Hi").concat(" -How are you").concat(" -I am fine");
        System.out.println(word);
        System.out.println();

        String email = "test@mail.com";
        System.out.println(email.contains("@"));

        String liste = "domates,patates,sogan,havuc";
        if(liste.contains("muz")){
            System.out.println("Urun listede mevcut");
        }else{
            System.out.println("Urun listede mevcut degil");
        }

        boolean havucVarmi = liste.contains("havuc");
        System.out.println("havucVarmi = " + havucVarmi);

        boolean muzVarmi = liste.contains("muz");
        System.out.println("muzVarmi = " + muzVarmi);
        System.out.println();

        String word2 = "Germany";
        System.out.println(word2.indexOf("G"));
        System.out.println(word2.indexOf("rma"));
        System.out.println(word2.indexOf("zzz"));

        String url = "www.eurotechstudy.com";
        int index = url.indexOf(".");
        System.out.println("index = " + index);
        System.out.println(url.charAt(index));
        System.out.println(url.indexOf("t", 9));

    }
}
