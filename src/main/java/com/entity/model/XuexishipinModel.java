package com.entity.model;

import com.entity.XuexishipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学习视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XuexishipinModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学习视频标题
     */
    private String xuexishipinName;


    /**
     * 封面
     */
    private String xuexishipinPhoto;


    /**
     * 视频
     */
    private String xuexishipinVideo;


    /**
     * 讲师
     */
    private String xuexishipinJiangshi;


    /**
     * 学习类型
     */
    private Integer xuexishipinTypes;


    /**
     * 详情
     */
    private String xuexishipinContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学习视频标题
	 */
    public String getXuexishipinName() {
        return xuexishipinName;
    }


    /**
	 * 设置：学习视频标题
	 */
    public void setXuexishipinName(String xuexishipinName) {
        this.xuexishipinName = xuexishipinName;
    }
    /**
	 * 获取：封面
	 */
    public String getXuexishipinPhoto() {
        return xuexishipinPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setXuexishipinPhoto(String xuexishipinPhoto) {
        this.xuexishipinPhoto = xuexishipinPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getXuexishipinVideo() {
        return xuexishipinVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setXuexishipinVideo(String xuexishipinVideo) {
        this.xuexishipinVideo = xuexishipinVideo;
    }
    /**
	 * 获取：讲师
	 */
    public String getXuexishipinJiangshi() {
        return xuexishipinJiangshi;
    }


    /**
	 * 设置：讲师
	 */
    public void setXuexishipinJiangshi(String xuexishipinJiangshi) {
        this.xuexishipinJiangshi = xuexishipinJiangshi;
    }
    /**
	 * 获取：学习类型
	 */
    public Integer getXuexishipinTypes() {
        return xuexishipinTypes;
    }


    /**
	 * 设置：学习类型
	 */
    public void setXuexishipinTypes(Integer xuexishipinTypes) {
        this.xuexishipinTypes = xuexishipinTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getXuexishipinContent() {
        return xuexishipinContent;
    }


    /**
	 * 设置：详情
	 */
    public void setXuexishipinContent(String xuexishipinContent) {
        this.xuexishipinContent = xuexishipinContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
