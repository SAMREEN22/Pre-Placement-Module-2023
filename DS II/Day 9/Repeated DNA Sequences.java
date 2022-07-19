public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    List<String> result=new ArrayList<String>();
    HashSet<String> set=new HashSet<String>();
    for(int i=0; i+10<=s.length(); i++)
    {
        String str=s.substring(i,i+10);
        if(set.contains(str))
        {
            if(!result.contains(str))
            {
                result.add(str);
                set.remove(str);
            }
        }
        else
        {
            set.add(str);
        }
    }
    return result;
    }
}
