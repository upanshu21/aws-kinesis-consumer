package com.aws.kinesis.poc;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KinesisPocApplication implements ApplicationRunner {

	private final KinesisConfiguration kinesisConfiguration;

	public KinesisPocApplication(KinesisConfiguration kinesisConfiguration) {
		this.kinesisConfiguration = kinesisConfiguration;
	}

	public static void main(String[] args) {
		SpringApplication.run(KinesisPocApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		kinesisConfiguration.run();
	}
}
