/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class ManufacturerPOJO {

    private Integer manufacturerId;
    private String manufacturerName;
    private String country;

    public ManufacturerPOJO() {
    }

    public ManufacturerPOJO(Integer manufacturerId, String manufacturerName, String country) {
        this.manufacturerId = manufacturerId;
        this.manufacturerName = manufacturerName;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    @Override
    public String toString(){
        return manufacturerName;
    }
}
