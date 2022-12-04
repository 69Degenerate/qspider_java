package condition.switch_prog;

public class s1 {
    public static void main(String[] args) {
        int a=1;
        switch (a%2) {
            case 0:
                System.out.println("even");
                break;
        case 1:
            System.out.println("odd");
            break;
            default:
            System.out.println("");
                break;
        }
    }
}
