class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> freq = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;

        if (s.isEmpty() || t.isEmpty())
            return "";

        for (char w : t.toCharArray()) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        int need = freq.size();

        int have = 0;

        int start = 0;

        int minLength = Integer.MAX_VALUE;

        System.out.println("s length: " + s.length());
        System.out.println("t length: " + t.length());

        while (right < s.length()) {
            if (freq.containsKey(s.charAt(right))) {
                window.put(s.charAt(right), window.getOrDefault(s.charAt(right), 0) + 1);
                if (freq.get(s.charAt(right)).intValue()
                    == window.get(s.charAt(right)).intValue()) {
                    have++;
                }
            }

            while (need == have) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                if (freq.containsKey(s.charAt(left))) {
                    if (freq.get(s.charAt(left)).intValue()
                        == window.get(s.charAt(left)).intValue()) {
                        have--;
                    }

                    window.put(s.charAt(left), window.get(s.charAt(left)) - 1);
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLength);
    }
}
