package com.zzn.boot.business.web.system.controller;

import com.zzn.boot.system.api.CsFeign;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author zengzhangni
 * @date 2019/10/9
 */
@Api(tags = "web")
@RestController
@RequestMapping("web")
public class CsController {

    @Resource
    private CsFeign csFeign;

    @ApiOperation("web")
    @PostMapping("/add")
    public Map add() {
        return csFeign.add();
    }
}
