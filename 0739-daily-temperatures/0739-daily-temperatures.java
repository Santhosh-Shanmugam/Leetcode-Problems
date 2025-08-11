class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> st = new Stack<>();
        int[] dis = new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            while(!st.isEmpty() && t[st.peek()] < t[i])
            {    
                dis[st.peek()] = i-st.pop();
            }
            st.push(i);
        }
        return dis;
    }
}