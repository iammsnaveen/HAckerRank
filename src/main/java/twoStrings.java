import java.util.HashSet;

public class twoStrings {
    public static void main(String[] args) {
        System.out.println(verifySubStrings("BAT","CAT"));
        System.out.println(verifySubStrings("Apple","Aeroplane"));
        System.out.println(verifySubStrings("INDIA","BLR"));
    }

    public static String verifySubStrings(String s1, String s2){
        HashSet<Character> hs1=new HashSet<>();
        HashSet<Character> hs2=new HashSet<>();

        for (Character cs1:s1.toCharArray()) {
               hs1.add(cs1);
       }

        for (Character cs1:s2.toCharArray()) {
            hs2.add(cs1);
        }
        hs1.retainAll(hs2);

        if(!(hs1.isEmpty()))
            return "YES";
        else
        return "NO";
    }
}
