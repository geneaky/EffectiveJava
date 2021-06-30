package item50;

import java.util.Date;

public final class Period {
    private final Date start;
    private final Date end;

//    public Period(Date start, Date end) {
//        if(start.compareTo(end)>0) throw new IllegalArgumentException(start +"가 "+ end+"보다 늦다.");
//        this.start = start;
//        this.end = end;
//    }
    // 방어적 복사

//매개변수가 제3자에 의해 확잘될 수 있는 타입이라면 방어적 복사본을 만들 때 clone을 사용해서는 안된다.
    // 배열을 반환할 때는 무조건 방어적 복사를 수행해 반환해야한다 clone사용
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if(start.compareTo(end)>0) throw new IllegalArgumentException(start +"가 "+ end+"보다 늦다.");
    }

    //반환시 복사본을 반환
    public Date start(){
        return new Date(start.getTime());
    }

    public Date end(){
        return new Date(end.getTime());
    }
}
