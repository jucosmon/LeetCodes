class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            char next = (i + 1 < s.length()) ? s.charAt(i + 1) : ' ';

            switch (current) {
                case 'I':
                    if (next == 'V' || next == 'X') {
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (next == 'L' || next == 'C') {
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (next == 'D' || next == 'M') {
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        return sum;
    }
}
