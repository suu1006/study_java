package com.je.refertype;

public class StringReferTest {

	public static void main(String[] args) {
		String SampleA = new String("Lee");
		String SampleB = new String("Lee");
//		
//		if (SampleA == SampleB) {
//			System.out.println("sampleA == sampleB");
//		} else { System.out.println("sampleA != sampleB");
//		}
//	}
//}

if (SampleA.equals(SampleB)) { // 문자열 비교는 .equals 사용 
		System.out.println("SampleA SampleB is Same");
} else { System.out.println("SampleA sampleB is not same");
		}
	}
}