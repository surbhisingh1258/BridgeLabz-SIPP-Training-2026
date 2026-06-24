class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayOrder() {
        super.displayOrder();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}