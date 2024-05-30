package pizza.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


class OrderDataControllerTest {

    private OrderDataController controller;

    @Test
    public void testGetName() {
        assertEquals("Teszt Elek", controller.getName());
    }

    @Test
    public void testGetAddress() {
        assertEquals("4028 Debecen Kassai út 26", controller.getAddress());
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("06101234567", controller.getPhoneNumber());
    }

    @Test
    public void testGetPaymentMethod_Cash() {
        assertEquals("Készpénz", controller.getPaymentMethod());
    }

    @Test
    public void testGetPaymentMethod_OnlinePayment() {
        assertEquals("Online bankkártya", controller.getPaymentMethod());
    }
}