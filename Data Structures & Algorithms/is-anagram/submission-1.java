class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<String, Integer> freq=new HashMap<>();
        String[] one=s.split("");
        String[] two=t.split("");
        for(int i=0; i<one.length; i++){
            freq.put(one[i], freq.getOrDefault(one[i],0)+1);
        }
        for(int i=0; i<two.length; i++){
            if(freq.containsKey(two[i])){
                freq.put(two[i], freq.get(two[i])-1);
                if(freq.get(two[i])==0) freq.remove(two[i]);
            }
            else return false;
        }
        if(freq.size()!=0) return false;
        return true;
    }
}
