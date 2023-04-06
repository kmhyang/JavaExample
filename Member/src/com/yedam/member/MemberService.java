package com.yedam.member;

import java.util.List;
import java.util.Scanner;

public class MemberService {
//	impl = service
//	로그인 되어 있는지, 안 되어있는지
//	로그인, 메뉴를 이동할 때마다 그 로그인 정보가 남아있어야 한다.
//	정적 멤버(static)
//	1. login
//	<로그인 성공>
//	login -> id/pw -> 정보 조회 성공 -> 로그인
//	로그인 -> 정적 필드에게 로그인한 정보를 입력
//	<로그인 실패>
//	정보 조회 실패 -> 정적 필드에 데이터 안 넣어준다.
	
	public static Member memberInfo = null;
	//null : 로그인X (맴버 정보가 없기 때문)
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		//id 입력
		System.out.println("ID 입력> ");
		String id = sc.nextLine();
		System.out.println("PW 입력> ");
		String pw = sc.nextLine();
		
		//1. member == null : id 없음
		//2. member != null : 회원정보 있음
		
		Member member = MemberDAO.getInstance().login(id);
		
		if(member!= null) {
			//로그인 O-> 입력한 pw와 회원가입 시 저장된 회원정보와 동일한지 확인
			if(member.getPw().equals(pw)) {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(member.getName()+"님 환영합니다.");
				memberInfo = member;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
	}
	
	
	public void logout() {
		memberInfo = null;
		System.out.println("로그아웃 성공");
	}
	
	
//	전체 조회
	public void getMemberList() {
		List<Member> list = MemberDAO.getInstance().getMemberList();
		
		for(Member member : list) {
			System.out.println("ID : "+member.getId());
			System.out.println("PW : "+member.getPw());
			System.out.println("이름 : "+member.getName());
		}
	}
	
//	회원등록
	public void memAdd() {
		String id = "";
		
		
		//id 중복 확인 -> 중복 되지 않을때까지 계속 조회
		while(true) {
			System.out.println("ID> ");
			id = sc.nextLine();
			if(id.length() > 3) {
				Member member = MemberDAO.getInstance().login(id);
				//if(MemberDAO.getInstance().login(id)==null) : if문 안에 메소드 넣어서 비교할 경우 ==> 실행해서 비교하는 동작이 됨.
				if(member==null) {
					System.out.println("회원 가입 가능");
					break;
				}else {
					System.out.println("ID 중복, 다시 입력");
				}
			}else {
				System.out.println("3글자 이상 id를 입력하세요");
			}
		}
			System.out.println("PW> ");
			String pw = sc.nextLine();
			
			System.out.println("이름> ");
			String name = sc.nextLine();
			
			
			Member member = new Member();
			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			
			int result = MemberDAO.getInstance().memAdd(member);
			
			if(result == 1) {
				System.out.println("회원 등록 성공");
			}else {
				System.out.println("회원 등록 실패");
			}
			
	}
	
//	회원 수정
//	login 되어있는 사람의  수정 하는지 -> 실시간으로 로그인된 정보도 바꿔줘야 한다.
//	login 안 되어있는 사람의 수정하는지
	
	public void memUpdate() {
		//비밀번호 수정
//		System.out.println("현재 PW>");
//		String oldPw = sc.nextLine();
//		
//		System.out.println("수정할 PW>");
//		String newPw = sc.nextLine();
		
		System.out.println("ID> ");
		String id = sc.nextLine();
		System.out.println("PW> ");
		String pw = sc.nextLine();
		
		Member member = new Member();
		member.setId(id);
		member.setPw(pw);
		
		int result = MemberDAO.getInstance().memUpdate(member);
		//DB 로그인 정보가 성공적으로 바꼈는지 확인하고 140줄 로그인 정보 실시간 업데이트
		
		if(result > 0) {
			//실시간으로 로그인 된 정보 바꿔주기
			//입력한 id 와 login 정보의 id 비교
			//---> 아이디 동일 --> pw 변경 정보 수정
			if(id.equals(memberInfo.getId())){
				memberInfo = MemberDAO.getInstance().login(id);
			}
		}else {	
			System.out.println("PW 변경 실패");
		}
	}
	
	public void memDel() {
		System.out.println("삭제할 ID 입력> ");
		String id = sc.nextLine();
		
		int result = MemberDAO.getInstance().memDel(id);
		
		if(result > 0) {
			if(id.equals(memberInfo.getId())){
				memberInfo = null;
			}else {
				System.out.println("삭제 완료");
			}
		}
		
	}
	
	
	
	
	
	
	
	
}
