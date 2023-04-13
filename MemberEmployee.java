package lib;

import java.time.LocalDate;
import java.util.List;

//Kelas sebelumnya employee diubah menjadi MmeberEmployee untuk mengikuti penulisan PascalCase pada Java
public class MemberEmployee {

	//Telah dilakukan pengubahan variabel tipe data primitive menjadi lebih mudah untuk melakukan pengubahan/pengembangan
	private Person person;
	private Address address;
	private LocalDate dateJoined;
	private int monthWorkingInYear;
	private boolean isForeigner;
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
	private Spouse spouse;
	private List<Child> children;

	//Pengubahan long parameter menjadi lebih terstruktur dan mudah dipahami
	public MemberEmployee(Person person, Address address, LocalDate dateJoined, boolean isForeigner, int monthlySalary, int otherMonthlyIncome, int annualDeductible, Spouse spouse, List<Child> children) {
		this.person = person;
		this.address = address;
		this.dateJoined = dateJoined;
		this.isForeigner = isForeigner;
		this.monthlySalary = monthlySalary;
		this.otherMonthlyIncome = otherMonthlyIncome;
		this.annualDeductible = annualDeductible;
		this.spouse = spouse;
		this.children = children;
	}
	/*Penulisan variabel menggunakan camelCase karena menggunakan bahasa pemprograman java 
	 * Penulisan class menggunakan PascalCase sesuai dengan format penulisan yang benar untuk bahasa pemprograman java
	*/

	// Dilakukan getter dan setter class person 

	public static class Person {
		private String firstName;
		private String lastName;
		private String idNumber;
		private Gender gender;

		public Person(String firstName, String lastName, String idNumber, Gender gender) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
			this.gender = gender;
		}
	}
	public enum Gender {
		MALE,
		FEMALE
	}
	public static class Child {
		private String name;
		private String idNumber;

		public Child(String name, String idNumber) {
			this.name = name;
			this.idNumber = idNumber;
		}

	}
	public static class Spouse {
		private String name;
		private String idNumber;

		public Spouse(String name, String idNumber) {
			this.name = name;
			this.idNumber = idNumber;
		}
	}
	public static class Address {
		private String state;
		private String street;
		private String city;
		


		public Address(String street, String city, String state, String zipCode) {
			this.state = state;
			this.street = street;
			
			
		}
	}

}