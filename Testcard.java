package problem3;

public class Testcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
				TravelCard tc=new TravelCard();
				System.out.println("The reward points you earned are "+tc.getRewardPoints(100));
				System.out.println("Congratulations,you have successfully recharged with "+tc.rechrgeCard(50000));
				System.out.println(tc.swipeCard(20));
				System.out.println(tc.travelSwipe(10));
				
				tc.setCardNo(5634272);
				tc.setSwipeLimit(67400);
			
				System.out.println("Your Card Number is "+tc.getCardNo());
				System.out.println("Your Daily Swipe limit is "+tc.getSwipeLimit());
			}

		}
	