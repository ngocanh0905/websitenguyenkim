/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Models.POJOs;

/**
 *
 * @author tannguyen
 */
public class RolePOJO {
    private Integer roleId;
    private String roleName;
    private String roleDescription;

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public RolePOJO(Integer roleId, String roleName, String roleDescription) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    public RolePOJO() {
    }


}
