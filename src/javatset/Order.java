package javatset;

public class Order {
	public String orderNum;
	public String customerID;
	public String orderDate;
	public String customerName;
	public String productNum;
	public String ShippingAddress;
	
	public void orderInfo() {
		System.out.println("주문번호:" +orderNum);
		System.out.println("주문자 아이디:" +customerID);
		System.out.println("주문 날짜:" +orderDate);
		System.out.println("주문자 이름:" +customerName);
		System.out.println("주문상품 번호:" +productNum);
		System.out.println("배송 주소:" +ShippingAddress);
		
	}

public class OrderTset{
	public void main(String[] args) {
		Order order0001 = new Order();
		
		order0001.orderNum = "201907210001";
		order0001.customerID = "adc123";
		order0001.orderDate = "2019년 7월 21일";
		order0001.customerName = "홍길순";
		order0001.productNum = "PD-345-12";
		order0001.ShippingAddress = "서울시 영등포구 여의동 20번지";
		
		order0001.orderInfo();
		
		}
}
}