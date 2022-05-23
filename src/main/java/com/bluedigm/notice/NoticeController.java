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
    public String list(Model model) {

        model.addAttribute("list", noticeService.getNoticeList());// TODO

        return "list";
    }

    // 개별 조회 (상세화면) - PathVariable을 통한 id값 삽입
    @GetMapping("/detail/{id}")
    public String viewGetNotice(@PathVariable Integer id, Model model) {

        noticeService.updateHit(id);    //조회수 처리
        model.addAttribute("detail", noticeService.getNotice(id));

        return "view";
    }

    // 등록 페이지 이동
    @GetMapping("/create")
    public String createNoticeForm() {
        return "create";
    }

    // 등록
    @PostMapping("/create")
    public String createNotice(@ModelAttribute NoticeDto noticeDto) {

        noticeService.createNotice(noticeDto);  // TODO

        return "redirect:/";
    }

    // 수정 페이지 이동
    @GetMapping("/update/{id}")
    public String updateNoticeForm(@PathVariable Integer id, Model model) {
        model.addAttribute("update", noticeService.getNotice(id));
        return "update";
    }


    // 수정
    @PostMapping("/update/{id}")
    public String updateNotice(@ModelAttribute NoticeDto noticeDto) {

        noticeService.updateNotice(noticeDto); // TODO

        return "redirect:/";
    }

    //삭제
    @PostMapping("/delete/{id}")
    public String deleteNotice(@PathVariable Integer id) {

        noticeService.deleteNotice(id);

        return "redirect:/";
    }
}
