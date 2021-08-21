package comp.science.ds.array;

public class AllPermutation {

    public static void main(String[] args) {

        fnPermutation("","abc");
    }

    private static void fnPermutation(String perm, String word){

        System.out.println("in1:"+perm);
        System.out.println("in2:"+word);

        if(word.isEmpty())
            System.out.println(perm+word);

        for(int i=0;i<word.length();i++){
          //  System.out.println("Val1:"+word.substring(0,i));
           // System.out.println("Val2:"+word.substring(i+1,word.length()));

            fnPermutation(perm+word.charAt(i),word.substring(0,i)+word.substring(i+1,word.length()));
        }
    }
}
