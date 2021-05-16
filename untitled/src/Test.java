import java.util.*;

public class Test {



    public static void main(String[] args) {
//        Map<String, String> kwyvalueMpa = new HashMap<>();
//        kwyvalueMpa.put("1", "One");
//        kwyvalueMpa.put("2", "Two");
//        kwyvalueMpa.put("3", "Three");
//        kwyvalueMpa.put("4", "Four");
//
//        kwyvalueMpa.entrySet().stream().forEach(x -> System.out.println(" Key = "+x.getKey() + "====" + "value = "+x.getValue()));
          String s="abbcaddaee";
         char[] chars = s.toCharArray();
         String temp =s ;
         char curr,next;
         int index =0;
         String sequence = "";
        temp = getString(s, chars, temp);
        //System.out.println(temp);
          }

    private static String getString(String s, char[] chars, String temp) {
        String sequence;
        char curr;
        char next;
        int index;
        boolean hasmodified = false;
        if(chars.length != 1) {
            for (int i = 0; i < chars.length - 1; i++) {
                index = i;

                if ((index + 1 != chars.length)) {
                    curr = chars[index];
                    next = chars[index + 1];
                    sequence = "" + chars[i] + chars[i];
                    if (curr == next) {
                        if (s.contains(sequence)) {
                            hasmodified = true;
                            temp = temp.replace(sequence, "");
                        }
                    }
                }
            }
            System.out.println(temp);
            if (hasmodified) {
                temp = getString(temp, temp.toCharArray(), temp);
            }
        }
        return temp;
    }


}
