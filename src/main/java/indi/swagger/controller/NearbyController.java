package indi.swagger.controller;

import indi.swagger.entity.NearbyUser;
import indi.swagger.service.NearbyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Swagger
 * @description: 附近的人控制器
 * @author: 张文轩
 * @create: 2020-03-22 09:50
 **/
@RestController
public class NearbyController {
    Logger logger = LoggerFactory.getLogger(NearbyController.class);
    @Autowired
    NearbyService nearbyService;
    /**
     * 获取指定坐标附近用户列表
     *
     * @param lon 经度
     * @param lat 纬度
     * @param limit 范围限制
     * @param name 昵称
     * @param sex 性别
     * @return
     */
    @GetMapping("nearby/list")
    public List<NearbyUser> getNearbyList(@RequestParam Double lon,
                                          @RequestParam Double lat,
                                          @RequestParam Double limit,
                                          @RequestParam String name,
                                          @RequestParam String sex) {
        logger.info("坐标-->lon:" + lon + "---lat:" + lat + "查询附近用户");
        Map<String, Object> map = new HashMap<>();
        map.put("lon", lon);
        map.put("lat", lat);
        map.put("limitDistance", limit);
        map.put("name", name);
        map.put("sex", sex);
        return nearbyService.getNearbyUsers(map);
    }
}
