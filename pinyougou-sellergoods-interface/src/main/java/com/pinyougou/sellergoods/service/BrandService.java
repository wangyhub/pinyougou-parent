package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * @program: pinyougou-parent
 * @Date: 2020/7/28 9:45
 * @Author: wangy
 * @Description: 品牌接口
 */
public interface BrandService {

    public List<TbBrand> findAll();
}
