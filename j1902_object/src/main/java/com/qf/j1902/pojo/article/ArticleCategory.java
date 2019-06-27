package com.qf.j1902.pojo.article;

import lombok.Data;

@Data
public class ArticleCategory {
    private  Integer id;//分类id
    private  String name;//分类名称
    private  Integer isDeleted;//是否删除
    private  Integer sortNum;//分类排序
    private  Integer createTime;//创建时间
    private  Integer lastUpdateTime;//最后更新时间

}
