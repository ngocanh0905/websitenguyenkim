/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class CommodityPOJO {
 private Integer commodityId;
    private String commodityName;
    private float unitPrice;
    private String description;
    private String imgUrl;
    private String feature;
    private int amountExisting;
    private int warranty;
    private ManufacturerPOJO manufacturer;
    private CommodityTypePOJO commoditytype;

    public CommodityPOJO() {
    }

    public CommodityPOJO(Integer commodityId, String commodityName, float unitPrice, String description, String imgUrl, String feature, int amountExisting, int warranty, ManufacturerPOJO manufacturer, CommodityTypePOJO commoditytype) {
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.unitPrice = unitPrice;
        this.description = description;
        this.imgUrl = imgUrl;
        this.feature = feature;
        this.amountExisting = amountExisting;
        this.warranty = warranty;
        this.manufacturer = manufacturer;
        this.commoditytype = commoditytype;
    }

    @Override
    public String toString() {
        return commodityName;
    }

    
}
