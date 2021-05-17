package item38;

public class Main {
    public static void main(String[] args) {
        test(BasicOpertion.class,3.4,4.5);
    }

    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y){
        for(Operation op: opEnumType.getEnumConstants()){
            System.out.println(op+" " + op.apply(x,y));
        }
    }
}
