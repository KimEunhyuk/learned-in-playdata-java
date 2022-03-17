package model.dto;

public class FirstT {
	
	private String FirstTName;
	
	private int FirstTFee;
	
	private int FirstTTimeRequired;

	public FirstT() {}
	public FirstT(String firstTName, int firstTFee, int firstTTimeRequired) {
		super();
		FirstTName = firstTName;
		FirstTFee = firstTFee;
		FirstTTimeRequired = firstTTimeRequired;
	}

	public String getFirstTName() {
		return FirstTName;
	}

	public void setFirstTName(String firstTName) {
		FirstTName = firstTName;
	}

	public int getFirstTFee() {
		return FirstTFee;
	}

	public void setFirstTFee(int firstTFee) {
		FirstTFee = firstTFee;
	}

	public int getFirstTTimeRequired() {
		return FirstTTimeRequired;
	}

	public void setFirstTTimeRequired(int firstTTimeRequired) {
		FirstTTimeRequired = firstTTimeRequired;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[ Ż�� : ");
		builder.append(FirstTName);
		builder.append(", ������ : ");
		builder.append(FirstTFee);
		builder.append(", �ҿ�ð� : ");
		builder.append(FirstTTimeRequired);
		builder.append(" ]");
		return builder.toString();
	}

}
