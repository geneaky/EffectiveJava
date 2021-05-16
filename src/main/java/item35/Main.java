package item35;

public class Main {
    public static void main(String[] args) {
        Ensemble1 ens1 = Ensemble1.SOLO;
        int i1 = ens1.numberOfMusicians(); // 1이 나와야함
        if(i1==1) System.out.println("true"); //Ensemble1을 수정하면 실행이 안됨


        Ensemble2 ens2 = Ensemble2.SOLO;
        int i2 = ens2.getNumberOfMusicians();
        System.out.println(i2);
    }
}
