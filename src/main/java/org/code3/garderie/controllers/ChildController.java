package org.code3.garderie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Date;
import org.springframework.ui.ModelMap;

@Controller("/child")
public class ChildController {

  @Autowired
  ChildRepository childRepository;

  @RequestMapping("/")
  public String index() {
    return "redirect:/child/list";
  }

  @GetMapping("/child/list")
  public String list(ModelMap model){
    model.addAttribute("children", childRepository.getAllChildren());
    return "/child/list";
  }

}
