/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAOs;

import Models.DAOs.Util.MySqlDataAccessHelper;
import Models.POJOs.RolePOJO;
import Models.POJOs.UserPOJO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author tannguyen
 */
public class UserDAO {

    public static boolean addUser(UserPOJO usr) throws Exception {
        boolean result = false;
        Connection connect = null;
        try {
            connect = MySqlDataAccessHelper.getConnection();
            PreparedStatement statement = (PreparedStatement) connect.prepareStatement("{Call sp_AddUser(?,?,?,?,?,?,?,?,?)}");
            statement.setString(1, usr.getFullname());
            statement.setString(2, usr.getAddress());
            statement.setBoolean(3, usr.getGender());
            statement.setDate(4, (Date) usr.getDateOfBirth());
            statement.setString(5, usr.getCellphone());
            statement.setString(6, usr.getEmail());
            statement.setString(7, usr.getUsername());
            statement.setString(8, usr.getPassword());
            statement.setInt(9, usr.getRole().getRoleId());

            int n = statement.executeUpdate();

            if (n != 0) {
                result = true;
            }

            statement.close();
            connect.close();

        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }

    public static UserPOJO getUserByUserPass(String user, String pass) throws Exception {
        UserPOJO result = null;
        Connection connect = null;
        try {
            connect = MySqlDataAccessHelper.getConnection();
            PreparedStatement statement = (PreparedStatement) connect.prepareStatement("{Call sp_GetUserByUserPass(?,?)}");
            statement.setString(1, user);
            statement.setString(2, pass);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                result = new UserPOJO();
                result.setUserId(rs.getInt("userId"));
                result.setUsername(rs.getString("username"));
                result.setFullname(rs.getString("fullname"));
                result.setAddress(rs.getString("address"));
                result.setCellphone(rs.getString("cellphone"));
                result.setDateOfBirth(rs.getDate("dateOfBirth"));
                result.setEmail(rs.getString("email"));
                RolePOJO role = RoleDAO.getRoleById(rs.getInt("role"));
                result.setRole(role);
            }

            statement.close();
            connect.close();

        } catch (Exception ex) {
            throw ex;
        }
        return result;
    }
}
