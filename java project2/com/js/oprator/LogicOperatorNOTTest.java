package com.js.oprator;

public class LogicOperatorNOTTest {
// ! �����������ڴ� �ǹ����� ���� ���� ����!
	public static void main(String[] args) {
		boolean isOnNoteBook = true;
		
		if (!isOnNoteBook) { // !isOnNoteBook�� isOnNoteBook==false�� Ǯ� ��밡��
			// if(isOnNoteBook) �� isOnNoteBook==true�� Ǯ� ��밡��
			System.out.println("NoteBook is OFF");
		} else {
			System.out.println("NoteBook is ON");
		}
	}

}
