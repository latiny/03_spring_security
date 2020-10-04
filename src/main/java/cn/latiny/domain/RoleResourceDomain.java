package cn.latiny.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "role_resource")
public class RoleResourceDomain {
    /**
     * id
     */
    @Id
    private Long id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 资源id
     */
    @Column(name = "resource_id")
    private Long resourceId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除，0未删除，1已删除
     */
    private Integer deleted;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取资源id
     *
     * @return resource_id - 资源id
     */
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 设置资源id
     *
     * @param resourceId 资源id
     */
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除，0未删除，1已删除
     *
     * @return deleted - 是否删除，0未删除，1已删除
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除，0未删除，1已删除
     *
     * @param deleted 是否删除，0未删除，1已删除
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}