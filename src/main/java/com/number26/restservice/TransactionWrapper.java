package com.number26.restservice;
import com.number26.restservice.TransactionData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionWrapper {
	Long transaction_id;	
	TransactionData transaction;
}
