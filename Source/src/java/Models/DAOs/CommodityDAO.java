/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.DAOs;

import Models.DAOs.Util.MySqlDataAccessHelper;
import Models.POJOs.CommodityPOJO;
import Models.POJOs.ManufacturerPOJO;
import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tannguyen
 */
public class CommodityDAO {

    public static ArrayList<CommodityPOJO> getProductByCt(int id) throws Exception{
        ArrayList<CommodityPOJO> result = new ArrayList<CommodityPOJO>();
        Connection connect = null;
        try{
            connect = (Connection) MySqlDataAccessHelper.getConnection();
            CallableStatement statement = (CallableStatement) connect.prepareCall("{Call sp_CommodityByCommodityTypeId(?)}");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                CommodityPOJO m = new CommodityPOJO();
                m.setAmountExisting(rs.getInt("amountExisting"));
                m.setCommodityId(rs.getInt("commodityId"));
                m.setCommodityName(rs.getString("commodityName"));
                m.setDescription(rs.getString("description"));
                m.setFeature(rs.getString("feature"));
                m.setImgUrl(rs.getString("imgUrl"));
                ManufacturerPOJO man = ManufacturerDAO.getManufacturerById(rs.getInt("manufacturer"));
                m.setManufacturer(man);
                m.setUnitPrice(rs.getFloat("unitPrice"));
                m.setWarranty(rs.getInt("warranty"));
                
                result.add(m);
            }
            connect.close();
            statement.close();
        }catch(Exception ex){
            throw ex;
        }
        return result;
    }

    public static ArrayList<CommodityPOJO> getProductByCM(int ctId,int mId) throws Exception{
        ArrayList<CommodityPOJO> result = new ArrayList<CommodityPOJO>();
        Connection connect = null;
        try{
            connect = (Connection) MySqlDataAccessHelper.getConnection();
            CallableStatement statement = (CallableStatement) connect.prepareCall("{Call sp_GetCommodityByCM(?,?)}");
            statement.setInt(1, ctId);
            statement.setInt(2, mId);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                CommodityPOJO m = new CommodityPOJO();
                m.setAmountExisting(rs.getInt("amountExisting"));
                m.setCommodityId(rs.getInt("commodityId"));
                m.setCommodityName(rs.getString("commodityName"));
                m.setDescription(rs.getString("description"));
                m.setFeature(rs.getString("feature"));
                m.setImgUrl(rs.getString("imgUrl"));
                ManufacturerPOJO man = ManufacturerDAO.getManufacturerById(rs.getInt("manufacturer"));
                m.setManufacturer(man);
                m.setUnitPrice(rs.getFloat("unitPrice"));
                m.setWarranty(rs.getInt("warranty"));

                result.add(m);
            }
            connect.close();
            statement.close();
        }catch(Exception ex){
            throw ex;
        }
        return result;
    }

     public static CommodityPOJO getProductById(int id) throws Exception{
        CommodityPOJO m = new CommodityPOJO();
        Connection connect = null;
        try{
            connect = (Connection) MySqlDataAccessHelper.getConnection();
            CallableStatement statement = (CallableStatement) connect.prepareCall("{Call sp_GetCommodityById(?)}");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            if(rs.next()){
                m.setAmountExisting(rs.getInt("amountExisting"));
                m.setCommodityId(rs.getInt("commodityId"));
                m.setCommodityName(rs.getString("commodityName"));
                m.setDescription(rs.getString("description"));
                m.setFeature(rs.getString("feature"));
                m.setImgUrl(rs.getString("imgUrl"));
                ManufacturerPOJO man = ManufacturerDAO.getManufacturerById(rs.getInt("manufacturer"));
                m.setManufacturer(man);
                m.setUnitPrice(rs.getFloat("unitPrice"));
                m.setWarranty(rs.getInt("warranty"));

            }
            connect.close();
            statement.close();
        }catch(Exception ex){
            throw ex;
        }
        return m;
    }
}
