package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 控制器
 * </p>
 *
 * @author Aohongzhu
 * @since 2020年12月03日
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserClientService userClientService;

    @GetMapping("/get/{id}")
    public String get(@PathVariable(name = "id") int id) {
        return userClientService.get(id);
    }
}
