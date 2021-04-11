package item12;

public class AreaCode3 {
    private String name;
    private String code;

    public AreaCode3(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("%10s",code);
    }
}
