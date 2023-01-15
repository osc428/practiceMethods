package veckan9;

public class dag2_tekHarfleriBul {
    public static void main(String[] args) {
        String metin = "DDEECGDDEEEEFGGDCDDM";
        System.out.println(tekleriBul(metin));
    }

    public static String tekleriBul(String metin) {
        StringBuilder yeniMetin = new StringBuilder();

        for (int i = 0; i <metin.length() ; i++) {
            String harf = metin.substring(i, i + 1);
            String kalan = metin.substring(i+1).concat(metin.substring(0,i));

            if (!kalan.contains(harf)){
                yeniMetin.append(harf);
            }
        }
        return yeniMetin.toString();

    }
}
