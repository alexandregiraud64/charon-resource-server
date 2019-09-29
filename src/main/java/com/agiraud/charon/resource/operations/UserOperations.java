package com.agiraud.charon.resource.operations;

import java.util.UUID;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.agiraud.charon.core.dto.User;

@RequestMapping("/user")
public interface UserOperations {
	/* ************************************************************************* */
	// REQUEST MAPPING
	/* ************************************************************************* */
	@GetMapping("/create")
	public String createForm(WebRequest request, Model model);
	
    @PostMapping("/create")
    public String createSubmit(@ModelAttribute User user, BindingResult bindingResult, Model model);
    
	@GetMapping("/getAll")
	public String getAll(WebRequest request, Model model);
    
	@GetMapping("/upgrade/{userId}")
	public String upgrade(@PathVariable UUID userId, Model model);
    
	@GetMapping("/delete/{userId}")
	public String deleteById(@PathVariable UUID userId, Model model);
}
