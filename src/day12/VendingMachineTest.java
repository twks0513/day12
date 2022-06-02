package day12;

import java.util.*;

public class VendingMachineTest {
	// 최초화면출력
	Scanner scan = new Scanner(System.in);
	LinkedHashMap menumap = new LinkedHashMap();
	private String menu,price;
	
	public void print() {
		
	      menumap.put("아메리카노", "2500");
	      menumap.put("카페라떼", "3000");
	      menumap.put("바닐라라떼", "3500");
	      menumap.put("초코라떼", "3000");
		String password = "1234";
		while(true) {
			System.out.println("===== 자판기 프로그램 =====");
			System.out.println("원하시는 서비스를 눌러주세요");
			System.out.println("1. 물품 구매");
			System.out.println("2. 자판기 관리");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>>>");
			int choice=scan.nextInt();
			scan.nextLine();
			
			if(choice==1) { // 고객용 출력화면으로 이동
				customerPrint();
			}else if(choice ==2) { //관리자용 출력화면으로 이동
				System.out.println("비밀번호는 1234 입니다");
				System.out.print("비밀번호를 입력하세요 : ");
				String UserPW = scan.next();
				if(UserPW.equals(password)) {
					managerPrint();
				}else {
					System.out.println("비밀번호가 틀렸습니다");
					System.out.println("이전 화면으로 돌아갑니다");
					continue;
				}
			}
		}
	}
	

	// 관리자용화면출력
	public void managerPrint() {
		while(true) {
			System.out.println("===== SETUP =====");
			System.out.println("1.메뉴추가");
			System.out.println("2.메뉴수정");
			System.out.println("3.종료");
			System.out.print(">>>> ");
			int mchoice = scan.nextInt();
			if(mchoice == 1) { // 메뉴추가
				addMenu();
				continue;
			}else if(mchoice == 2) { //메뉴수정
				editMenu();
				continue;
			}else if(mchoice ==3) { //종료
				System.out.println("관리자모드를 종료합니다");
				System.out.println("이전화면으로 되돌아갑니다");
				print();
				break;
			}
		}
	}
	// 메뉴추가
	public void addMenu() {
		System.out.println("메뉴를 추가합니다");
		System.out.println("추가할 메뉴의 이름을 입력하세요");
		System.out.print(">>>>");
		menu = scan.next();
		System.out.println(menu+"의 가격을 입력하세요");
		System.out.print(">>>>");
		price = scan.next();
		menumap.put(menu, price);
		
		System.out.println("메뉴가 추가되었습니다");
	}
	
	// 메뉴수정
	public void editMenu() {
		while(true) {
			System.out.println("==== 메뉴 수정 ====");
			System.out.println(menumap.keySet());
			System.out.println("수정할 메뉴를 입력해주세요");
			System.out.print(">>>> ");
			String modimenu = scan.next();			
			if(menumap.containsKey(modimenu)) { //메뉴가 있을때
				System.out.println("선택하신 제품은 "+modimenu+"|"+menumap.get(modimenu)+"원 입니다.");
				System.out.println("1. 가격 수정");
				System.out.println("2. 제품 삭제");
				System.out.println("3. 종료");
				System.out.print(">>>> ");
				int modichoice = scan.nextInt();
				if(modichoice ==1) { // 가격수정
					System.out.println("수정할 가격을 입력해주세요");
					System.out.print("현재가격"+menumap.get(modimenu)+"원 "+">>>> ");
					String modiprice = scan.next();
					menumap.put(modimenu, modiprice);
					System.out.println("수정이 완료되었습니다");
				}else if(modichoice ==2) { // 메뉴삭제
					System.out.println(modimenu+"를 삭제합니다");
					menumap.remove(modimenu);
					System.out.println("삭제되었습니다");
				}else if(modichoice ==3) { // 종료
					System.out.println("메뉴수정을 종료합니다");
					break;
				}			
			}else{ // 메뉴가 없을때
				System.out.println(modimenu+"는 등록되지 않은 제품입니다");
				System.out.println("이전 페이지로 이동합니다.");
				break;
			}
		}
		
	}
	
	// 고객용화면출력
	public void customerPrint() {
		Iterator it = menumap.keySet().iterator();
		if(menumap.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다");
			System.out.println("관리자에게 문의하세요");
		}else{	
			
			System.out.println("===== MENU =====");
			System.out.println("메뉴를 선택해주세요\n");
			System.out.println("================");
			int i=1;

			 while(it.hasNext()) {
				String inmenu = (String) it.next();
				System.out.println(i+". "+inmenu+"\t"+menumap.get(inmenu)+"원");
				i++;				
			 }
			 System.out.println("메뉴입력");
			 int choice = scan.nextInt();
			 
			 ArrayList menulist = new ArrayList();
			 for(int j = 0;j<menumap.size();j++) {
				 menulist.add(j, (String)it.next());
				 System.out.println(menulist);
			 }
			 if(choice ==1) {
				 System.out.println("선택하신 메뉴는 "+menulist.get(0)+"입니다");
				 System.out.println("가격은 "+menumap.get(menulist.get(0)));
				 
			 }
		}

	}
	// 금액계산
	
	// 잔돈반환
	
}
