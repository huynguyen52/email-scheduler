package com.example.emailscheduler.quartz.job;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class EmailJob extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        JobDataMap jobDataMap = context.getMergedJobDataMap();

        String subject = jobDataMap.getString("subject");
        String email = jobDataMap.getString("email");
        String body = jobDataMap.getString("body");
        sendMail();
    }

    private void sendMail(String fromEmail, String toEmail, String subject, String body) {

    }
}
