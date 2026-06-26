interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {
        // Coupon is valid if length >= 5 and starts with "SAVE"
        return CouponValidator.isLengthValid(code) && code.startsWith("SAVE");
    }
}

public class Ecommerce {
    public static void main(String[] args) {

        String[] coupons = {"SAVE10", "OFF20", "SAVE", "SAVE50", "DISCOUNT"};

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}