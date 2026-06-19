import java.util.*;
class LongesSubstringWithAtMostTwoDistinctChar{
    public static void main(String[] args) {
        String s="ccaabbb";
        HashMap<Character,Integer> hm=new HashMap<>();
        int maxLen=0;
        
        int l=0;
        for(int r=0;r<s.length();r++){
            char a=s.charAt(r);
            hm.put(a,hm.getOrDefault(a,0)+1);
              
                while(hm.size()>2){
                    char x=s.charAt(l);
                    hm.put(x,hm.get(x)-1);
                    if(hm.get(x)==0){
                        hm.remove(x);
                    }
                    l++;
                }
            
              maxLen=Math.max(maxLen,r-l+1);
            
            
        }
        System.out.println(maxLen);
    }
}
