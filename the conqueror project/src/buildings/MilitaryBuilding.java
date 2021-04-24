package buildings;

public class MilitaryBuilding extends Building{

	private int recruitmentCost;
	private int currentRecruit;
	private int maxRecruit = 3;
	
	public MilitaryBuilding(int cost, int upgradeCost,int recruitmentCost)
	{
		super(cost, upgradeCost);
		this.recruitmentCost = recruitmentCost;
	}

	public int getRecruitmentCost() {
		return recruitmentCost;
	}

	public void setRecruitmentCost(int recruitmentCost) {
		this.recruitmentCost = recruitmentCost;
	}

	public int getCurrentRecruit() {
		return currentRecruit;
	}

	public void setCurrentRecruit(int currentRecruit) {
		this.currentRecruit = currentRecruit;
	}

	public int getMaxRecruit() {
		return maxRecruit;
	}
	
}