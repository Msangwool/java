package mid1.exception.basic.unchecked;

public class Client {

    public void call() {
        // 문제 상황
        MyUncheckedException ex = new MyUncheckedException("ex");
        throw ex;
    }
}
