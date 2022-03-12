package sorting;

public class TwoString {

    public static void main(String[] args) {

        System.out.println(twostring("abcdefghijklmnopqrstuvwxyz","zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));

    }

    public static boolean twostring(String s1, String s2) {
char[] charS1= s1.toCharArray();
char[] charS2= s2.toCharArray();
for(int i=0;i<charS1.length;i++){
    System.out.println("Iteration ---> i  "+i);
    for(int j=0;j<charS2.length;j++){
        System.out.println("Iteration --->j  "+j);
        if(charS1[i]==charS2[j]){

            return true;
        }
    }
}

        return false;
    }
}
