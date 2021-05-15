package item34;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

//상수별 메서드 구현
public enum Operation {
    PLUS("+") {public double apply(double x,double y){return x+y;}},
    MINUS("-") {public double apply(double x,double y){return x-y;}};

    private final String symbol;

    Operation(String symbol) {this.symbol = symbol;}
    public abstract double apply(double x,double y);

    private static final Map<String,Operation> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString,e->e)
            );

    public static Optional<Operation> fromString(String symbol){
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
