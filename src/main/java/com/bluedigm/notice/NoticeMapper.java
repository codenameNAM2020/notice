package com.bluedigm.notice;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {     //DAO

    List<NoticeDto> getNoticeList();
    NoticeDto getNotice(Integer id);
    Integer createNotice(NoticeDto noticeDto);
    Integer updateNotice(NoticeDto noticeDto);
    Integer deleteNotice(Integer id);

    Integer updateHit(Integer id);
}
