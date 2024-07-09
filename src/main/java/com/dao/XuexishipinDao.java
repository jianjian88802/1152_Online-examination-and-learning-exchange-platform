package com.dao;

import com.entity.XuexishipinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexishipinView;

/**
 * 学习视频 Dao 接口
 *
 * @author 
 */
public interface XuexishipinDao extends BaseMapper<XuexishipinEntity> {

   List<XuexishipinView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
