class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<>();
        for(String s: strs){
            int[] count=new int[26];
            char[] word=s.toCharArray();
            for(char ch: word){
                count[ch-'a']++;
            }
            String num=Arrays.toString(count);
            mp.putIfAbsent(num, new ArrayList<>());
            mp.get(num).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
