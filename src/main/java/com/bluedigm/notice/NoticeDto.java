package com.bluedigm.notice;

import java.util.List;

public class NoticeDto {    //getter, setter

    // TODO
    private String title;

    private int id;
    private String userId;
    private String contents;
    private String regDate;
    private int hit;

    private List<NoticeDto> getNoticeList;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public int getHit() {
        return hit;
    }
    public void setHit(int hit) {
        this.hit = hit;
    }

    public List<NoticeDto> getGetNoticeList() {
        return getNoticeList;
    }
    public void setGetNoticeList(List<NoticeDto> getNoticeList) {
        this.getNoticeList = getNoticeList;
    }
}
