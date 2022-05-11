package com.bluedigm.notice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    private final NoticeMapper noticeMapper;

    public NoticeService(NoticeMapper noticeMapper) {
        this.noticeMapper = noticeMapper;
    }

    public List<NoticeDto> getNoticeList() {
        return noticeMapper.getNoticeList();   // TODO
    }

    public NoticeDto getNotice(Integer id) {
        return noticeMapper.getNotice(id);    // TODO
    }

    public Integer createNotice(NoticeDto noticeDao) {
        return noticeMapper.createNotice(noticeDao);    // TODO
    }

    public Integer updateNotice(NoticeDto noticeDao) {
        return noticeMapper.updateNotice(noticeDao);    // TODO
    }
}
