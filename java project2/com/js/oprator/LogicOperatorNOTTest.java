package com.js.oprator;

public class LogicOperatorNOTTest {
// ! 논리부정연산자는 실무에서 가장 많이 사용됨!
	public static void main(String[] args) {
		boolean isOnNoteBook = true;
		
		if (!isOnNoteBook) { // !isOnNoteBook은 isOnNoteBook==false로 풀어서 사용가능
			// if(isOnNoteBook) 은 isOnNoteBook==true로 풀어서 사용가능
			System.out.println("NoteBook is OFF");
		} else {
			System.out.println("NoteBook is ON");
		}
	}

}
