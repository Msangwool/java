package mid2.generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print: " + obj);
        return obj;
    }

    // 특정 메서드 안에서 제네릭 사용 가능
    public static <T> T genericMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t) {
        System.out.println("Object print: " + t);
        return t;
    }
}
