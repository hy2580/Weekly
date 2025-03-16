public class Cart {
    Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalDelivery = 0;

        for (Product product : products) {
            int deliveryCharge;

            if (product.weight < 3) {
                deliveryCharge = 1000;
            } else if (product.weight < 10) {
                deliveryCharge = 5000;
            } else {
                deliveryCharge = 10000;
            }

            int totalPrice = product.price + deliveryCharge;

            if (totalPrice >= 100000) {
                deliveryCharge = 0;
            } else if (totalPrice >= 30000) {
                deliveryCharge -= 1000;
            }

            totalDelivery += deliveryCharge;
        }

        return totalDelivery;
    }
}
