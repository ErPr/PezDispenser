
public class PezDispenser {
	
	private static final int MAX_PEZ = 12;
	
	private String mCharacterName;
	private int mPezCount;
	
	public PezDispenser (String name) {
		mCharacterName = name;
		mPezCount = 0;
	}
	
	public void load() {
		mPezCount = MAX_PEZ;
	}
	
	//getters
	public String getCharacterName() {
		return mCharacterName;
	}
	
}