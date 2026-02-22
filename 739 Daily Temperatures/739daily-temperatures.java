class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];

        int[] stack = new int[n]; // stack of indices
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top != -1 && temperatures[i] > temperatures[stack[top]]) {
                int prev = stack[top--];
                ans[prev] = i - prev;
            }
            stack[++top] = i;
        }
        return ans;
    }
}