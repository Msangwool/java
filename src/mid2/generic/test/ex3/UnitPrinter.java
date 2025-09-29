package mid2.generic.test.ex3;

import mid2.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle) {
        T t = shuttle.out();
        System.out.println("이름 : " + t.getName() + " HP : " + t.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle) {
        BioUnit bioUnit = shuttle.out();
        System.out.println("이름 : " + bioUnit.getName() + " HP : " + bioUnit.getHp());
    }
}
