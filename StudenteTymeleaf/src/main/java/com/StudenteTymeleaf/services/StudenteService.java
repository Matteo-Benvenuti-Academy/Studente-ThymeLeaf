package com.StudenteTymeleaf.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudenteTymeleaf.dto.StudenteDto;
import com.StudenteTymeleaf.model.Studente;
import com.StudenteTymeleaf.repository.StudenteRepository;

@Service
public class StudenteService {
	
	@Autowired
	private StudenteRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<StudenteDto> findAll() {
		
		List<Studente> listaStu = repository.findAll();
		
		List<StudenteDto> listaStuDto = new ArrayList<StudenteDto>();
		
		for (Studente sto : listaStu) {
			listaStuDto.add(modelMapper.map(sto, StudenteDto.class));
		}
		
		return listaStuDto;
	}

	public boolean insert(StudenteDto objPers) {
		Studente studente = modelMapper.map(objPers, Studente.class);
		
		return repository.save(studente) != null;
	}
	
	
	 
}
