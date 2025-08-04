class Solution {
    public String smallestSubsequence(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a'] = i;
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a';
            if (visited[cur])
                continue;

            while (!st.isEmpty() && st.peek() > cur && i < arr[st.peek()])
                visited[st.pop()] = false;

            st.push(cur);
            visited[cur] = true;
        }

        StringBuilder str = new StringBuilder();
        while (!st.isEmpty()) {
            str.append((char) (st.pop() + 'a'));
        }
        return str.reverse().toString();
    }
}