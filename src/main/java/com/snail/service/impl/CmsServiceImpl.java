package com.snail.service.impl;

import com.snail.common.enums.UseStatusEnum;
import com.snail.dao.BannerMapper;
import com.snail.pojo.domain.Banner;
import com.snail.pojo.domain.BannerExample;
import com.snail.service.base.ICmsService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 蜗牛官网Cms营销实现类
 *
 * Created by panyuanyuan on 2017/10/7.
 */
@Service
@Slf4j
public class CmsServiceImpl implements ICmsService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> listBanners(String app) {
        BannerExample example = new BannerExample();
        example.createCriteria().andAppEqualTo(app).andStatusEqualTo(UseStatusEnum.USE.getCode());
        example.setOrderByClause("priority desc");
        List<Banner> banners = bannerMapper.selectByExample(example);
        return banners;
    }
}
