/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class OrderDetailPOJO {
    private Integer orderDetailId;
    private Integer amount;
    private Float price;
    private OrderPOJO orders;
    private CommodityPOJO commodity;

    public OrderDetailPOJO() {
    }

    public OrderDetailPOJO(Integer orderDetailId, Integer amount, Float price, OrderPOJO orders, CommodityPOJO commodity) {
        this.orderDetailId = orderDetailId;
        this.amount = amount;
        this.price = price;
        this.orders = orders;
        this.commodity = commodity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public CommodityPOJO getCommodity() {
        return commodity;
    }

    public void setCommodity(CommodityPOJO commodity) {
        this.commodity = commodity;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public OrderPOJO getOrders() {
        return orders;
    }

    public void setOrders(OrderPOJO orders) {
        this.orders = orders;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
