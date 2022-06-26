import java.util.HashMap;

// Roman to integer

public class HM13 {
    public static int roman(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int res = 0;
        char[] c = s.toCharArray();

        for(int i = 0; i < c.length; i++){
            int curVal = map.get(c[i]);

            if(i+1 < c.length && map.get(c[i+1]) > curVal){
                curVal = map.get(c[++i]) - curVal;
            }
            res += curVal;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(roman(s));
    }
}
