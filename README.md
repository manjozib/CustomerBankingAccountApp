Scenario: You are a back-end developer and need to create an application to handle new customer bank account requests
There is a csv file with names, social security number, account type and initial deposit

The application do the following

1)Read a .csv file names, ssNumber, account type and initial deposit

2)I have used linked list as a data structure to build all these accounts

3)They are 2 types of accounts, i.e, Checkings and Savings

4)Both accounts share the following methods deposit(), withdraw(), transfer() and showInfo()

5)I have generated account number which is 11 digit, with the following process :
	first didgit which is either 1 or 2 depending with the type of account, 1 for savings and 2 for Checkings
	followed by 2 last digits of social security number 
	followed by a unique 5-digit number
	and a random 3 digit number

6)Savings account holders are given a safety deposit box, identified by a 3 digit # and accessed with a 4 digit code

7)Checking accounts holders are assigned a Debit card with a 12 digit # and a 4 digit PIN

8)Both accounts will use an interface that determines the base interest rate
	*Savings account will use .25 points less than the base rate
	*Checking accounts will use 15% of the base rate

9)ShowInfo() should reveal relevant account information as well as information specific  to the checking accounts or savings accounts
