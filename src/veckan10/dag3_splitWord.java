package veckan10;


public class dag3_splitWord {
    public static void main(String[] args) {
        String st = "the cat in the * 5 hat * 4 jumped over the moon * 1 wow * 8 the hat ran * 2 away with the spoon ";
        String[] words = new String[boslukSay(st)];
        int a = 0;
        for (int i = 0; i < words.length; i++) {
            int b = st.indexOf(' ', a+1);
            words[i] = st.substring(a, b);
            a=b;
        }
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static int boslukSay(String s) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                j++;
            }
        }
        return j;
    }

}
