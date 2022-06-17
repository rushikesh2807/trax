package com.trax.services;

import java.util.List;

import com.trax.entities.Lead;

public interface LeadService {

	public void saveLead(Lead lead);
	public List<Lead> getAllLeads();
	public Lead getLeadById(int id);
	public void deleteById(int id);
}
