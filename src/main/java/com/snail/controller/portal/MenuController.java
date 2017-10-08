package com.snail.controller.portal;

import com.snail.common.constants.ResultMap;
import com.snail.pojo.domain.Menu;
import com.snail.service.base.MenuService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

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
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public ResultMap listMenus(@NonNull String app, @RequestParam(defaultValue = "1") Integer level) {
        List<Menu> menus = menuService.listMenus(app, level);
        return  ResultMap.getResultMap(200, "success", menus);
    }

}
