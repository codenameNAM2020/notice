package com.bluedigm.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {     //DAO

    List<NoticeDto> getNoticeList();
    NoticeDto getNotice(Integer id);
    Integer createNotice(NoticeDto noticeDao);
    Integer updateNotice(NoticeDto noticeDao);
    Integer deleteNotice(Integer id);

    Integer updateHit(int id);
}
