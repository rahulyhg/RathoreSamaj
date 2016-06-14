package com.society.service;

import java.sql.SQLException;
import java.util.List;

import com.society.domain.Candidate;
import com.society.dto.CandidateDTO;



public interface RegisterService {
	public void addRegisterCandidate(Candidate candidate);
    public List<CandidateDTO> getAllRegisterCandidate() throws SQLException;
    public void deleteRegisterCandidate(Integer candidate);
}
