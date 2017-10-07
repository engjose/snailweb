package com.snail.controller.portal;

import com.snail.common.constants.ResultMap;
import com.snail.service.base.MenuService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @description 前台门户菜单功能模块表现层
 *  Create By Jiankun.Zhangsun
 *  2017年10月7日16:18:57
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;
    /**
     * 查询菜单列表
     * @param app 请求的来源是移动端还是web端
     * @param level 菜单的等级，默认是一级菜单
     * @return 包含菜单列表的响应对象
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResultMap listMenus(@NotNull String app, @RequestParam(defaultValue = "1") Integer level) {

        return  null;
    }

}
