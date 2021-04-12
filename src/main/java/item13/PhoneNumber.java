package item13;

 public class PhoneNumber extends Phone implements Cloneable{
    private String phoneNumber;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (PhoneNumber)super.clone();
    }

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
