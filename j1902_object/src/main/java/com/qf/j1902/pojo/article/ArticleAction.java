package com.qf.j1902.pojo.article;

import lombok.Data;

@Data
public class ArticleAction {
    private  Integer id;//id
    private  Integer articleId;//资讯ID
    private  Integer operatorUid;//操作用户ID
    private  String operatorUsername;//操作用户姓名
    private  Integer createTime;//记录创建时间
    private  String content;//操作描述
    private  Integer operateType;//操作类型

}
