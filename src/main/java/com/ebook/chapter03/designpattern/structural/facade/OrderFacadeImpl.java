package com.ebook.chapter03.designpattern.structural.facade;

/*****
 * @Author zean
 * Created at 2018/4/19
 * @Email zxc200706@hotmail.com
 *
 ****/

public class OrderFacadeImpl implements OrderFacade {

    @Override
    public void placeOrder(Order order) {
        if(order == null){
            return;
        }

        InventoryService inventoryService = new InventoryService();
        if(inventoryService.isProductAvailable(order.getProductId())){
            System.err.println("the product is available for order.");
        }else{
            return;
        }

        OrderService orderService = new OrderService();
        orderService.saveOrder(order);

        PaymentService paymentService = new PaymentService();
        if(paymentService.payOrder(order)){
            System.err.println("the payment finished.");
        }else{
            return;
        }

        ShippingService shippingService = new ShippingService();
        shippingService.shipOrder(order);
    }
}
