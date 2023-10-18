class Solution {
    public int countPoints(String rings) {
     int rods[] = new int[10];
        for(int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = Character.getNumericValue(rings.charAt(i + 1));
            switch(color) {
                case 'R' :
                    rods[rod] |= 1;
                    break;
                case 'G' :
                    rods[rod] |= 2;
                    break;
                case 'B' :
                    rods[rod] |= 4;
                    break;
            }
        }
        int count = 0;
        for(int rod : rods) {
            if(rod == 7) {
                count++;
            }
        }
        return count;   
    }
}