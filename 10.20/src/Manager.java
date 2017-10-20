
class Manager extends Employee {
	private String position; 

	public Manager(String empNo, String name, String part, String position) {
		super(empNo, name, part);
		this.position = position;
	}

	public String resultStr() {
		String result = super.resultStr();
		result += "Á÷Ã¥ : " + position + "\n";
		return result;
	}
}

