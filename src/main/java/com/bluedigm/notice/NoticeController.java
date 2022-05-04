package com.bluedigm.notice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 테이블 정보는 schema.sql과 data.sql을 참고하세요
 * 서버 실행 후 http://localhost:8080/h2-console 을 통해 데이터 베이스 정보 확인이 가능합니다.
 */

@Controller
public class NoticeController {

    private final NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    // 전체 목록 조회
    @GetMapping("/")
    public String list(NoticeDto noticeDao, Model model) {
        //NoticeDto noticeDao 추가 -> noticeService에서 getNoticeList를 불러오기 위해, 파라미터 주입

        model.addAttribute("list", noticeService.getNoticeList(noticeDao));// TODO

        return "list";
    }

    // 개별 조회
    @GetMapping("/{id}")
    public String viewGetNotice(@PathVariable Integer id, Model model) {
        //id: String -> Integer (Dto와 Service에서 id가 integer형)

        model.addAttribute("", noticeService.getNotice(id));

        return "view";
    }

    // 등록 페이지 이동
    @GetMapping("/create")
    public String createNoticeForm() {
        return "create";
    }

    // 등록
    @PostMapping("/create")
    public String createNotice(@ModelAttribute NoticeDto noticeDao) {

        noticeService.createNotice(noticeDao);  // TODO

        return "redirect:/";
    }

    // 수정 페이지 이동
    @GetMapping("/update")
    public String updateNoticeForm() {
        return "update";
    }


    // 수정
    @PostMapping("/update")
    public String updateNotice(@ModelAttribute NoticeDto noticeDao) {

        noticeService.updateNotice(noticeDao);  // TODO

        return "redirect:/";
    }
}
