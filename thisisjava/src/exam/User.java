package exam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int no;
	private String id;
	private String pwd;
	private String name;
	
	public void setter(String id, String pwd, String name)
	{
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}


	public String toString() {
		return no + "\t" + id + "\t" + pwd + "\t" + name;
	}
	
	public void changingName(String name)
	{
		this.name = name;
	}
	
	public void changingPwd(String pwd)
	{
		this.pwd = pwd;
	}


}
