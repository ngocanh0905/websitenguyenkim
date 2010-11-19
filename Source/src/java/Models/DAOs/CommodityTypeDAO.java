/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.DAOs;

import Models.DAOs.Util.MySqlDataAccessHelper;
import Models.POJOs.CommodityTypePOJO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

import java.util.ArrayList;

/**
 *
 * @author tannguyen
 */
public class CommodityTypeDAO {
    public static ArrayList<CommodityTypePOJO> getCommodityTypeAll() throws Exception{
        ArrayList<CommodityTypePOJO> result = new ArrayList<CommodityTypePOJO>();
        Connection connect = null;
        try{
            connect = MySqlDataAccessHelper.getConnection();
            CallableStatement statement = connect.prepareCall("{Call sp_GetCommodityTypeAll()}");
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                CommodityTypePOJO ct = new CommodityTypePOJO();
                ct.setCommodityTypeId(rs.getInt("commodityTypeId"));
                ct.setCommodityTypeName(rs.getString("commodityTypeName"));
                ct.setDescription(rs.getString(rs.getString("description")));
                result.add(ct);
            }
            connect.close();
        }catch(Exception ex){
            throw ex;
        }
        return result;
    }
}
