package study;

public class Day14_9 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		/*
		 * tvArr�̶�� ���������� Tv��ü�� �迭�� ���� �� ���̱��� �������ݴϴ�. 
		 * �츮�� ���� ����� �迭 ���� ����� �����ϴ�. �迭 ���� ����� �ٽ� �ѹ� �������ּ���!
		 * tvArr.length = 3�Դϴ�. 
		 */
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv();
			//for���� �迭�� ����-1���� �ݺ��Ǹ鼭 0���� 2���� Tv��ü�� �����ؼ� 0��°...2��° �迭�� �������ݴϴ�.
			
			tvArr[i].channel = i+10;
			//�� �迭 ��� tvArr[i].channel�� i+10�� �����մϴ�.
		}
		for(int i = 0; i< tvArr.length; i++) {
			tvArr[i].channelUp(); // tvArr[i] ��� �� channelUp()�޼ҵ带 ȣ���ŵ�ϴ�.(����մϴ�) �׷� �� �迭 ����� channel���� 1�� �� �����մϴ�. 
			System.out.printf("tvArr[%d].channel = %d%n",i, tvArr[i].channel);//for���� �ݺ��Ǵ� ���� �� �迭 ��ҵ��� ä�� ���� ����մϴ�. 
		}
	}
}
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
}