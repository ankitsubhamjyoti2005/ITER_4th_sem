public class string_io {
    // public static void main(String[] args) {
    //     String a = "abcd";
    //     String b = "efgh";
    //     String c = "ijkl";
    //     String d = "mnop";
    //     System.out.println(a.concat(b).concat(c).concat(d));

    //     String s1 = "Hello", s2 = "";
    //     String s3 = s1.concat(s2);
    //     System.out.println("Case 1--concat");
    //     if (s1 == s3)
    //         System.out.println("Both are same");
    //     else
    //         System.out.println("not same");
    //     System.out.println("Case 2--+");
    //     String s4 = s1 + 52;
    //     if (s1 == s4)
    //         System.out.println("Both are same");
    //     else
    //         System.out.println("not same");
    // }

    //dt:28/03/2024
    public static void main(String[] args) {
        String a = "iter:A ";
        String[] b = a.split(":");
        for(String i : b){
            System.out.println(i);
        }

        // String myString = "it@is@my@string@word1@word2:eq]hkgh";
        // String[] piece = myString.split("[, ?@:.]+");
        // for(String i : piece){
        //     System.out.println(i);
        // }

        String myString = "it@is@my@string@word1@word2@@@@@@";
        String[] piece = myString.split("@",0);
        for(String i : piece){
            System.out.println(i);
        }
    }
}
