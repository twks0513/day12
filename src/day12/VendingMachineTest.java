package day12;

import java.util.*;

public class VendingMachineTest {
	// ����ȭ�����
	Scanner scan = new Scanner(System.in);
	LinkedHashMap menumap = new LinkedHashMap();
	private String menu;
	private int price;
	int money =0;
	public void print() {
		
	      menumap.put("�Ƹ޸�ī��", 2500);
	      menumap.put("ī���", 3000);
	      menumap.put("�ٴҶ��", 3500);
	      menumap.put("���ڶ�", 3000);
		String password = "1234";
		while(true) {
			System.out.println("===== ���Ǳ� ���α׷� =====");
			System.out.println("���Ͻô� ���񽺸� �����ּ���");
			System.out.println("1. ��ǰ ����");
			System.out.println("2. ���Ǳ� ����");
			System.out.println("3. ���α׷� ����");
			System.out.print(">>>>");
			int choice=scan.nextInt();
			scan.nextLine();
			
			if(choice==1) { // ���� ���ȭ������ �̵�
				customerPrint();
			}else if(choice ==2) { //�����ڿ� ���ȭ������ �̵�
				System.out.println("��й�ȣ�� 1234 �Դϴ�");
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				String UserPW = scan.next();
				if(UserPW.equals(password)) {
					managerPrint();
				}else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
					System.out.println("���� ȭ������ ���ư��ϴ�");
					continue;
				}
			}else if(choice ==3) {
				System.out.println("���Ǳ� ���α׷��� �����մϴ�");
				break;
			}
		}
	}
	

	// �����ڿ�ȭ�����
	public void managerPrint() {
		while(true) {
			System.out.println("===== SETUP =====");
			System.out.println("1.�޴��߰�");
			System.out.println("2.�޴�����");
			System.out.println("3.����");
			System.out.print(">>>> ");
			int mchoice = scan.nextInt();
			if(mchoice == 1) { // �޴��߰�
				addMenu();
				continue;
			}else if(mchoice == 2) { //�޴�����
				editMenu();
				continue;
			}else if(mchoice ==3) { //����
				System.out.println("�����ڸ�带 �����մϴ�");
				System.out.println("���� ȭ������ �ǵ��ư��ϴ�");
				print();
				break;
			}
		}
	}
	// �޴��߰�
	public void addMenu() {
		System.out.println("�޴��� �߰��մϴ�");
		System.out.println("�߰��� �޴��� �̸��� �Է��ϼ���");
		System.out.print(">>>>");
		menu = scan.next();
		System.out.println(menu+"�� ������ �Է��ϼ���");
		System.out.print(">>>>");
		price = scan.nextInt();
		menumap.put(menu, price);
		
		System.out.println("�޴��� �߰��Ǿ����ϴ�");
	}
	
	// �޴�����
	public void editMenu() {
		while(true) {
			System.out.println("==== �޴� ���� ====");
			System.out.println(menumap.keySet());
			System.out.println("������ �޴��� �Է����ּ���");
			System.out.print(">>>> ");
			String modimenu = scan.next();			
			if(menumap.containsKey(modimenu)) { //�޴��� ������
				System.out.println("�����Ͻ� ��ǰ�� "+modimenu+"|"+menumap.get(modimenu)+"�� �Դϴ�.");
				System.out.println("1. ���� ����");
				System.out.println("2. ��ǰ ����");
				System.out.println("3. ����");
				System.out.print(">>>> ");
				int modichoice = scan.nextInt();
				if(modichoice ==1) { // ���ݼ���
					System.out.println("������ ������ �Է����ּ���");
					System.out.print("���簡��"+menumap.get(modimenu)+"�� "+">>>> ");
					int modiprice = scan.nextInt();
					menumap.put(modimenu, modiprice);
					System.out.println("������ �Ϸ�Ǿ����ϴ�");
				}else if(modichoice ==2) { // �޴�����
					System.out.println(modimenu+"�� �����մϴ�");
					menumap.remove(modimenu);
					System.out.println("�����Ǿ����ϴ�");
				}else if(modichoice ==3) { // ����
					System.out.println("�޴������� �����մϴ�");
					break;
				}			
			}else{ // �޴��� ������
				System.out.println(modimenu+"�� ��ϵ��� ���� ��ǰ�Դϴ�");
				System.out.println("���� ȭ������ �̵��մϴ�.");
				break;
			}
		}
		
	}
	
	// ����ȭ�����
	public void customerPrint() {
		int a=0;
		Iterator it = menumap.keySet().iterator();
		while(true) {
			System.out.println("==== ���Ǳ� ====");
			printMoney(a);
			System.out.println("���񽺸� �����ϼ���");
			System.out.println("1. �ݾ� ����");
			System.out.println("2. �޴� ����");
			System.out.println("3. �ܵ���ȯ");
			System.out.println("4. ����");
			System.out.print(">>>> ");
			int userchoice = scan.nextInt();
			if(userchoice == 1) {
				a = insertMoney();
						
			}else if(userchoice == 2) {
				if(menumap.isEmpty()) {
					System.out.println("��ϵ� �޴��� �����ϴ�");
					System.out.println("�����ڿ��� �����ϼ���");
				}else if(menumap.isEmpty() == false){				
					System.out.println("===== MENU =====");
					System.out.println("�޴��� �������ּ���\n");
					printMoney(a);
					System.out.println("================");					
				
					while(it.hasNext()) {
						String inmenu = (String) it.next();
						System.out.println(inmenu+" "+menumap.get(inmenu)+"��");										
					}
					System.out.println("�޴��Է�");
					System.out.print(">>> ");
					String choice = scan.next();
					
					int buychoice;
									
					if(menumap.containsKey(choice)==false) {
						System.out.println("�޴��� �����ϴ�");
					}else if(menumap.containsKey(choice)) {
						System.out.println("�����Ͻ� �޴��� "+choice+"�Դϴ�");
						System.out.println("������ "+menumap.get(choice)+"�� �Դϴ�");
						System.out.println("���� �Ͻðڽ��ϱ�?");
						System.out.println("1. ����");
						System.out.println("2. ���");
						System.out.print(">>> ");
						buychoice = scan.nextInt();  
						if(buychoice == 1) {
							if(a>=(int)menumap.get(choice)) {
								System.out.println("���Ű� �Ϸ�Ǿ����ϴ�. �����մϴ�.");
								a-=(int)menumap.get(choice);
								continue;
							}else {
								System.out.println("�ܾ��� �����մϴ�.");
								continue;
							}
						}else if(buychoice ==2) {
							System.out.println("���Ÿ� ����մϴ�");
							continue;
						}
					}
					
					
				}	 			 				 
			}else if(userchoice == 3) {
				System.out.println("�ܵ��� ��ȯ�մϴ�");
				a=0;
				money = 0;
			}else if(userchoice == 4) {
				System.out.println("�����մϴ�");
				System.out.println("���� ȭ������ �̵��մϴ�");
				break;
			}
			
		}
	}

	
	
	// �ݾ�����
	public int insertMoney() {
		
		System.out.println("==== �ݾ��� �������ֽʽÿ� ===");
		System.out.println("���� ���Աݾ� : "+money+"��");
		System.out.println("�ݾ� ����");
		System.out.print(">>> ");
		int addmoney = scan.nextInt();	
		money+=addmoney;
		return money;
	}
	// ���Աݾ����
	public void printMoney(int money) {
		
		System.out.println("���� ���Աݾ��� "+money+"�� �Դϴ�");
	}

}
