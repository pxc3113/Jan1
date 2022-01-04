package com.ytc.dec29.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.ytc.dec29.model.*;
public interface BookMapper {


    List<Book> getAll();

    @SelectKey(keyProperty = "id",keyColumn = "c_id",before = false,resultType = Integer.class, statement = "select last_insert_id()")
    public void add(Book company);

    // @Update("update t_book set bookUp = #{bookUp} where id = #{id}")
    public void update(@Param("id") int id, @Param("bookUp") int bookUp);
    
    @Select("select c_password from t_book where c_name = #{name}")
    String getPassword(String name, String password);

//	@Insert(value={
//		"insert into t_book "+
//		"(c_name,c_password) values (#{name},#{password});"
//    })


}
