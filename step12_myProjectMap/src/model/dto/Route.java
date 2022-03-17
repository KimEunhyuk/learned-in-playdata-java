package model.dto;

public class Route {
	
	private String RouteName;	

	private FirstT projectFirstT;
	
	private SecondT projectSecondT;
	
	public Route() {}	
	public Route(String routeName, FirstT projectFirstT, SecondT projectSecondT, int totalFee, int totalTime) {
		super();
		RouteName = routeName;
		this.projectFirstT = projectFirstT;
		this.projectSecondT = projectSecondT;
	}

	public String getRouteName() {
		return RouteName;
	}

	public void setRouteName(String routeName) {
		RouteName = routeName;
	}

	public FirstT getProjectFirstT() {
		return projectFirstT;
	}

	public void setProjectFirstT(FirstT projectFirstT) {
		this.projectFirstT = projectFirstT;
	}

	public SecondT getProjectSecondT() {
		return projectSecondT;
	}

	public void setProjectSecondT(SecondT projectSecondT) {
		this.projectSecondT = projectSecondT;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" ��Ʈ�� : ");
		builder.append(RouteName);
		builder.append(", ù ��° ������� : ");
		builder.append(projectFirstT);
		builder.append(", �� ��° ������� : ");
		builder.append(projectSecondT);
		builder.append(", �ѿ�� : [ ");
		builder.append(getProjectFirstT().getFirstTFee() + getProjectSecondT().getSecondTFee());
		builder.append(" ], �Ѽҿ�ð� : [ ");
		builder.append(getProjectFirstT().getFirstTTimeRequired() + getProjectSecondT().getSecondTTimeRequired());
		builder.append(" ]");
		return builder.toString();
	}
	

}
