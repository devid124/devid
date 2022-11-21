public class almost {
    public static void main(String[] args) {
        String s1="devid";
        String s2="devide";
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            a[c - 'a']++;
        }
        for(int i=0;i<s2.length();i++)
        {
            char c = s2.charAt(i);
            b[c - 'a']++;
        }
        int cnt = 0;
        for(int i=0;i<26;i++)
        {
            cnt += Math.abs(a[i] - b[i]);
        }
       System.out.println(cnt);
    }
}
