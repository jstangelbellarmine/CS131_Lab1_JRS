import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {//begin class
	
	private boolean active = false;//instance variable
	private String intelligenceType;//instance variable
	public String introduce;
	public String exclaim;
	
	public NonPlayerCharacter()
	{//begin empty argument-constructor
		
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) 
	{
		this.personality= personality;
		this.active= false;
		this.intelligenceType= intelligenceType;
		
	}//preferred constructor 
	/*
	 * I tried this at first: 
	public String reportStructure()
	
	{
		super.reportStructure();	
	}
	 */
	public String reportStructure(){
		
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		
		return sb.toString();
	}//end reportStats
	
	public String introduce() {
		
		this.introduce = introduce;
		return introduce;
		
	}
	
	public String exclaim() {
		this.exclaim = exclaim;
		return exclaim.toString();
	}
	//Getters / Setters
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getExclaim() {
		return exclaim;
	}

	public void setExclaim(String exclaim) {
		this.exclaim = exclaim;
	}

	@Override
	public String toString() {
		return "NonPlayerCharacter [active=" + active + ", intelligenceType=" + intelligenceType + ", introduce="
				+ introduce + ", exclaim=" + exclaim + ", reportStructure()=" + reportStructure() + "]";
	}
	
	//end getters/setters

}//end class
