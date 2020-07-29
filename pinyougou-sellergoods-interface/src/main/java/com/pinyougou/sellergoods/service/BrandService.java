package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
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

    /**
     * 品牌分页
     * @param pageNum   当前页码
     * @param pageSize  每页显示条数
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);

    /**
     * 品牌添加
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 品牌修改
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 根据ID获取实体
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 批量删除
     * @param ids
     */
    public void delete(Long [] ids);


    /**
     * 品牌条件查询分页
     * @param pageNum   当前页码
     * @param pageSize  每页显示条数
     * @return
     */
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize);
}
