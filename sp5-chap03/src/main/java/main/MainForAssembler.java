package main;

import java.io.IOException;
import java.util.Scanner;
import assembler.*;
import spring.*;
public class MainForAssembler {
	
	
	
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("명령어를 입력하세요");
			String command = scanner.nextLine();
			if(command.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			if(command.startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			}
			else if(command.startsWith("change ")) {
				processChangeCommand(command.split(" "));
				continue;
			}
				
		}
	}
	
	private static Assembler assembler = new Assembler();
	private static void processNewCommand(String[] args) {
		MemberRegisterService regSvc = assembler.getRegSvc();
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		if(!req.isPasswordEqualToConfirmPassword()) {
			System.out.println("암호와 확인 일치 x");
			return;
		}
		try {
			regSvc.regist(req);
			System.out.println("등록되었습니다\n");
		}
		catch(DuplicateMemberException e){
			System.out.println("중복된 이메일 입니다\n");
		}
	}
	
	private static void processChangeCommand(String[] args) {
		ChangePasswordService pwdSvc= assembler.getPwdSvc();
		try {
			pwdSvc.changePassword(args[1], args[2], args[3]);
			System.out.println("암호를 변경했습니다\n");
		}
		catch(MemberNotFoundException e){
			System.out.println("존재하지 않는 이메일 입니다\n");
		}
	}
	
}
