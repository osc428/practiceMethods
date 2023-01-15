package veckan10;

public class dag3_decodeKisa {
    public static void main(String[] args) {
        String st = "the cat in the * 5 hat * 4 jumped over the moon * 1 wow * 8 the hat ran * 2 away with the spoon";
        String[] words=st.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("*")) {
                String wordNew = "";
                for (int j = 0; j < Integer.parseInt(words[i+1]); j++) {
                    wordNew = wordNew.concat(words[i-1] + " ");
                }
                words[i-1] = wordNew;
                words[i] = "\b\b";
                words[i+1] = "\b";


            }
        }
        for(String w:words){
            System.out.print(w + " ");
        }
    }
}
