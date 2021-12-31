
class Solution {
    static String findMax(String N) {
        // code here
        
        char[] ch=N.toCharArray();
        Arrays.sort(ch);
        String s1=new String(ch);
        StringBuffer sbr = new StringBuffer(s1);
        sbr.reverse();
        return String.valueOf(sbr);
        
    }
}