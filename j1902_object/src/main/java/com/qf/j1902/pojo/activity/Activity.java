package com.qf.j1902.pojo.activity;

import lombok.Data;

@Data
public class Activity {
    private Integer id;//id
    private String title;//活动标题
    private Integer categoryId;//活动分类
    private String url;//活动链接
    private Integer states;//活动状态
    private String summary;//活动摘要
    private String description;//活动描述
    private String link;//活动原始链接
    private Integer beginTime;//活动开始时间
    private Integer endTime;//活动结束时间
    private Integer channelTop;//是否栏目推荐（备用）
    private Integer homeTop;//是否首页推荐
    private Integer pvCount;//pv数
    private Integer uvCount;//uv数
    private Integer upCount;//点赞数
    private Integer favCount;//收藏数
    private Integer publishState;//活动发布状态
    private Integer createUid;//活动创建人员
    private Integer createTime;//活动创建时间
    private String author;//作者
    private String unpublishUname;//活动撤销发布人员
    private String unpublishTime;//活动撤销发布时间
    private String seoKeywords;//SEO关键字
    private String sdkPath;//sdk文件路径
    private Integer likeCount;//点赞量
    private Integer shareCount;//分享量
    private Integer viewCount;//浏览量
    private String seoDescription;//SEO描述
    private String tags;//标签
    private String coverPic;//封面图片
    private String cars;//关联车型
    private Integer sdkId;//SDK文档ID
    private String sdkTitle;//SDK文档名称
    private String dealer;//经销商


}
