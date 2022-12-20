Abstract Problem:
As we all know the busy lifestyle of this modern generation,there seems to be no end to the demands of our time, and looking for a job is just one more. So,how do you search for a job in this busy schedule?

There are various challenges which are present in the market:
Insufficient time for searching for a job.
You don’t have a proper connection in that specific field in which you are searching for a job.
Not having proper guidance about Where and When to start.
Not aware about the job openings,etc.

Build an online system which mainly focuses on the job hunters to get a best job based on the qualifications, city and skillset.

Architecture Diagram
![image](https://user-images.githubusercontent.com/39735380/208727935-d1d17000-7d10-46d9-8a37-f23c27c6b526.png)

Data Flow Diagram
![image](https://user-images.githubusercontent.com/39735380/208728020-4dbb7b1a-b0e2-41b8-a270-7feab72662dc.png)


API Documentation:

Authentication Service:
/signup
/login
/forgetPassword

Recruiter Service:
/getall
/get/{id}
/put/{id}
/delete/{id}

Job Seeker Service:
/appliedjobs/{jobseekerId}
/delete/{id}
/getAllJobSeeker
/getJobseeker/{id}
/update/{id}

Job Service:
/add
/get
/delete/{jobId}
/update/{jobId}

Job Search Service:
/findAllJobs
/location/{location}
/vacancy/{vacancy}
/company/{company}
/applyJob/{seekerId}/{jobId}

Mail Service:
/sendNotificationMail
/signup/mail

Chat Service:
/saveChat
/getMessagesbyJobId/{jobId}
/chatMessage/{jobId}

Feedback Service:
/feedback
