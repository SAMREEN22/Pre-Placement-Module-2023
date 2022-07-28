class Solution {
    public int longestPalindrome(String str) {
       if(str.length()==1)return 1;
        int n=str.length();
        char[] ch=str.toCharArray();
         Arrays.sort(ch);
        str=String.valueOf(ch);
        char c=' ';
        int max=0;
        for(int i=0;i<n;i++){
           if(c==str.charAt(i)){
               continue;
           }
        int count=1;
            for( int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    c=str.charAt(i);
                }
            }
            if(count>1){
                if(count%2==0){
                max+=count;
            }else{
                    max+=count-1;
                }
            }
        }
        if(max<n){
            max+=1;
        }
          return max;
    }
}
