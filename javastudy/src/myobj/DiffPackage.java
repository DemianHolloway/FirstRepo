package myobj;

public class DiffPackage {

	
	public int public_var = 1;
	int default_var = 2;
	protected int protected_var = 1;
	private int private_var = 1;
	
	public void public_method() {
		System.out.println(public_var);
		System.out.println(default_var);
		System.out.println(protected_var);
		System.out.println(private_var);
	}
	void dafault_method() {}
	protected void protected_method() {}
	private void private_method() {}
	
}
