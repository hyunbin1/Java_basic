/* 추상 클래스(abstract class)
    1. 미완성 설계도(미완성 메서드)를 갖고 있는 클래스
    2. 다른 클래스 작성에 도움을 주기 위한 것이다. => 인스턴스 생성불가
    3. 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능
    4. 자손 각각의 여러 객체들에게 필수적인 요소를 첨가할 강제성을 부여해준다.

    사용시기: 꼭 필요하지만 자손마다 다르게 구현될 것으로 예상되는 경우 추상 클래스를 사용한다.
 */

abstract class Player{
    // {}몸통이 없는 미완성 메서드 == 추상 메서드
    abstract void play(int pos);
    abstract void stop();
}


class AudioPlayer extends Player {
    // 추상메서드를 구현 - 객체(인스턴스) 생성 가능
    void play(int pos) {/* 내용생략 */}
    void stop() {/*내용 생략 */}

    // 인스턴스 생성 ok
    AudioPlayer ap = new AudioPlayer();
    }

// 추상화된 Player에서 생성된 모든 요소를 사용하지 않고 일부만 사용한다면 앞에 abstract를 써야된다.
abstract class AbstractPlayer extends Player{
    void play(int pos){/* 내용 */}
}


