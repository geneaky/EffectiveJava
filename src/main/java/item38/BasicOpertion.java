package item38;
//열거 타입끼리는 extends implements가 안되지만 interface는 구현이 가능하므로 interface를 이용하여 열거타입을 확장한다.
public enum BasicOpertion implements Operation{
    PLUS("+"){
        public double apply(double x, double y){return x+y;}
    },
    MINUS("-"){
        public double apply(double x, double y){return x-y;}
    };

    private final String symbol;

    BasicOpertion(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
