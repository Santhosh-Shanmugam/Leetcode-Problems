class Solution {
    public boolean isCheckLetter(char c)
    {
        if(Character.isLetter(c)) return true;
        else return false;
    }
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j)
        {
            if(isCheckLetter(arr[i]) && isCheckLetter(arr[j]))
            {
                char c = arr[i];
                arr[i] = arr[j];
                arr[j] = c;
                i++;
                j--;
            }
            else if(!isCheckLetter(arr[i])){
                i++;
            }
            else{
                j--;
            }
        }

        return new String(arr);
    }
}