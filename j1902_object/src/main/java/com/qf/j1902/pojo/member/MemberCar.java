package com.qf.j1902.pojo.member;

import lombok.Data;

/**
 * Created by Administrator on 2019/6/27 0027.
 */
@Data
public class MemberCar {
    private 	Integer	id	;
    private	 Integer	memberId	;
    private	 Integer	brandId	;
    private	 Integer	makeId	;
    private	 Integer	modelId	;
    private	 Integer	carId	;
    private	 Integer	buyYear	;
    private	 Integer	currentMileage	;
    private	 String	remark	;
    private	 Integer	types	;
    private	 Integer	createTime	;
    private	 Integer	lastUpdateTime	;

}
