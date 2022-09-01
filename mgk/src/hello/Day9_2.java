package hello;

import java.util.Scanner;

public class Day9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== ������ MBTI ��� ���� ====");
		System.out.print("����� MBTI�� �Է��ϼ���: ");
		
		String mbti = sc.next();
		
		switch(mbti) {
		case "istj" :
		case "ISTJ":
			System.out.println("����� �ۺ������Դϴ�!");
			break;
		case "entj" :
		case "ENTJ":
			System.out.println("����� ��Ű�������Դϴ�!");
			break;
		case "isfj", "ISFJ":
			System.out.println("����� �������������Դϴ�!");
			break;
		case "intj", "INTJ":
			System.out.println("����� �����ͺм������Դϴ�!");
			break;
		case "enfp", "ENFP":
			System.out.println("����� AI���Դϴ�!");
			break;
		case "entp", "ENTP":
			System.out.println("����� iOS���Դϴ�!");
			break;
		case "esfj", "ESFJ":
			System.out.println("����� �ȵ���̵����Դϴ�!");
			break;
		case "esfp", "ESFP":
			System.out.println("����� ���� ���������Դϴ�!");
			break;
		case "estp", "ESTP":
			System.out.println("����� IoT �������Դϴ�!");
			break;
		case "estj", "ESTJ":
			System.out.println("����� QA ���Դϴ�!");
			break;
		case "infp", "INFP":
			System.out.println("����� ���ü�����Դϴ�!");
			break;
		case "istp", "ISTP":
			System.out.println("����� �Ӻ���� ���������Դϴ�!");
			break;
		case "isfp", "ISFP":
			System.out.println("����� ��Ʈ��ũ ���������Դϴ�!");
			break;
		default:
			System.out.println("��Ȯ�� MBTI ������ �ƴմϴ�.");
       sc.close();
		}
	}
	}

