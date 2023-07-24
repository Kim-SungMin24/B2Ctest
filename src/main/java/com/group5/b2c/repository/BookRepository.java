package com.group5.b2c.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.group5.b2c.model.Book;
import com.group5.b2c.model.Member;

public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByMemberid(Member member);
	List<Book> findByTitleContainingOrAuthorContainingOrCategoryContaining(String title, String author, String category);
	//서치 07 21 제목 저자 카테고리
	
	//List<Book> findByTitleContaining(String keyword1);
	
}
