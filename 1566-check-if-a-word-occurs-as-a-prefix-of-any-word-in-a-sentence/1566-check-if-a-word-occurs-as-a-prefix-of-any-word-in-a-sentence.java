class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int index = 1;
        int idx = -1;
        for (String str : arr) {
            if (str.startsWith(searchWord)) {
                return index;
            }

            index++;
        }
        return -1;
    }
}