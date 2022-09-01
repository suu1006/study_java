package hello;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- 개발자 MBTI 결과 보기 ---");
		
		System.out.print("당신의 mbti를 입력하세요.>>");
		
		String mbti = sc.next(); //단어로 입력받기
		
		switch(mbti) {
		case "ADBD" :
			System.out.println("당신은 백엔드형이군요!");
		break;
		
		case "ENFJ","enfj":
			System.out.println("당신은 프론트엔드형이군요!");
		break;
	
		case "INFJ","infj":
			System.out.println("당신은 풀스택형이군요!");
		break;
		
		case "ISTJ","istj":
			System.out.println("당신은 퍼블리셔형이군요!");
		break;
		
		case "ENTJ","entj":
			System.out.println("당신은 아키텍쳐형이군요!");
		break;
		
		case "ISFJ","isfj":
			System.out.println("당신은 보안전문가형이군요!");
		break;
		
		case "INTJ","intj":
			System.out.println("당신은 데이터분석가형이군요!");
		break;
		
		case "ENFP","enfp":
			System.out.println("당신은 AI형이군요!");
		break;
		
		case "ENTP","entp":
			System.out.println("당신은 iOS형이군요!");
		break;
		
		case "ESFJ","esfj":
			System.out.println("당신은 안드로이드형이군요!");
		break;
		
		case "ESFP","esfp":
			System.out.println("당신은 게임개발자형이군요!");
		break;
		
		case "ESTP","estp":
			System.out.println("당신은 Iot개발자형이군요!");
		break;
		
		case "ESTJ", "estj" :
			System.out.println("당신은 QA형이군요!");
		break;
		
		case "INFP", "isfp" :
			System.out.println("당신은 블록체인형이군요!");
		break;
		
		case "ISTP", "istp" :
			System.out.println("당신은 임베디드 개발자형이군요!");
		break;
		
		case "ISFP", "isfp" :
			System.out.println("당신은 네트워크 개발자형이군요!");
		break;
		
		default:
			System.out.println("정확한 MBTI 유형을 적어주세요.");
		}
		
		
	}
}
