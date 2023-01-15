package veckan9;
import java.util.Arrays;

public class dag5_arabaDizisi {
    public static void main(String[] args) {
        System.out.println("Dizi elemanlarının yazdırılması...");
        String[] arabalar = {"Mazda","Murat", "Şahin", "Wolkswagen","BMW"};

        System.out.println("Dizinin herbir elemanına indeks numarası ile erişip ekrana tek tek yazdırılması");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(arabalar[0]);
        System.out.println(arabalar[1]);
        System.out.println(arabalar[2]);
        System.out.println(arabalar[3]);
        System.out.println(arabalar[4]);
        System.out.println();

        System.out.println("For...loop ile dizinin elemanlarının ekrana yazdırılması");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 5 ; i++) {
            System.out.println(i + " -indeksli elemanı  " + arabalar[i]);
        }

        System.out.println();
        System.out.println("For...loop .length medodu kullanarak");
        System.out.println("------------------------------------");

        for (int i = 0; i < arabalar.length ; i++) {
            System.out.println(i + " -indeksli elemanı  " + arabalar[i]);
        }

        System.out.println();
        System.out.println("For...each ile dizi elemanlarının ekrana yazdırılması...");
        System.out.println("--------------------------------------------------------");
        //for ...each
        for(String araba: arabalar){
            System.out.println("Araba adı = " + araba);
        }

        System.out.println();
        //Arrays.toString()
        System.out.println("Arrays.toString() metodu ile dizi elemanlarının ekrana yazdırılması...");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Arabalar..: " + Arrays.toString(arabalar));

    }
}
