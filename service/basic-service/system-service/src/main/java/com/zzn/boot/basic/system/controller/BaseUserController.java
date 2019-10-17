package com.zzn.boot.basic.system.controller;


import com.zzn.boot.basic.system.service.BaseUserService;
import com.zzn.boot.redis.RedisService;
import com.zzn.boot.system.model.BaseUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@Api(tags = "用户")
@RestController
@RequestMapping("baseUser")
public class BaseUserController {

    @Resource
    private BaseUserService baseUserService;
    @Resource
    private RedisService redisService;

    @ApiOperation(value = "list")
    @GetMapping("/list")
    public List<BaseUser> list() {

        return baseUserService.list();
    }

    @ApiOperation(value = "add")
    @PostMapping("/add")
    public Boolean add(@RequestBody BaseUser baseUser) {
        return baseUserService.save(baseUser);
    }


    @ApiOperation(value = "add2")
    @PostMapping("/add2")
    public void add2(@RequestBody BaseUser baseUser) {
        redisService.set("dd", baseUser);
    }

}
