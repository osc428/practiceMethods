package veckan9;

import java.util.Scanner;

public class dag3_cumleHarfAnaliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence to analyse:");
        String metin = scan.nextLine();
        String harfler = tekeIndir(metin);

        for (int i = 0; i < harfler.length(); i++) {
            String arananHarf = harfler.substring(i, i + 1);
            System.out.println("'" + arananHarf + "':" + harfSay(metin,arananHarf));
        }
    }

    public static String tekeIndir(String metin){
        StringBuilder yeniMetin = new StringBuilder(metin.substring(0, 1));
        for (int i = 1; i <metin.length() ; i++) {
            String harf = metin.substring(i,i+1);
            String kalan = metin.substring(i);
            if(yeniMetin.toString().contains(harf)){
                if (!kalan.contains(harf)){
                    yeniMetin.append(harf);}
            }else{
                yeniMetin.append(harf);
            }
        }
        return yeniMetin.toString();
    }
    public static int harfSay(String metin, String arananHarf){
        int sayi = 0;
        for (int i = 0; i <metin.length() ; i++) {
            String harf = metin.substring(i, i + 1);
           if (arananHarf.equals(harf)) {
                sayi++;
            }
        }
        return sayi;
    }
}
