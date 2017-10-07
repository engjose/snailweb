package com.snail.service.impl;

import com.snail.dao.MenuMapper;
import com.snail.pojo.domain.Menu;
import com.snail.pojo.domain.MenuExample;
import com.snail.service.base.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @description 前台门户菜单功能模块业务层接口实现类
 *  Create By Jiankun.Zhangsun
 *  2017年10月7日16:45:42
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuMapper menuMapper;

    /**
     * @see com.snail.service.base.MenuService#listMenus(String, Integer)
     */
    @Override
    public List<Menu> listMenus(String app, Integer level) {
        MenuExample example = new MenuExample();
        MenuExample.Criteria criteria = example.createCriteria();
        criteria.andAppEqualTo(app);
        criteria.andLevelEqualTo(level);
        List<Menu> menus = menuMapper.selectByExample(example);
        return menus;
    }
}