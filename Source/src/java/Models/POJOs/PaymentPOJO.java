/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class PaymentPOJO {

    private Integer paymentId;
    private String deliveryAddress;
    private String cardNumber;
    private boolean status;
    private UserPOJO users;
    private OrderPOJO orders;
    private PaymentTypePOJO paymenttype;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public OrderPOJO getOrders() {
        return orders;
    }

    public void setOrders(OrderPOJO orders) {
        this.orders = orders;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public PaymentTypePOJO getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(PaymentTypePOJO paymenttype) {
        this.paymenttype = paymenttype;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public UserPOJO getUsers() {
        return users;
    }

    public void setUsers(UserPOJO users) {
        this.users = users;
    }

    public PaymentPOJO() {
    }

    public PaymentPOJO(Integer paymentId, String deliveryAddress, String cardNumber, boolean status, UserPOJO users, OrderPOJO orders, PaymentTypePOJO paymenttype) {
        this.paymentId = paymentId;
        this.deliveryAddress = deliveryAddress;
        this.cardNumber = cardNumber;
        this.status = status;
        this.users = users;
        this.orders = orders;
        this.paymenttype = paymenttype;
    }
}
