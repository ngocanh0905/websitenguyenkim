/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.POJOs;

import java.util.Date;

/**
 *
 * @author tannguyen
 */
public class OrderPOJO {
    private Integer orderId;
    private Date orderDate;
    private Boolean status;
    private UserPOJO users;

    public OrderPOJO() {
    }


    public OrderPOJO(Integer orderId, Date orderDate, Boolean status, UserPOJO users) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.users = users;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserPOJO getUsers() {
        return users;
    }

    public void setUsers(UserPOJO users) {
        this.users = users;
    }


}
