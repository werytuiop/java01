package org.java.inheritance2;

public class SelectCommand extends ExcuteCommand {
	
	@Override
	public void selectDo() {
		System.out.println("~회원 조회~\n");
	}

}
