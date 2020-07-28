package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: pinyougou-parent
 * @Date: 2020/7/28 10:00
 * @Author: wangy
 * @Description: 品牌Service
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper tbBrandMapper;

    public List<TbBrand> findAll(){
        return tbBrandMapper.selectByExample(null);
    }
}
