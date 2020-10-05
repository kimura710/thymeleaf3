package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController {
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[] {"taro","taro@yamada","090-999-3540"});
		data.add(new String[] {"kimura","takumi@kimura","080-7777-5555"});
		data.add(new String[] {"hanako","hanako@yamamura","030-5555-7777"});
		mav.addObject("data",data);
		return mav;
	}

}
