package hello;

import java.util.Scanner;

public class Day9_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 개발자 MBTI 결과 보기 ====");
		System.out.print("당신의 MBTI를 입력하세요: ");
		
		String mbti = sc.next();
		
		switch(mbti) {
		case "istj" :
		case "ISTJ":
			System.out.println("당신은 퍼블리셔형입니다!");
			break;
		case "entj" :
		case "ENTJ":
			System.out.println("당신은 아키텍쳐형입니다!");
			break;
		case "isfj", "ISFJ":
			System.out.println("당신은 보안전문가형입니다!");
			break;
		case "intj", "INTJ":
			System.out.println("당신은 데이터분석가형입니다!");
			break;
		case "enfp", "ENFP":
			System.out.println("당신은 AI형입니다!");
			break;
		case "entp", "ENTP":
			System.out.println("당신은 iOS형입니다!");
			break;
		case "esfj", "ESFJ":
			System.out.println("당신은 안드로이드형입니다!");
			break;
		case "esfp", "ESFP":
			System.out.println("당신은 게임 개발자형입니다!");
			break;
		case "estp", "ESTP":
			System.out.println("당신은 IoT 개발형입니다!");
			break;
		case "estj", "ESTJ":
			System.out.println("당신은 QA 형입니다!");
			break;
		case "infp", "INFP":
			System.out.println("당신은 블록체인형입니다!");
			break;
		case "istp", "ISTP":
			System.out.println("당신은 임베디드 개발자형입니다!");
			break;
		case "isfp", "ISFP":
			System.out.println("당신은 네트워크 개발자형입니다!");
			break;
		default:
			System.out.println("정확한 MBTI 유형이 아닙니다.");
       sc.close();
		}
	}
	}

