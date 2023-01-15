package veckan9;

public class dag2_harfleriTekeIndir {
    public static void main(String[] args) {
        String metin = "DDEECGDDEEEEFGGDCDDM";
        System.out.println(tekeIndir(metin));

    }

    public static String tekeIndir(String metin){
        String yeniMetin = metin.substring(0,1);
        for (int i = 1; i <metin.length() ; i++) {
            String harf = metin.substring(i,i+1);
            String kalan = metin.substring(i);
            if(yeniMetin.contains(harf)){
                if (!kalan.contains(harf)){
                yeniMetin += harf;}
            }else{
            yeniMetin += harf;
            }
        }
        return yeniMetin;
    }
}
