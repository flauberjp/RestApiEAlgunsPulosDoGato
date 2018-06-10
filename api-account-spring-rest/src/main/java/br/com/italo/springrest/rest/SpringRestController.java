package br.com.italo.springrest.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.italo.springrest.domain.Account;
import br.com.italo.springrest.service.AccountService;

@RestController
@RequestMapping(
		value="/account",
		produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
		consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
)
public class SpringRestController {

	@Autowired
	private AccountService service;
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void exclude(@PathVariable("id") Long id) {
		service.delete(id);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Account edit(@PathVariable("id") Long id, @RequestBody Account account) {
		service.update(id, account);
		return account;
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Account getAccount(@PathVariable("id") Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody Account account){
		
		service.save(account);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(account.getIdAccount())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Account> listar(){
		return service.findAll();
	}
}
