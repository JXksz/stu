package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {

	public List<User> findAll();

	// 获取一个用户信息
	@Select("SELECT * FROM USER WHERE id=#{id}")
	public User get(@Param("id") Integer id);
	
	//新增用户
	@Insert("insert into user (name,birthday,address)"
			+ " values(#{name},#{birthday},#{address})")
	public void insert(User user);
	
	//修改
	@Update("update user " 
			+ "set name=#{name},birthday=#{birthday},address=#{address} "
			+ "where id=#{id}")
	public void update(User user); 
	
	//删除
	@Delete("delete from user where id=#{id}")
	public void delete(@Param("id") Integer id);
	
}
