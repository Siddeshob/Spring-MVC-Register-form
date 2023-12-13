package com.example.eclipsmvcdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.eclipsmvcdemo.Model.Student;

import jakarta.validation.Valid;

@Controller
public class StudentController {
	
	@Value("${countrys}")
	private List<String> countrys;
	
	@Value("${states}")
	private List<String> states;
	
	@Value("${genders}")
	private List<String> genders;
	
	@Value("${ProgrammingLanguages}")
	private List<String> ProgrammingLanguages;
	
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {
        StringTrimmerEditor  stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }
	
	@GetMapping("/reg-form")
	public String regForm(Model model)
	{
		model.addAttribute("student", new Student());
		
		model.addAttribute("countrys",countrys);
		
		model.addAttribute("states",states);
		
		model.addAttribute("genders",genders);
		
		model.addAttribute("ProgrammingLanguages",ProgrammingLanguages);
		
		return "reg-form";
	}
	
	@GetMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "reg-form";
		}
		else
		return "process-form";
	}

}
