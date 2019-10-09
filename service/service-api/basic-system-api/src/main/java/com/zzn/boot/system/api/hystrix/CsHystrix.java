package com.zzn.boot.system.api.hystrix;

import com.zzn.boot.system.api.CsFeign;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zengzhangni
 * @date 2019/10/9
 */
@Component(value = "CsFeign")
public class CsHystrix implements CsFeign {
    @Override
    public Map add() {
        Map map = new HashMap();
        map.put("code", 500);
        map.put("msg", "失败");
        return map;
    }
}
