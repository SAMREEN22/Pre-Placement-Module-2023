class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s==null)
            return 0;
        int p1=0;
        int p2=p1;
        int max=0;
        String sub="";
        while(p1<s.length() && p2<s.length()){
            char c=s.charAt(p2);
            if(!sub.contains(Character.toString(c))){    
                sub=s.substring(p1,p2+1);
                p2++;
            }else{
                sub="";
                p1++;
                p2=p1;
            }
            max=Math.max(sub.length(),max); 
        }
         return max;
    }
}
