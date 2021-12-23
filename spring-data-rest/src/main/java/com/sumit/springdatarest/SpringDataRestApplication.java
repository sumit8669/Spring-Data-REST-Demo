package com.sumit.springdatarest;

import com.sumit.springdatarest.entity.User;
import com.sumit.springdatarest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
			User user1 = User.builder()
					.firstName("Sumit")
					.LastName("Rana")
					.email("sumit1234@Gmail.com")
					.build();
			userRepository.save(user1);

		User user2 = User.builder()
				.firstName("Sushree")
				.LastName("Deb")
				.email("deb1234@Gmail.com")
				.build();
		userRepository.save(user2);

		User user3 = User.builder()
				.firstName("Elon")
				.LastName("Musk")
				.email("musk@Gmail.com")
				.build();
		userRepository.save(user3);

		User user4 = User.builder()
				.firstName("Sandeep")
				.LastName("Maheshwari")
				.email("maheshwari@Gmail.com")
				.build();
		userRepository.save(user4);
	}
}
