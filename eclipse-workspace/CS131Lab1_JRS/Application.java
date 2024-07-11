/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		System.out.println(npc.toString());//example npc
		
		NonPlayerCharacter npc2 = new NonPlayerCharacter("4145", "NEUTRAL", true, "AVERAGE");
		System.out.println(npc2.toString());
		
		
		System.out.println(npc.reportStructure());
		System.out.println(npc2.reportStructure());

	}//end main

}//end class