package veckan9;

public class dag2_stringReverse {
    public static void main(String[] args) {
        String metin = "DDEECGDDEEEEFGGDCDDM";
        System.out.println(reverse(metin));
    }

    public static String reverse(String metin) {
        StringBuilder yeniMetin = new StringBuilder();

        for (int i = metin.length(); i >=2 ; i--) {
            String harf = metin.substring(i-1, i);
                yeniMetin.append(harf);
        }
        return yeniMetin.toString();
    }
}
