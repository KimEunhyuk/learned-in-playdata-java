package model.dto;

public class SecondT {
	
	private String SecondTName;
	
	private int SecondTFee;
	
	private int SecondTTimeRequired;

	public SecondT() {}
	public SecondT(String secondTName, int secondTFee, int secondTTimeRequired) {
		super();
		SecondTName = secondTName;
		SecondTFee = secondTFee;
		SecondTTimeRequired = secondTTimeRequired;
	}

	public String getSecondTName() {
		return SecondTName;
	}

	public void setSecondTName(String secondTName) {
		SecondTName = secondTName;
	}

	public int getSecondTFee() {
		return SecondTFee;
	}

	public void setSecondTFee(int secondTFee) {
		SecondTFee = secondTFee;
	}

	public int getSecondTTimeRequired() {
		return SecondTTimeRequired;
	}

	public void setSecondTTimeRequired(int secondTTimeRequired) {
		SecondTTimeRequired = secondTTimeRequired;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ Ż�� : ");
		builder.append(SecondTName);
		builder.append(", ������ : ");
		builder.append(SecondTFee);
		builder.append(", �ҿ�ð� : ");
		builder.append(SecondTTimeRequired);
		builder.append(" ]");
		return builder.toString();
	}

}
