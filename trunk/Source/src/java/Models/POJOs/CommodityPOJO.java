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

    public int getAmountExisting() {
        return amountExisting;
    }

    public void setAmountExisting(int amountExisting) {
        this.amountExisting = amountExisting;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public CommodityTypePOJO getCommoditytype() {
        return commoditytype;
    }

    public void setCommoditytype(CommodityTypePOJO commoditytype) {
        this.commoditytype = commoditytype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public ManufacturerPOJO getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerPOJO manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    
}
