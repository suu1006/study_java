package hello;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- ������ MBTI ��� ���� ---");
		
		System.out.print("����� mbti�� �Է��ϼ���.>>");
		
		String mbti = sc.next(); //�ܾ�� �Է¹ޱ�
		
		switch(mbti) {
		case "ADBD" :
			System.out.println("����� �鿣�����̱���!");
		break;
		
		case "ENFJ","enfj":
			System.out.println("����� ����Ʈ�������̱���!");
		break;
	
		case "INFJ","infj":
			System.out.println("����� Ǯ�������̱���!");
		break;
		
		case "ISTJ","istj":
			System.out.println("����� �ۺ������̱���!");
		break;
		
		case "ENTJ","entj":
			System.out.println("����� ��Ű�������̱���!");
		break;
		
		case "ISFJ","isfj":
			System.out.println("����� �������������̱���!");
		break;
		
		case "INTJ","intj":
			System.out.println("����� �����ͺм������̱���!");
		break;
		
		case "ENFP","enfp":
			System.out.println("����� AI���̱���!");
		break;
		
		case "ENTP","entp":
			System.out.println("����� iOS���̱���!");
		break;
		
		case "ESFJ","esfj":
			System.out.println("����� �ȵ���̵����̱���!");
		break;
		
		case "ESFP","esfp":
			System.out.println("����� ���Ӱ��������̱���!");
		break;
		
		case "ESTP","estp":
			System.out.println("����� Iot���������̱���!");
		break;
		
		case "ESTJ", "estj" :
			System.out.println("����� QA���̱���!");
		break;
		
		case "INFP", "isfp" :
			System.out.println("����� ���ü�����̱���!");
		break;
		
		case "ISTP", "istp" :
			System.out.println("����� �Ӻ���� ���������̱���!");
		break;
		
		case "ISFP", "isfp" :
			System.out.println("����� ��Ʈ��ũ ���������̱���!");
		break;
		
		default:
			System.out.println("��Ȯ�� MBTI ������ �����ּ���.");
		}
		
		
	}
}
