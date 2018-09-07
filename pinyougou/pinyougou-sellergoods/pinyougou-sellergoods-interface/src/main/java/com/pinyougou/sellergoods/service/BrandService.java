package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * Date:2018/9/7
 * Author: 张敬宇
 * Desc: 品牌业务层接口
 */

public interface BrandService {
    /**
     * 查询所有品牌
     * @return
     */
    public List<TbBrand> queryAll();
}
