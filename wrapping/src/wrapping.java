import java.lang.Integer;
import java.lang.Float;
import java.lang.Character;
import java.lang.Byte;

public class wrapping {
    public static void main(String[] args) {
        int a = 23;
        Integer b = a;
        int c = b;
        float d = 23.4f;
        Float j = d;
        float x = j;
        byte m = 10;
        Byte mB = m;
        byte u = mB;
        char q = 'a';
        Character qc = q;
        char jq = qc;

        System.out.println(c);
        System.out.println(x);
        System.out.println(u);
        System.out.println(jq);
    }
}
