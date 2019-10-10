package com.zzn.boot.system.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;


@Data
@ApiModel(value = "用户表")
@TableName("base_user")
public class BaseUser implements Serializable {

    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("登录名")
    private String loginName;
    @ApiModelProperty("uuid")
    private String uuid;
    @ApiModelProperty("昵称")
    private String nickName;
    @ApiModelProperty("密码")
    private String password;
    @ApiModelProperty("性别")
    private String gender;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("手机号码")
    private String mobilePhone;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("是否禁用 0-启用 1-禁用")
    private Byte isDisabled;
    @ApiModelProperty("超级管理员:sysadmin,平台管理员:admin,门店管理员:store")
    private String userType;

}