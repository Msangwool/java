package mid1.exception.basic.check;

public class Client {

    public void call() throws MyCheckedException { // 밖으로 던질 것이라는 뜻
        // 문제 상황
        MyCheckedException ex = new MyCheckedException("ex");
        throw ex;
    }
}
