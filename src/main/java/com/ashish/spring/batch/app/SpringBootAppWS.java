package com.ashish.spring.batch.app;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBootAppWS {

	@Autowired
    JobLauncher jobLauncher;

	@Autowired
    Job processJob;

	@RequestMapping(path = "/startJob", method = RequestMethod.GET, headers = "Accept=application/json", produces = "application/json")
	public String startJob() throws Exception {

		JobParameters jobParameters = new JobParametersBuilder().addLong(
				"time", System.currentTimeMillis()).toJobParameters();
		jobLauncher.run(processJob, jobParameters);

		return "Batch job has been invoked";
	}

}
