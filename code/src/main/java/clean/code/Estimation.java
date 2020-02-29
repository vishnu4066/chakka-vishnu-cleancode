package clean.code;

public class Estimation {
	int area = 0,type = 0;
	public Estimation(int type,int area) {
		this.type = type;
		this.area = area;
	}
	int costs[] = {1200,1500,1800,2500};
	
	public int costEstimation() {
		return costs[type-1]*area;
	}

}
