package com.encore.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.encore.mybatis.vo.Book;

public class BookTestApp {

	public static void main(String[] args) throws Exception {
		
		// 1. 팩토리 얻어온다.
		SqlSessionFactory factory = FactoryService.getFactory();
		
		// 2. openSession() SqlSession 받아온다...디비 연결 쿼리문 실행할 수 있다.
		SqlSession session = factory.openSession();
		
		Book vo1 = new Book();
		vo1.setAuthor("베르나르베르베르");
		vo1.setCatalogue("aaa");
		vo1.setCurrency("bbb");
		vo1.setDescription("ccc");
		vo1.setIsbn("111-222-333");
		vo1.setNation("프랑스");
		vo1.setPrice(20000);
		vo1.setPublishDate("1995-12-05");
		vo1.setPublisher("ddd");
		vo1.setTitle("개미");
		
//		session.insert("bookMapper.bookAdd", vo1);
//		session.commit(); // DML일 때는 반드시 commit() 해줘야 한다.
//		System.out.println(vo1.getTitle() + " 책 등록 성공^^");
////		
//		List<Book> list = session.selectList("bookMapper.bookList");
//		System.out.println(list);
//		
//		Book selectedBook = session.selectOne("bookMapper.bookOne", "111-222-333");
//		System.out.println(selectedBook);
//		
//		Book vo2 = new Book();
//		vo2.setAuthor("베르베르베르나르");
//		vo2.setCatalogue("aaa");
//		vo2.setCurrency("bbb");
//		vo2.setDescription("ccc");
//		vo2.setIsbn("111-222-333");
//		vo2.setNation("프랑스");
//		vo2.setPrice(20000);
//		vo2.setPublishDate("1995-12-05");
//		vo2.setPublisher("ddd");
//		vo2.setTitle("개미");
//		
//		session.update("bookMapper.bookUpdate", vo2);
//		session.commit();
//		System.out.println(vo2.getTitle() + " 책 수정 성공^^");
//		
//		session.delete("bookMapper.bookDelete", "111-222-333");
//		session.commit();
	}
	
}
