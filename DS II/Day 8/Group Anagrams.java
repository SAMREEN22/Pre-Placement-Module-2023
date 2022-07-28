class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map=new HashMap<>();
        for(String s: strs){
            char[] sortedChar=s.toCharArray();
            Arrays.sort(sortedChar);
            String sorted=new String(sortedChar);
            if(map.containsKey(sorted))
                map.get(sorted).add(s);
            else {
                map.put(sorted, new ArrayList<>());
                map.get(sorted).add(s);
            }
        }
        List<List<String>> anagrams=new ArrayList<>();
        for(String key: map.keySet())
            anagrams.add(map.get(key));
        return anagrams;
    }
}
