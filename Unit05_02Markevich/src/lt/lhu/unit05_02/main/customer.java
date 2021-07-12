package lt.lhu.unit05_02.main;

public class customer implements Comparable<customer> {

	private String ID;
	private String name;
	private String surname;
	private String middle_name;
	private String address;
	private String card_number;
	private String bank_account;

	public customer() {
		ID = "0000000000";
		name = "Алеся";
		surname = "Змитрович";
		middle_name = "Евгеньевна";
		address = "Минск, Янки Купалы 4";
		card_number = "5678 7485 9876 8947";
		bank_account = "LT000000000000000000";

	}

	public customer(String ID, String name, String surname, String middle_name, String address, String card_number,
			String bank_account) {
		ID = ID;
		name = name;
		surname = surname;
		middle_name = middle_name;
		address = address;
		card_number = card_number;
		bank_account = bank_account;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getBank_account() {
		return bank_account;
	}

	public void setBank_account(String bank_account) {
		this.bank_account = bank_account;
	}

	@Override
	public int compareTo(customer o) {
		// TODO Auto-generated method stub
		return getSurname().compareTo(o.getSurname());
	}

}
