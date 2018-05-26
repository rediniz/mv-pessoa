package br.com.mv.repository.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;

import br.com.mv.model.Pessoa;
import br.com.mv.model.QPessoa;
import br.com.mv.repository.PessoaRepository;

@Repository
public class PessoaRepositoryImpl implements PessoaRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	@Inject
	private JPAQueryFactory queryFactory;

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
		QPessoa pessoa = QPessoa.pessoa;

		Pessoa p = queryFactory.selectFrom(pessoa).where(pessoa.id.eq(1L)).fetchOne();

		return p;
	}

	@Override
	public List<Pessoa> find(String nome, String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
