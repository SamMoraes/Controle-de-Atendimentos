package br.com.sammoraes.requests;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ReceitaMedicaPostRequest {

	private String medicamento;
	private String prescricao;

}


