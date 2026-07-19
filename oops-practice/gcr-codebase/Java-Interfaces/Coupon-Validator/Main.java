public class Main {
    public static void main(String[] args) {

        String[] coupons = {
            "Save123",
            "Hii123",
            "HSA@%",
            "SAVE6789",
            "tyhtij1234"
        };

        ICouponValidator validator = new ShoppingCart();

        for (String coupon : coupons) {
            if (validator.couponValidator(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}