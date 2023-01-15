package veckan10;
//Stringden bosluk ve tire atma
public class ex2_stringtenBoslukAtma {
    public static void main(String[] args) {
        String cc = "4506-3547 9856-6521";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < cc.length(); i++) {
            if (cc.charAt(i) != ' ' && cc.charAt(i) != '-')
                s.append(cc.charAt(i));
        }
        cc = s.toString();
        System.out.println(cc);
    }
}
