/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.DAOs;

import Models.DAOs.Util.MySqlDataAccessHelper;
import Models.POJOs.RolePOJO;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author tannguyen
 */
public class RoleDAO {
    public static RolePOJO getRoleById(int id) throws Exception{
        RolePOJO result = null;
        Connection connect = null;
        try {
            connect = (Connection) MySqlDataAccessHelper.getConnection();
            PreparedStatement statement = (PreparedStatement) connect.prepareStatement("{Call sp_GetRoleById(?)}");
            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                result = new RolePOJO();
                result.setRoleId(id);
                result.setRoleName(rs.getString("roleName"));
                result.setRoleDescription(rs.getString("roleDescription"));
            }

            statement.close();
            connect.close();

        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

}
