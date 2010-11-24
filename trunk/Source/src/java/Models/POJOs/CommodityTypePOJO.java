/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class CommodityTypePOJO {

    private Integer commodityTypeId;
    private String commodityTypeName;
    private String description;

    public CommodityTypePOJO() {
    }

    public CommodityTypePOJO(Integer commodityTypeId, String commodityTypeName, String description) {
        this.commodityTypeId = commodityTypeId;
        this.commodityTypeName = commodityTypeName;
        this.description = description;
    }

    @Override
    public String toString(){
        return commodityTypeName;
    }


    public Integer getCommodityTypeId() {
        return commodityTypeId;
    }

    public void setCommodityTypeId(Integer commodityTypeId) {
        this.commodityTypeId = commodityTypeId;
    }

    public String getCommodityTypeName() {
        return commodityTypeName;
    }

    public void setCommodityTypeName(String commodityTypeName) {
        this.commodityTypeName = commodityTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
