package com.qf.j1902.pojo.member;

import lombok.Data;

/**
 * Created by Administrator on 2019/6/27 0027.
 */
@Data
public class MemberFav {
    private	Integer	id	;
    private	Integer	memberId	;
    private	Integer	favType	;
    private	Integer	contentId	;
    private	Integer	favTime	;
    private	String	favIp	;

}
