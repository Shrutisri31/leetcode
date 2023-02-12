class Solution {
    public int minDeletionSize(String[] strs) {
    if (strs == null || strs.length == 0) {
        return 0;
    }
    int col = strs[0].length();
    int delCol = 0;
    for (int i = 0; i < col; i++) {
        char currChar = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) < currChar) {
                delCol++;
                break;
            }
            currChar = strs[j].charAt(i);
        }
    }
    return delCol;
    }
}