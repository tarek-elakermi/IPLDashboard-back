package tn.esprit.iplDahboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class IplDashboardApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(IplDashboardApplication.class, args);
		///its working for now


	}



	//	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);
//
//
//	private static void runJob(ApplicationContext applicationContext) {
//		String jobName = "readFromExcelJob";
//		JobLauncher jobLauncher = applicationContext.getBean(JobLauncher.class);
//		JobParameters jobParameters = new JobParametersBuilder().addDate("test", new Date()).toJobParameters();
//
//		ExitStatus exitCode = null;
//		try {
//			JobExecution run = jobLauncher.run(applicationContext.getBean(jobName, Job.class), jobParameters);
//			exitCode = run.getExitStatus();
//		} catch (JobExecutionAlreadyRunningException | JobRestartException
//				 | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
//			log.error("Job {} failed:\n{}", jobName, e);
//		}
//		log.info("Job {} run end, exitCode: {}", jobName, exitCode);
//		System.exit(1);
//	}



}
