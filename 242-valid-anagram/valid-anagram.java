class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> strMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            strMap.put(c, strMap.getOrDefault(c, 0) + 1);

        }
        for (char c : t.toCharArray()) {
            if (!strMap.containsKey(c) || strMap.get(c) == 0) return false;
        strMap.put(c, strMap.get(c) - 1);
        }

        return true;

    }
}