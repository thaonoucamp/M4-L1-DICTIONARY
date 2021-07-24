package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.DictionaryImp;
import service.IDictionary;

@SuppressWarnings("ALL")
@Controller
public class DictionaryController {
    @Autowired
    private IDictionary service;

    @GetMapping("/dictionary")
    public ModelAndView showForm(){
            ModelAndView modelAndView = new ModelAndView("views/dictionary.jps");
            return modelAndView;
    }

    @GetMapping("/translator")
    public ModelAndView translate(@RequestParam("key") String key){
        String result = service.translator(key);
        ModelAndView modelAndView = new ModelAndView("views/result.jsp");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
