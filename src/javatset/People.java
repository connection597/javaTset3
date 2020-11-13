//Q1.다음 객체에 대한 설명에 맞는 클래스를 만들고 값을 출력해 보세요.
//나이가30살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
package javatset;

public class People {
	
	public int age;
	public String name;
	public boolean isMarried;
	public int children;
	
	public void peopleinfo() {
		System.out.println("나이: " + age);
		System.out.println("이름: " + name);
		System.out.println("결혼여부: " + isMarried);
		System.out.println("자녀 수: " + children);
	}
	
	public class PeopleTset{
		public void main (String[]args) {
			People peopleJames = new People();
			
			peopleJames.age = 40;
			peopleJames.name = "James";
			peopleJames.isMarried = true;
			peopleJames.children = 3;
			
			peopleJames.peopleinfo();
			
		}
	}

}
