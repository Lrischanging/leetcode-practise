import java.util.Arrays;

// (N)Z字形变换
public class six {
    public static String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int curRow = 0;
        boolean isDown = false;
        int len = Math.min(s.length(), numRows);
        String[] newArray = new String[len];
        Arrays.fill(newArray, "");

        for(int i=0; i<s.length(); i++) {
            newArray[curRow] += s.substring(i, i+1);
            if(curRow == 0 || curRow == numRows - 1) {
                isDown = !isDown;
            }
            curRow += isDown ? 1: -1;
        }

        String result = "";
        for(String row: newArray) {
            result += row;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String res = convert(s, numRows);
        System.out.println(res);
    }
}
