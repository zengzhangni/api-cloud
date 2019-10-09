package com.zzn.boot.basic.system.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zengzhangni
 * @date 2019/10/9
 */
@Api(tags = "cs")
@RestController
@RequestMapping("cs")
public class CsController {

    @ApiOperation("cs")
    @PostMapping("/add")
    public Map add() {
        Map map = new HashMap(2);
        map.put("code", 200);
        map.put("msg", "成功");
        return map;
    }
}
