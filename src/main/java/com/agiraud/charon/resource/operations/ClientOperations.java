package com.agiraud.charon.resource.operations;

import com.agiraud.charon.core.dto.Client;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

@RequestMapping("/client")
public interface ClientOperations {
	/* ************************************************************************* */
	// REQUEST MAPPING
	/* ************************************************************************* */
	@GetMapping("/create")
	public String createForm(WebRequest request, Model model);
	
    @PostMapping("/create")
    public String createSubmit(@ModelAttribute Client client, BindingResult bindingResult, Model model);
    
	@GetMapping("/getAll")
	public String getAll(WebRequest request, Model model);
    
	@GetMapping("/delete/{clientId}")
	public String deleteById(@PathVariable String clientId, Model model);
}
