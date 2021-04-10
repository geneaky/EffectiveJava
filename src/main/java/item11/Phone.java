package item11;

import java.util.Objects;

public class Phone {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
