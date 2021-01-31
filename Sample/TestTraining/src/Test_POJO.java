
public class Test_POJO {
	
	private String str;
	private int abc = 0;
	private boolean b = false;
	
	
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "str=" + str + ", abc=" + abc + ", b=" + b + "";
	}

}
