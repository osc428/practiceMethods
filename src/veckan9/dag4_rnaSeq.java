package veckan9;

import java.util.Scanner;

public class dag4_rnaSeq {
    public static void main(String[] args) {
        System.out.println("Write a Sequence : ");
        Scanner seqInput = new Scanner(System.in);
        String seq = seqInput.nextLine();
        String karsiSeq = "";
        for (int i = 0; i < seq.length(); i++) {
            char harf = seq.charAt(i);
            char karsiHarf = ' ';
            switch (harf){
                case 'A' :
                    karsiHarf = 'U';
                    break;
                case 'G' :
                    karsiHarf = 'C';
                    break;
                case 'C' :
                    karsiHarf = 'G';
                    break;
                case 'T' :
                    karsiHarf = 'A';
                    break;
            }
            String khs = Character.toString(karsiHarf);
            karsiSeq = karsiSeq.concat(khs);
        }
        System.out.println("karsiSeq = " + karsiSeq);

    }
}
