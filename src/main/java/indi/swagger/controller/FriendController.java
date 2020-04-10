package indi.swagger.controller;

import indi.swagger.entity.FriendsManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Swagger
 * @description: 好友管理控制器
 * @author: 张文轩
 * @create: 2020-04-10 16:23
 **/
@RestController
public class FriendController {
    Logger logger = LoggerFactory.getLogger(FriendController.class);

    /**
     * 好友过滤器，判断两个用户是否为好友
     *
     * @param mainUserId
     * @param friendUserId
     * @return
     */
    @GetMapping("friend/filter")
    public Map<String, String> friendFilter(@RequestParam Integer mainUserId,
                                            @RequestParam Integer friendUserId) {
        Map<String, String> map = new HashMap<>();
        return map;
    }

    /**
     * 建立好友关系
     *
     * @param friendsManager
     * @return
     */
    @PostMapping("friend/making")
    public Map<String, String> friendMaking(@RequestBody FriendsManager friendsManager) {
        Map<String, String> map = new HashMap<>();
        return map;
    }
}
