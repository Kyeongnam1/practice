import java.util.*;   // util ��Ű���� Ŭ������ ��������

public class Student {  // Student Ŭ������ �Ӹ���
   String StuName;		// �л� �̸��� �ޱ� ���� ����
   int HomeGrade;		// ���� ������ �ޱ� ���� ����
   int TestGrade;		// ���� ������ �ޱ� ���� ����
   
   
   public void setStuName() { // �л��� �̸��� �޴� �޼ҵ��� �Ӹ���
	  Scanner scan = new Scanner(System.in);	// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
      System.out.println("�л��� �̸��� �Է��϶�.");	// "�л��� �̸��� �Է��϶�." ���
      StuName = scan.nextLine();				// �Է¹��� �̸��� StuName�� ����
   }   
   
   public void setHomework(int Hscore) {	// ���� ������ �޴� �޼ҵ��� �Ӹ���
      while(true) {								// �ݺ����� �������� ������
         HomeGrade = Hscore;					// �Ű����� Hscore�� HomeGrade�� ����
         if(HomeGrade < 0 || HomeGrade > 100) {			// HomeGrade�� ���� 0���� �۰ų� 100���� ũ�ٸ�
            System.out.println("���� ������ 0���� �۰ų� 100���� ũ��.");		// "���� ������ 0���� �۰ų� 100���� ũ��." ���
            System.out.println(StuName+ "�� ���������� �ٽ� �Է��϶�.");	    // StuName"�� ���������� �ٽ� �Է��϶�." ��� �� �ٽ� �Է� ����
         }else {										// HomeGrade�� ���� 0�� 100���̶��
            break;										// �ݺ����� Ż���Ѵ�
         }
      }
   }
   
   public void setTest(int Tscore) {		// ���� ������ �޴� �޼ҵ��� �Ӹ���
      while(true) {								// �ݺ����� �������� ������
         TestGrade = Tscore;					// �Űܺ��� Tscore�� TestGrade�� ����
         if(TestGrade < 0 || TestGrade >100) {			// TestGrade�� ���� 0���� �۰ų� 100���� ũ�ٸ�
            System.out.println("���� ������ 0���� �۰ų� 100���� ũ��.");		// "���� ������ 0���� �۰ų� 100���� ũ��." ���
            System.out.println(StuName + "�� ���������� �ٽ� �Է��϶�.");	// StuName"�� ���������� �ٽ� �Է��϶�." ��� �� �ٽ� �Է� ����
         }else {										// TestGrade�� ���� 0�� 100���̶��
            break;										// �ݺ����� Ż���Ѵ�
         }   
      }   
   }

   public void inputGrades(){	// �л��� �̸�, ���� ����, ���������� �޴� �޼ҵ��� �Ӹ���
	  Scanner scan = new Scanner(System.in);	// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
	  System.out.println(StuName + "�� ���������� �Է��϶�.");	// StuName"�� ���������� �Է��϶�." ���
      setHomework(scan.nextInt());		// setHomework �޼ҵ带 ȣ��
      System.out.println(StuName + "�� ���������� �Է��϶�.");	// StuName"�� ���������� �Է��϶�." ���
      setTest(scan.nextInt());			// setTest �޼ҵ带 ȣ��
   }
   

   
   public double getTotal() {		// ������ ���� ������ �������� ��� �ϴ� �޼ҵ��� �Ӹ���
      return HomeGrade*0.4 + TestGrade*0.6;		// ���� �ݿ� �����°� ����Ͽ� ��ȯ����
   }
   
   public String getGrade(double total){	// ������ ����ϴ� �޼ҵ��� �Ӹ���
      String totalGrade;	// ������ �޴� ����
      if(total >= 90) {		// ������ 90�� �̻��̸�
         totalGrade = "A";					// ������ A�̴�
      }else if(total < 90 && total >= 80) {	// ������ 90�� �̸� 80�� �̻��̸�
         totalGrade = "B";					// ������ B�̴�
      }else if(total < 80 && total >= 70) {	// ������ 80�� �̸� 70�� �̻��̸�
         totalGrade = "C";					// ������ C�̴� 
      }else if(total < 70 && total >= 60) {	// ������ 70�� �̸� 60�� �̻��̸�
         totalGrade = "D";					// ������ D�̴�
      }else {								// �� ���� �������̶��
         totalGrade = "F";					// ������ F�̴�
      }
      return totalGrade;					// ������ ��ȯ
   }
   
   public String getStuName() {		// �л��̸��� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return StuName;				// �л��̸��� ��ȯ����
   }
   
   public int getHomework() {		// ���������� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return HomeGrade;				// ���������� ��ȯ����
   }
   
   public int getTest() {			// ���������� ��ȯ���ִ� �޼ҵ��� �Ӹ���
      return TestGrade;				// ���������� ��ȯ����
   }
   
   public void print() {			// �� ����� ������ִ� �޼ҵ��� �Ӹ���
         System.out.println(StuName + "�� ������" + getTotal() + "�̰� ������ " + getGrade(getTotal()) + "�̴�."); // StuName "�� ������"getTotal()"�̰� ������ "getGrade(getTotal())"�̴�." �������
      }
}