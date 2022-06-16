package org.java.inheritance2;

public class UpdateCommand extends ExcuteCommand {
	
	@Override
	public void updateDo() {
		System.out.println("~회원 수정~\n");
	}

}
