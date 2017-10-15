package com.snail.service.base;

import com.snail.pojo.domain.Menu;

import java.util.List;

/**
 *  @description 前台门户菜单功能模块业务层接口
 *  Create By Jiankun.Zhangsun
 *  2017年10月7日16:45:53
 */
public interface MenuService {

    /**
     * 根据菜单等级查询菜单列表
     * @param app
     * @param level 菜单的等级
     * @return 指定等级的菜单列表
     */
    List<Menu> menus(String app, Integer level);
}
