class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == sCount[i]) matches++;
        }
        for (int i = 0; i < s.length() - p.length(); i++) {
            if (matches == 26) result.add(i);
            int left = s.charAt(i) - 'a';
            int right = s.charAt(i + p.length()) - 'a';
            sCount[right]++;
            if (sCount[right] == pCount[right]) matches++;
            else if (sCount[right] == pCount[right] + 1) matches--;
            sCount[left]--;
            if (sCount[left] == pCount[left]) matches++;
            else if (sCount[left] == pCount[left] - 1) matches--;
        }
        if (matches == 26) result.add(s.length() - p.length());
        return result;
    }
}