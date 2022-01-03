package com.ytc.dec29.mapper;

import java.util.List;

import org.apache.ibatis.annotations.*;
import com.ytc.dec29.model.*;
public interface BookMapper {


    @Select("select * from t_book")
    @Results(id="resultMap",value={
        @Result(property = "id",column="id"),
        @Result(property = "name",column="bookName"),
        @Result(property = "price",column="bookPrice"),
        @Result(property = "show",column="bookShow"),
        @Result(property = "typeId",column="typeId"),
        @Result(property = "bookUp",column="bookUp"),
    })
    List<Book> getAll(Book book);

    @SelectKey(keyProperty = "id",keyColumn = "c_id",before = false,resultType = Integer.class, statement = "select last_insert_id()")
    public void add(Book company);
    
    @Update("update t_book set bookUp = #{up} where id = #{id}")
    public void update(int id, int up);
    
    @Select("select c_password from t_book where c_name = #{name}")
    String getPassword(String name, String password);

//	@Insert(value={
//		"insert into t_book "+
//		"(c_name,c_password) values (#{name},#{password});"
//    })


}
