/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class PaymentTypePOJO {
    private Integer paymentTypeId;
    private String paymentTypeName;
    private String description;

    public PaymentTypePOJO(Integer paymentTypeId, String paymentTypeName, String description) {
        this.paymentTypeId = paymentTypeId;
        this.paymentTypeName = paymentTypeName;
        this.description = description;
    }

    public PaymentTypePOJO() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getPaymentTypeName() {
        return paymentTypeName;
    }

    public void setPaymentTypeName(String paymentTypeName) {
        this.paymentTypeName = paymentTypeName;
    }
}
