package veckan9;

public class dag4_pascalUcgeni {
    public static void main(String[] args) {
        String a = "1";

       int[] dizi = new int[a.length()];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = Integer.parseInt(String.valueOf(a.charAt(i)));
        }

        for (int k = 0; k < 10; k++) {


            int[] dizi2 = new int[dizi.length + 1];
            dizi2[0] = 1;
            System.out.print("1 ");

            for (int j = 1; j < dizi.length; j++) {
                dizi2[j] = dizi[j - 1] + dizi[j];
                System.out.print(dizi2[j] + " ");
            }

            dizi2[dizi.length] = 1;
            System.out.println("1");
            dizi = dizi2;
        }

    }
}
