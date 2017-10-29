package com.snail.controller.portal;

import com.snail.common.constants.ResponseCode;
import com.snail.common.constants.ResultMap;
import com.snail.pojo.BannerForm;
import com.snail.service.base.ICmsService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 蜗牛官网Cms营销Controller
 *
 * Created by panyuanyuan on 2017/10/7.
 */
@RestController
@RequestMapping("/cms")
public class CmsController {

    @Autowired
    private ICmsService iCmsService;

    /**
     * 根据application 查询banners
     *
     * @param app
     * @return
     */
    @RequestMapping(value = "/banners", method = RequestMethod.GET)
    public ResultMap listBanners(@NonNull String app) {
        return ResultMap.getResultMap(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDescription(), iCmsService.listBanners(app));
    }

    /**
     * 新增Banner
     *
     * @param form
     * @return
     */
    @RequestMapping(value = "/banners", method = RequestMethod.POST)
    public ResultMap addBanner(@PathVariable BannerForm form){
        return null;
    }

    /**
     * 上架Banner
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/banners", method = RequestMethod.PUT)
    public ResultMap onLineBanner(@NonNull Integer id){
        return null;
    }

    /**
     * 下架Banner,逻辑删除
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/banners", method = RequestMethod.DELETE)
    public ResultMap offLineBanner(@NonNull Integer id) {
        return null;
    }
}
