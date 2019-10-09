package com.zzn.boot.system.api;

import com.zzn.boot.system.api.hystrix.CsHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * @author zengzhangni
 * @date 2019/10/9
 */
@FeignClient(name = "SYSTEM-SERVICE", fallback = CsHystrix.class)
public interface CsFeign {

    @PostMapping("/cs/add")
    Map add();
}
