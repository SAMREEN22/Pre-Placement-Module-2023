class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        List<List<Integer>> nm=new ArrayList<List<Integer>>();
        Arrays.sort(n);
        int k=n.length;
        for(int i=0;i<k-2;i++)
        {
            if(i==0||(i>0&&n[i]!=n[i-1]))
            {
                int l=i+1,h=k-1,s=0-n[i];
                while(l<h)
                {
                    if(n[l]+n[h]==s)
                    {
                        nm.add(Arrays.asList(n[i],n[l],n[h]));
                        while(l<h&&n[l]==n[l+1])
                        {
                            l++;
                        }
                        while(l<h&&n[h]==n[h-1])
                        {
                            h--;
                        }
                        l++;
                        h--;
                    }
                    else if(n[l]+n[h]<s)
                    {
                        l++;
                    }
                    else
                    {
                        h--;
                    }
                }
            }
        }
        return nm;
    }
}
