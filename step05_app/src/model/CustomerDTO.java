package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CustomerDTO {

	private String name;
	private int price;
	private String color;
	private char condition; //good, bad
	
}
