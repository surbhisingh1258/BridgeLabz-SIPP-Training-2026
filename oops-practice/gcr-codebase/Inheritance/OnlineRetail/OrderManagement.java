public class OrderManagement {
    public static void main(String[] args) {

        System.out.println("=== Order ===");
        Order order = new Order(101, "24-06-2026");
        order.displayOrder();

        System.out.println("\n=== Shipped Order ===");
        ShippedOrder shipped = new ShippedOrder(102, "23-06-2026", "TRK12345");
        shipped.displayOrder();

        System.out.println("\n=== Delivered Order ===");
        DeliveredOrder delivered = new DeliveredOrder(103, "20-06-2026", "TRK67890", "24-06-2026");
        delivered.displayOrder();
    }
}