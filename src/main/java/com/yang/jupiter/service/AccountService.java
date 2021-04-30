package com.yang.jupiter.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.yang.jupiter.entity.AccountDto;
import com.yang.jupiter.repository.AccountRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class AccountService {
	
	private final AccountRepository accountRepository;
	
	public String getAccount() {
		
		AccountDto dto = new AccountDto();
		dto.setId("kwangbi");
		dto.setUsername("양광모");
		dto.setMail("kwangbi@naver.com");
		accountRepository.save(dto);
		
		Optional<AccountDto> id = accountRepository.findById(dto.getId());
		
		log.info("name : {}",id.get().getUsername());
		log.info("mail : {}",id.get().getMail());
		
		
		return "ok";
	}

}