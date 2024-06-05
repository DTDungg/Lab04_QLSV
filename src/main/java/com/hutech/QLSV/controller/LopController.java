package com.hutech.QLSV.controller;
import com.hutech.QLSV.model.Lop;
import com.hutech.QLSV.sevices.LopService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/lop")
public class LopController {
    @Autowired
    private LopService lopService;

    @GetMapping
    public String showAllLop(Model model){
        List<Lop> dsLop = lopService.getAllLop();
        model.addAttribute("dsLop", dsLop);
        return "lop/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("lop", new Lop());
        return "lop/add";
    }

    @PostMapping("/add")
    public String addLop(@ModelAttribute("lop") Lop lop){
        lopService.addLop(lop);
        return "redirect:/lop";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(Long id, Model model){
        Lop lop = lopService.getLopById(id);
        model.addAttribute("lop", lop);
        return "lop/update";
    }

    @PostMapping("/update/{id}")
    public String updateLop(Long id, BindingResult result, Model model, @Valid Lop lop){
        if(result.hasErrors()){
            return "lop/update";
        }
        lopService.updateLop(lop);
        model.addAttribute("lop",lopService.getAllLop());
        return "redirect:/lop";
    }
}
