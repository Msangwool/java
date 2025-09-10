package mid1.exception.basic.check;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrows();
        System.out.println("정상 종료");
    }
}
