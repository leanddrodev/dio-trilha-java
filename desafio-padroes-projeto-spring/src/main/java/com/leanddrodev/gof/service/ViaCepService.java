package com.leanddrodev.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.leanddrodev.gof.model.Endereco;

import feign.Headers;


/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author leanddrodev
 */
@FeignClient(name = "viacep", url = "https://example.api.findcep.com/v1/cep")
@Headers("Referer: E1NHRO71JEONCF")
public interface ViaCepService {

	@GetMapping("/{cep}.json")
	Endereco consultarCep(@PathVariable("cep") String cep);
}
