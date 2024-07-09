package com.dao;

import com.entity.XuexishipinLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexishipinLiuyanView;

/**
 * 学习视频留言 Dao 接口
 *
 * @author 
 */
public interface XuexishipinLiuyanDao extends BaseMapper<XuexishipinLiuyanEntity> {

   List<XuexishipinLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
