package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * Date:2018/9/7
 * Author: 张敬宇
 * Desc: 品牌持久层接口
 */
public interface BrandMapper {

    public List<TbBrand> queryAll();
}
