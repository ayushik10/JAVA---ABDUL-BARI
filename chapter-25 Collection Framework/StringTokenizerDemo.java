import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        
        String data = " Name = Ayushi\n Address = SK nagar, Motihari\n Country = India\n Dept. = BCA";

        StringTokenizer st = new StringTokenizer(data, "=");
        String s;

        while(st.hasMoreTokens()) {
            s = st.nextToken();
            System.out.println(s);
        }
    }
}
