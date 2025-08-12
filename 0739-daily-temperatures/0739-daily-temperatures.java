class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i])
            {
                int ind = st.pop();
                temp[ind] = i - ind;
            }
            st.push(i);
        }
        return temp;
    }
}