package service;

import model.Posicao;
import repository.PosicaoRepository;

public class PosicaoService {

	public Posicao getPosicao() {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.getPosicao();

	}

}
