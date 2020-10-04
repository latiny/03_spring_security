package cn.latiny.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUserDomain {
    /**
     * 用户id
     */
    @Id
    private Long id;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码密文
     */
    private String password;

    /**
     * 真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 是否可用
     */
    private Integer enabled;

    /**
     * 是否过期
     */
    @Column(name = "account_non_expired")
    private Integer accountNonExpired;

    /**
     * 是否锁定
     */
    @Column(name = "account_non_locked")
    private Integer accountNonLocked;

    /**
     * 证书是否过期
     */
    @Column(name = "credentials_non_expired")
    private Integer credentialsNonExpired;

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
     * 获取用户id
     *
     * @return id - 用户id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置用户id
     *
     * @param id 用户id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码密文
     *
     * @return password - 密码密文
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码密文
     *
     * @param password 密码密文
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取手机号
     *
     * @return phone - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取是否可用
     *
     * @return enabled - 是否可用
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * 设置是否可用
     *
     * @param enabled 是否可用
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * 获取是否过期
     *
     * @return account_non_expired - 是否过期
     */
    public Integer getAccountNonExpired() {
        return accountNonExpired;
    }

    /**
     * 设置是否过期
     *
     * @param accountNonExpired 是否过期
     */
    public void setAccountNonExpired(Integer accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    /**
     * 获取是否锁定
     *
     * @return account_non_locked - 是否锁定
     */
    public Integer getAccountNonLocked() {
        return accountNonLocked;
    }

    /**
     * 设置是否锁定
     *
     * @param accountNonLocked 是否锁定
     */
    public void setAccountNonLocked(Integer accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    /**
     * 获取证书是否过期
     *
     * @return credentials_non_expired - 证书是否过期
     */
    public Integer getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    /**
     * 设置证书是否过期
     *
     * @param credentialsNonExpired 证书是否过期
     */
    public void setCredentialsNonExpired(Integer credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
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