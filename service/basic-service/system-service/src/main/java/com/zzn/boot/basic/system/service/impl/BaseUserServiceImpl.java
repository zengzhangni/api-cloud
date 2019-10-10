package com.zzn.boot.basic.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzn.boot.basic.system.mapper.BaseUserMapper;
import com.zzn.boot.basic.system.service.BaseUserService;
import com.zzn.boot.system.model.BaseUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(rollbackFor = Exception.class)
public class BaseUserServiceImpl extends ServiceImpl<BaseUserMapper, BaseUser> implements BaseUserService {



}
