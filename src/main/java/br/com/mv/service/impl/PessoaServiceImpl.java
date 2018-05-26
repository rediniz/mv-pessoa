package br.com.mv.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.mv.model.Pessoa;
import br.com.mv.repository.PessoaRepository;
import br.com.mv.service.PessoaService;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService{

	@Inject
	private PessoaRepository pessoaRepository;

	@Override
	public Pessoa save(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa update(Pessoa pessoa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Pessoa pessoa) {
		// TODO Auto-generated method stub
	}

	@Override
	public Pessoa findById(Long id) {
		return pessoaRepository.findById(id);
	}

	@Override
	public List<Pessoa> find(String nome, String cpf) {
		// TODO Auto-generated method stub
		return null;
	}


}
