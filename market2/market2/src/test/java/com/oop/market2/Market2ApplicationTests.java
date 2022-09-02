package com.oop.market2;

import com.oop.market2.condition.CardCondition;
import com.oop.market2.condition.NoneCondition;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class Market2ApplicationTests {

	@Test
	void contextLoads() {


		Market market = new Market(new Storage());

		Payment samsungCard = new Payment("SamsungCard");
		Payment lotteCard = new Payment("lotteCard");

		Item merona = new IceCream( 0, 10 , 1000 , "merona" , new NoneCondition());
		Item meronaDis = new IceCream( 1, 10 , 1000 , "meronaDis" , new CardCondition("samsungCard" , samsungCard , 10));


		Item homeRunBall = new Snack( 2, 10 , 1500 , "homeRunBall" , new NoneCondition());
		Item homeRunBallDis = new Snack( 3, 10 , 1000 , "homeRunBallDis" , new CardCondition("lotteCard" , lotteCard , 10));

		market.addItem(merona);
		market.addItem(meronaDis);
		market.addItem(homeRunBall);
		market.addItem(homeRunBallDis);
		market.searchList();;


		market.purchase(new Order(1 , 3 , samsungCard));


		market.searchList();;
	}

}
