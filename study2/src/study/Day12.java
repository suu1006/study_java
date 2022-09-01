package ch4;

import java.util.*;

public class continueExample {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();

if (c*c == a*a+b*b) {
	System.out.println("직각삼각형입니다.");
} else if (c*c != a*a+b*b) {
	System.out.println("직각삼각형 아닙니다.");
}
	