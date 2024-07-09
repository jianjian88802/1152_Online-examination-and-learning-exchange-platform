package com.entity.view;

import com.entity.XuexishipinLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 学习视频留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xuexishipin_liuyan")
public class XuexishipinLiuyanView extends XuexishipinLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xuexishipin
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
				* 学习类型的值
				*/
				private String xuexishipinValue;
			/**
			* 详情
			*/
			private String xuexishipinContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XuexishipinLiuyanView() {

	}

	public XuexishipinLiuyanView(XuexishipinLiuyanEntity xuexishipinLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xuexishipinLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set xuexishipin
					/**
					* 获取： 学习视频标题
					*/
					public String getXuexishipinName() {
						return xuexishipinName;
					}
					/**
					* 设置： 学习视频标题
					*/
					public void setXuexishipinName(String xuexishipinName) {
						this.xuexishipinName = xuexishipinName;
					}
					/**
					* 获取： 封面
					*/
					public String getXuexishipinPhoto() {
						return xuexishipinPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setXuexishipinPhoto(String xuexishipinPhoto) {
						this.xuexishipinPhoto = xuexishipinPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getXuexishipinVideo() {
						return xuexishipinVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setXuexishipinVideo(String xuexishipinVideo) {
						this.xuexishipinVideo = xuexishipinVideo;
					}
					/**
					* 获取： 讲师
					*/
					public String getXuexishipinJiangshi() {
						return xuexishipinJiangshi;
					}
					/**
					* 设置： 讲师
					*/
					public void setXuexishipinJiangshi(String xuexishipinJiangshi) {
						this.xuexishipinJiangshi = xuexishipinJiangshi;
					}
					/**
					* 获取： 学习类型
					*/
					public Integer getXuexishipinTypes() {
						return xuexishipinTypes;
					}
					/**
					* 设置： 学习类型
					*/
					public void setXuexishipinTypes(Integer xuexishipinTypes) {
						this.xuexishipinTypes = xuexishipinTypes;
					}


						/**
						* 获取： 学习类型的值
						*/
						public String getXuexishipinValue() {
							return xuexishipinValue;
						}
						/**
						* 设置： 学习类型的值
						*/
						public void setXuexishipinValue(String xuexishipinValue) {
							this.xuexishipinValue = xuexishipinValue;
						}
					/**
					* 获取： 详情
					*/
					public String getXuexishipinContent() {
						return xuexishipinContent;
					}
					/**
					* 设置： 详情
					*/
					public void setXuexishipinContent(String xuexishipinContent) {
						this.xuexishipinContent = xuexishipinContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
