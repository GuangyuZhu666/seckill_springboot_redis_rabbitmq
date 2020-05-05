package com.zhugy.seckill.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zhugy.seckill.domain.MiaoshaUser;

@Mapper
public interface MiaoshaUserDao {
	
	@Select("select * from sk_user where id = #{id}")
	public MiaoshaUser getById(@Param("id")long id);

	@Update("update sk_user set password = #{password} where id = #{id}")
	public void update(MiaoshaUser toBeUpdate);
}
