package item11;

import java.util.Objects;

public class Phone2 {
    private String name;

    public Phone2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone2 phone2 = (Phone2) o;
        return Objects.equals(name, phone2.name);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(name);
        return 42;
    }
}
