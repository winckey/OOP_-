package com.oop.chater1_code;

import com.oop.chater3_code.Movie_App.money.Money;
import com.oop.chater3_code.Movie_App.step01.Customer;
import com.oop.chater3_code.Movie_App.step01.Movie;
import com.oop.chater3_code.Movie_App.step01.Screening;
import com.oop.chater3_code.Movie_App.step01.condition.PeriodCondition;
import com.oop.chater3_code.Movie_App.step01.pricing.PercentDiscountPolicy;
import org.junit.jupiter.api.Test;

import java.time.*;


class Chater1CodeApplicationTests {

	@Test
	void contextLoads() {

		Customer jang = new Customer("jang " , "test");

		Movie avarta = new Movie(
				"아바타" ,
				Duration.ofMinutes(120) ,
				Money.wons(10000),
				new PercentDiscountPolicy(0.1,
				new PeriodCondition(DayOfWeek.FRIDAY , LocalTime.of(10 , 0) , LocalTime.of(23 , 59)))
		);


		Movie avarta2 = new Movie(
				"아바타2" ,
				Duration.ofMinutes(120) ,
				Money.wons(20000),
				new PercentDiscountPolicy(0.9,
						new PeriodCondition(DayOfWeek.FRIDAY , LocalTime.of(10 , 0) , LocalTime.of(23 , 59)))
		);

		Movie avarta3 = new Movie(
				"아바타3" ,
				Duration.ofMinutes(120) ,
				Money.wons(11111),
				new PercentDiscountPolicy(0.5,
						new PeriodCondition(DayOfWeek.FRIDAY , LocalTime.of(10 , 0) , LocalTime.of(23 , 59)))
		);

		Screening screening = new Screening(avarta , 10 ,LocalDateTime.now() );

		System.out.println(screening.reserve(jang  , 1));
	}

}
