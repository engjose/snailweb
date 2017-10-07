package com.snail.service.base;

import com.snail.pojo.domain.Banner;
import java.util.List;

/**
 * Cms营销Service接口
 *
 * Created by panyuanyuan on 2017/10/7.
 */
public interface ICmsService {

    /**
     * 查询轮播
     *
     * @param app
     * @return
     */
    List<Banner> listBanners(String app);
}
