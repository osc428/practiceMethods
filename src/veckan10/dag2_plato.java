package veckan10;

public class dag2_plato {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 5, 5, 5, 4, 5, 8, 8, 8, 9, 9, 9, 5, 2, 3, 3, 3, 3, 3, 2, 1, 4, 4 };
        plato[] a = new plato[nums.length];
        int platoNum=0;
        for (int i = 1; i < nums.length-1; i++) {
            if (nums[i]==nums[i+1]&&nums[i]>nums[i-1]){
                a[platoNum] = new plato();
                a[platoNum].platoBas = i;
                a[platoNum].platoYukseklik = nums[i];
            }else   if(nums[i]==nums[i-1]&&nums[i]>nums[i+1]){
                    a[platoNum].platoSonu = i;
                    platoNum++;}
        }

        for (dag2_plato.plato plato : a) {
            if (plato != null) {
                System.out.println("plato bolgesi : " + plato.platoBas + " ile " + plato.platoSonu + " arasi");
                System.out.println("plato yuksekligi : " + plato.platoYukseklik);
                System.out.println();
            }
        }
    }


    public static class plato{
        int platoBas=0;
        int platoSonu=0;
        int platoYukseklik=0;


    }
}
