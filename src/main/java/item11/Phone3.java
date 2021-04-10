package item11;

public class Phone3 {
    private static Phone3 phone3 = null;

    private Phone3() {}

    public static Phone3 getInstance(){
        if(phone3==null){
            phone3 = new Phone3();
        }
        return phone3;
    }



}
