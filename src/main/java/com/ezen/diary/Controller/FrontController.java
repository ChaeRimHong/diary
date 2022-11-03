package com.ezen.diary.Controller;

import com.ezen.diary.DTO.MemberDTO;
import com.ezen.diary.Entity.MemberEntity;
import com.ezen.diary.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.net.http.HttpRequest;

@Controller
public class FrontController {

    @Autowired
    MemberService mService;

    @GetMapping("/")
    public String top(){
        return "top";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("join")
    public String join(MemberDTO mdto, Model mo){
        mo.addAttribute("mdto",new MemberDTO());
        return "join";
    }

    @PostMapping("join_in")
    public String join_in(@ModelAttribute("mdto") @Valid MemberDTO mdto, BindingResult br){
        if(br.hasErrors()) {
            return "join";
        }
        else {
            MemberEntity memberEntity1=mdto.toEntity();
            mService.join_save(memberEntity1);
            return "redirect:/main";
        }
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }
    @PostMapping("login_do")
    public String login_do(@RequestParam("id") String id,
                           @RequestParam("pw") String pw, MemberDTO mdto) {
        System.out.println("로그인한 ID : "+id);
        System.out.println("로그인한 PW : "+pw);

       if(id!=mdto.getId()) {
           return "login";
       }
       else {
           mService.find_idnum(id);

           return "redirect:/main";
       }
    }

}
