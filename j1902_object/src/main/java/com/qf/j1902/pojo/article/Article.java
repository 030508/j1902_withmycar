package com.qf.j1902.pojo.article;

import lombok.Data;

@Data
public class Article {
    private  Integer id;//id
    private  String title;//资讯标题
    private  Integer categoryId;//资讯分类
    private  String source;//资讯来源
    private  String author;//资讯作者
    private  String summary;//资讯摘要
    private  String coverPic;//封面图片url（不带域名）
    private  String thumbPic;//缩略图url（不带域名）
    private  String tags;//资讯标签
    private  String content;//资讯内容
    private  String previewUrl;//资讯预览url（不带域名）
    private  String qrcodeUrl;//资讯二维码图片url
    private  Integer pvCount;//pv数
    private  Integer uvCount;//uv数
    private  Integer commentCount;//评论数
    private  Integer likeCount;//点赞量
    private  Integer favCount;//收藏数
    private  Integer shareCount;//分享数（预留字段）
    private  Integer channelTop;//是否栏目推荐（预留字段）
    private  Integer homeTop;//是否首页推荐
    private  Integer createUid;//发起人
    private  String createUname;//发起人姓名
    private  Integer createTime;//发起时间
    private  Integer submitUid;//资讯提交人
    private  Integer submitTime;//资讯提交时间
    private  Integer states;//资讯审核状态
    private  Integer stateOrder;//资讯审核状态排序码
    private  Integer lastAuditUid;//最后审核人
    private  String lastAuditUsername;//最后审核人姓名
    private  Integer lastAuditTime;//最后审核时间
    private  String lastRejectReason;//最后审核退回原因
    private  Integer publishState;//资讯发布状态
    private  Integer publishUid;//资讯发布人员
    private  String publishUname;//资讯发布人员姓名
    private  Integer publishTime;//资讯发布时间
    private  Integer unpublishUid;//资讯撤销发布人员
    private  String unpublishUname;//资讯撤销发布人员姓名
    private  Integer unpublishTime;//资讯撤销发布时间
    private  String unpublishReason;//资讯撤销发布原因
    private  Integer lastUpdateUid;//最后修改人
    private  String lastUpdateUname;//最后修改人姓名
    private  Integer lastUpdateTime;//最后修改时间
    private  String seoKeywords;//SEO关键字
    private  String seoDescription;//SEO描述
    private  Integer allowUp;//是否允许点赞
    private  Integer allowFav;//是否允许收藏

}
