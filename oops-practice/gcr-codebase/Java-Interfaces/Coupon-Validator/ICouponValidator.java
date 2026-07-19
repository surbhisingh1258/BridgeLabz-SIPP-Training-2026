public interface ICouponValidator {

    boolean couponValidator(String code);

    static boolean isLength(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

