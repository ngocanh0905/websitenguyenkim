/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAOs;

import Models.DAOs.Util.MySqlDataAccessHelper;
import Models.POJOs.ManufacturerPOJO;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author tannguyen
 */
public class ManufacturerDAO {

    public static ArrayList<ManufacturerPOJO> getManufacturerAll() throws Exception{
        ArrayList<ManufacturerPOJO> result = new ArrayList<ManufacturerPOJO>();
        Connection connect = null;
        try{
            connect = MySqlDataAccessHelper.getConnection();
            CallableStatement statement = connect.prepareCall("{Call sp_getManufacturerAll()}");
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                ManufacturerPOJO m = new ManufacturerPOJO();
                m.setManufacturerId(rs.getInt("manufacturerId"));
                m.setManufacturerName(rs.getString("manufacturerName"));
                m.setCountry(rs.getString("country"));
                result.add(m);
            }
            connect.close();
        }catch(Exception ex){
            throw ex;
        }
        return result;
    }
}
