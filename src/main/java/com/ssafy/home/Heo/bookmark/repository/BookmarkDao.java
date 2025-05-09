package com.ssafy.home.Heo.bookmark.repository;

import com.ssafy.home.Heo.bookmark.dto.out.BookmarkResponseDto;
import com.ssafy.home.Heo.bookmark.entity.BookmarkEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Mapper
@Repository
public interface BookmarkDao {

    // 즐겨찾기 조회
    List<BookmarkResponseDto> getBookmarkList(String memberId) throws SQLException;
    // 즐겨찾기 등록
    void insert(BookmarkEntity bookmarkentity) throws SQLException;
    // 즐겨찾기 삭제
    void delete(String bookmarkId) throws  SQLException;

}
