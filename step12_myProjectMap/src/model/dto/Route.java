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
		builder.append(" 루트명 : ");
		builder.append(RouteName);
		builder.append(", 첫 번째 교통수단 : ");
		builder.append(projectFirstT);
		builder.append(", 두 번째 교통수단 : ");
		builder.append(projectSecondT);
		builder.append(", 총요금 : [ ");
		builder.append(getProjectFirstT().getFirstTFee() + getProjectSecondT().getSecondTFee());
		builder.append(" ], 총소요시간 : [ ");
		builder.append(getProjectFirstT().getFirstTTimeRequired() + getProjectSecondT().getSecondTTimeRequired());
		builder.append(" ]");
		return builder.toString();
	}
	

}
