/*�� ���α׷��� ��͸޼ҵ�� �ݺ��޼ҵ带 �̿��Ͽ� ���� ���� ���� �ִ� ���� 0�� ������ ���ϴ� ���α׷��Դϴ�.*/
package findzero;

import java.util.Scanner;		// ���� ������ �ޱ� ���� util ��Ű�� Scanner Ŭ������ ��������

public class findzero {			// ���� ������ �ް� 0�� ������ ������ֱ� ���� Ŭ������ �Ӹ���
	
	public static void main(String [] args) {	// main �޼ҵ��� �Ӹ���
		int num;								// ���� ���� ����
		System.out.print("���� ������ �Է��ϼ��� : ");		// "���� ������ �Է��ϼ��� : "�� ���
		Scanner scan = new Scanner(System.in);		// Scanner ��ü�� �����ϰ� scan�� �� ��ü�� ����Ű�� ��
		num = scan.nextInt();					// ���� ������ �Է¹ް� num ������ �Է��� ���� �Ҵ�����
		repeat(num);							// �ݺ� �޼ҵ带 ȣ��
		System.out.println("��� ��� : "+recursion(num) + "��");	// "��� ��� : "+recursion(num) + "��"�� ���
	}
	
	static void repeat(int num) {	// �ݺ� �޼ҵ��� �Ӹ���(�Ű� ������ num�� �޾���)
		int count = 0;				// 0�� ������ ī��Ʈ���ֱ� ���� ����( = 0 �� �Ἥ �ʱ�ȭ ����)
		while(num >= 10)			// ���������� 10�̻��̸� ��� �ݺ�����
		{
			if(num % 10 == 0) {		// ���� ������ 10���� ������ �� �������� 0�̶��
				count++;			// count������ 1�� ������
				num = num / 10;		// ���� ������ 10���� �������༭ ���ڸ��� �����ϰ� ���� 0�� ã����
			}else {					// ���� ������ 10���� ������ �� �������� 0�� �ƴ϶��
				num = num / 10;		// ���� ������ 10���� �������༭ ���ڸ��� �����ϰ� ���� 0�� ã����
			}
		}
		System.out.println("�ݺ� ��� : "+count+ "��");   //"�ݺ� ��� : "+count+ "��" �� ���
	}	
		
	static int recursion(int num){	// ��� �޼ҵ��� �Ӹ���(�Ű� ������ num�� �޾���)
		if(num < 10) {				// ���� ������ 10���� ������
			return 0;				// 0���� ��������
		}else {						// ���� ������ 10���� Ŭ��
			if(num % 10 == 0) {		// ���� ������ 10���� ����� �������� 0�̶��
				return recursion(num /10)+1;	// ���� ������ 10���� �����ָ鼭 ���ڸ��� �����ϰ� 1�� ������(ī��Ʈ ����)
			}else {					// ���� ������ 10���� ����� �������� 0�� �ƴ϶��
				return recursion(num / 10);		// ���� ������ 10���� �����ָ鼭 ���ڸ��� ������
			}
		}	
	}			
}