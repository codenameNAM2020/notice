package com.bluedigm.notice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {    //mapper interface의 구현

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

    public Integer createNotice(NoticeDto noticeDto) {
        return noticeMapper.createNotice(noticeDto);    // TODO
    }

    public Integer updateNotice(NoticeDto noticeDto) {
        return noticeMapper.updateNotice(noticeDto);    // TODO
    }

    public Integer updateHit (int id) {
        return noticeMapper.updateHit(id);
    }

    public Integer deleteNotice (Integer id) {
        return noticeMapper.deleteNotice(id);
    }
}
