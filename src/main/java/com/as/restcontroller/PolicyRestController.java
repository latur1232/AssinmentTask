package com.as.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.as.model.Policy;

import som.as.iservice.IPolicyService;

	@RestController
	@RequestMapping("/rest/policy")
	public class PolicyRestController {

		@Autowired
		private IPolicyService service;
		
		@GetMapping("/all")
		public ResponseEntity<?> getAll() {
			
			ResponseEntity<?> responseEntity = null;
			List<Policy> policy  = service.getAllPolicy();
			if (policy!=null && !policy.isEmpty()) {
				
				responseEntity = new ResponseEntity<List<Policy>>(policy, HttpStatus.OK);
			} else {

				responseEntity = new ResponseEntity<String>("No data is avialable", HttpStatus.OK);
			}
			return responseEntity;
		}
		
		@GetMapping("/get/{policy_number}")
		public ResponseEntity<?> getOne(@PathVariable Integer policy_number){
			
			ResponseEntity<?> responseEntity=null;
			Policy policy=service.getPolicyById(policy_number);
			if (policy!=null ) {
				responseEntity = new ResponseEntity<Policy>(policy, HttpStatus.OK);
			} else {
				responseEntity = new ResponseEntity<String>("Order Id "+policy_number+" is not avalable", HttpStatus.OK);
			}
			return responseEntity;
		}
		
		
		@PostMapping("/save")
		public ResponseEntity<?> save(@RequestBody Policy policy) {
			
			return new ResponseEntity<String>("Policy is saved with Id "+service.savePolicy(policy), HttpStatus.OK);
		}
		
		@PutMapping("/update")
		public ResponseEntity<?> update(@RequestBody Policy policy) {
			
			ResponseEntity<String> responseEntity=null;
			
			try {
				service.updatePolicy(policy);
				
				responseEntity=new ResponseEntity<String>("Policy "+policy.getPolicynumber()+" is updated.", HttpStatus.OK);
			} catch (Exception e) {
				
				responseEntity=new ResponseEntity<String>("Policy "+policy.getPolicynumber()+" is not updated.", HttpStatus.BAD_REQUEST);
				e.printStackTrace();
			}
			return responseEntity;
			
					}
		
	}

