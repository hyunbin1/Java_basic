/* 캡슐화의 접근 제어자
    접근 제어자를 사용하는 이유: 1 .외부로부터 데이터를 보호하기 위해서 == 캡슐화를 사용하는 이유이다.
    예를 들어 시간 객체인 경우 0~59가 정의되어야하는데 외부에서 초기화(ex 25)를 시키면 안되기 때문이다.
    => 접근 제어자를 private으로 하여 외부에서 직접 접근하는 것을 막는다.
        메서드를 통한 간접 접근은 허용한다.

    2. 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
    */


public class Capsule {
    private int hour;
    private int minute;
    private int second;
    
    public int getHour() {return hour; }
    public void setHour(int hour){
        if (isValidHour(hour)) return;
        this.hour = hour;
    }
    private boolean isValidHour(int hour){
        return hour < 0 || hour > 23;
    }
}

class TimeTest{
    public static void main(String[] args){
        Capsule time = new Capsule();
        time.setHour(21); // hour의 값을 21로 변경
        System.out.println(time.getHour());
    }
}