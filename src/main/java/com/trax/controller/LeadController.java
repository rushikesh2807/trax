package com.trax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trax.entities.Lead;
import com.trax.services.LeadService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLead")
	public String viewLeadPage() {
		return "create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute Lead lead,ModelMap model) {
		try {
			leadService.saveLead(lead);
			model.addAttribute("lead",lead);
		} catch (Exception e) {
			model.addAttribute("error","Email Already Exists !");
			return "create_lead";
		}
		
		return"lead_info";
	}
	
	@RequestMapping("/composeEmail")
	public String composeEmail(@RequestParam("email")String email,ModelMap model) {
		model.addAttribute("email", email);
		return "compose_email";
		
	}
	
	@RequestMapping("/listAll")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "leads_list";
	}
	
	@RequestMapping("/leadInfo")
	public String getLeadInfo(@RequestParam("id")int id,ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
