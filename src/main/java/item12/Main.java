package item12;

public class Main {
    public static void main(String[] args) {
        AreaCode areaCode = new AreaCode("서울","02");
        System.out.println("areaCode = " + areaCode);
        //객체의 물리주소값을 반환하면 디버깅이나 테스트 혹은 이 객체가 쓰이는 다른곳에서 오류메세지 등으로 파악하기 어렵다.

        AreaCode2 areaCode2 = new AreaCode2("경기","031");
        System.out.println("areaCode2 = " + areaCode2);
        //toString의 좋은예 왠만하면 그냥 ide에서 제공하는 기능으로 재정의하면됨(객체의 주요 정보 모두 반환해주기때문에)


        AreaCode3 areaCode3 = new AreaCode3("대구","053");
        System.out.println("areaCode3 = " + areaCode3);
        //만약 해당 클래스의 필드에 컬렉션이나 기타 표기해야할 정보가 많을경우 자체적으로 포매팅 형식을 취해서 표기해주는 것이 좋다.
    }
}
