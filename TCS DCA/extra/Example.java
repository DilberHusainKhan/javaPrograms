public class Example {
    public static void main(String[] args) {
        String word ="Java string Split method by Dilber husain";
        String[] s1 = word.split("\\s");
        for(String s: s1){
            System.out.println(s);
        }
    }
}
