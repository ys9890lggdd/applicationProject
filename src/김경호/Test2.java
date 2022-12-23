package 김경호;

public class Test2 {
	private int no;
	private String name;
	public Test2() {
		// TODO Auto-generated constructor stub
	}
	public Test2(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@Override
	public String toString() {
		return "Test [no=" + no + ", name=" + name + "]";
	}
	

}
