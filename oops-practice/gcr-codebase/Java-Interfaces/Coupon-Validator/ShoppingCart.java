class ShoppingCart implements ICouponValidator {

    @Override
    public boolean couponValidator(String code) {
        return ICouponValidator.isLength(code) &&
               code.toUpperCase().startsWith("SAVE");
    }
}