public class lastmatch {
    public static void main(String[] args) {
        String s1="abdabcghabc";
        String s2="abc";
        int index = s1.lastIndexOf(s2);
        System.out.println((index == -1) ? index : index + 1);
    }
}

