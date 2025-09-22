package mid1.exception.basic.unchecked;

/**
 * Unchecked 예외는
 * 예외를 잡거나 던지지 않아도 됨
 * 자동으로 밖으로 던짐
 */
public class Service {

    Client client = new Client();

    /**
     * 필요한 경우 예외를 잡아서 처리할 수 있음
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /**
     * 예외를 잡지 않아도 됨, 자동으로 상위로 넘겨주게 된다.
     * 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
     */
    public void catchThrows() {
        client.call();
    }
}
