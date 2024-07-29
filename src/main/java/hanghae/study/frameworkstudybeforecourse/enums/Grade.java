package hanghae.study.frameworkstudybeforecourse.enums;

public enum Grade {
    GOLD(15),
    SILVER(10),
    BRONZE(5),
    UNKNOWN(0);

    private int discountRate;

    Grade(int discountRate) {
        this.discountRate = discountRate;
    }
}
