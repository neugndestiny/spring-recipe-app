package warakorn.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","index"})
    public String getIndexPage() {
        System.out.println("Send massage to say... 5555555555");
        return "index";
    }
}
