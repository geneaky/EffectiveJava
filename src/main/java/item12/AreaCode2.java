package item12;

public class AreaCode2 {
    private String name;
    private String code;

    public AreaCode2(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "AreaCode2{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
