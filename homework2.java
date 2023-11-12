
public class homework2 {
    public static void main(String[] args) {

        int numbers = 20;
        int n1 = 0;
        int n2 = 1;
        int n3;

        for(int i = 2; i <= numbers; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
        }
    }
}
