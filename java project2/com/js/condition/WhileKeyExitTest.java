package com.js.condition;

import java.io.IOException;

public class WhileKeyExitTest {

	public static void main(String[] args) throws IOException {
		boolean isRun = true;
		int keyCode =0;
		
		while (isRun) {
			keyCode = System.in.read(); //Ű�� �Է� �޽��ϴ�.
			
			if(keyCode  == 49) { //����1�� Ű�ڵ�
				isRun = false; //while Ż�� / ���ǹ��� �����̸� ��������
			} else { System.out.println("keyCode value is " + keyCode);
		}

	} System.out.println("Program is End");

	}
}