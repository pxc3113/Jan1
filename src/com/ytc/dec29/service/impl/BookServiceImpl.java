/** 
 * <pre>项目名称:java2021-12-28-x 
 * 文件名称:BookServiceImpl.java 
 * 包名:com.ytc.service.impl 
 * 创建日期:2021年12月28日下午2:05:46 
 * Copyright (c) 2021,  All Rights Reserved.</pre> 
 */  
package com.ytc.dec29.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytc.dec29.mapper.BookMapper;
import com.ytc.dec29.model.*;
import com.ytc.dec29.service.*;

/** 
 * <pre>项目名称：java2021-12-28-x    
 * 类名称：BookServiceImpl    
 * 类描述：    
 * 创建人：zyl   
 * 创建时间：2021年12月28日 下午2:05:46    
 * 修改人：zyl 
 * 修改时间：2021年12月28日 下午2:05:46    
 * 修改备注：       
 * @version </pre>    
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookMapper bookMapper;
	
	/* (non-Javadoc)    
	 * @see com.ytc.service.BookService#queryPageList()    
	 */
	@Override
	public List<Book> getAll() {
		return bookMapper.getAll();
	}
	@Override
	public void update(int id, int up) {
		bookMapper.update(id, up);
	}

	/* (non-Javadoc)    
	 * @see com.ytc.service.BookService#add(com.ytc.model.Book)    
	 */
//	@Override
//	public void add(Book book) {
//	 	bookMapper.add(book);
//	}


}
