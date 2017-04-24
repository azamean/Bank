# Mobile Banking App
The following is my submission for my final OOP project.

# YouTube

[![Video](http://img.youtube.com/vi/emeUn_x1jjA/0.jpg)](https://youtu.be/emeUn_x1jjA)


## Description
* I created a mobile banking app, the app allows a user to create an account, login and manage their transactions.
* I used Android Studio, using Java and SQLite.

## Why I chose this
I use a mobile banking app myself, and have always been interested in how they worked, I also wanted to get some experience in mobile app development which proved to be a ratehr large task as I first had to learn how to build an Android app from scratch using online resources and books. 

# Features

* First Menu: 2 options
	* Create User: This page allows a user to register an account with their name, address, account number, current balance and a secure PIN.
	* Login: This page allows the user to login

* Main Menu: contains 4 options
  * Account Information: Allows the user to view their account information
  * Add Transaction: allows the user to add new transactions.
  * View Transaction: Allows the user to view all transactions.
  * Logout: allows user to logout.

# Functionality

* Creating account
	* When a user creates an account, it sends an SQLite query to the database, entering their data into it.

* Logging in
	* To login the user is prompted for their PIN, if an incorrect PIn is entered amn alert will display. NOTE: This app allows for multiple users to hold accounts, and such you must remember the correct PIN for the user who wants to login.

* Persisting users data
	* I tried many techniques for persisting the users data, at first I tried passing it through intents, but this proved to be a bit complex as the user may back out of an intent at any time. 
	* I decided to save the users data in a static class called DataHolder. Whe na successful login attempt is made, the users data is read from teh database into the DataHolder class, where it will remain persistant throughout the entire app, until the user logs out.

* Keeping a running total (Current Balance)
	* When a user wishes to add a new transaction, they enter a description and an amount, once the user saves this transaction the amount is immediately debitted from their account. This can be shown reflected in the users account information page.
	
* Logging out
	* When the user is finished they can click logout to be returned to the first menu page, where another user may login.

# What I learned 

* How to create Android Apps using Android Studio.
* How to work solo on a larger project.
* How to use persistant data in an app.
* I learned a lot on how databases function within an Android app, and how to interact with them.
* How to keep a running total in a database with File I/O.
* I learned how to display an entire table, to do this I read the table into an ArrayList, then converted it to a String using StringBuilder, where I could then add the text into a TextView.
* How to fix commits that have gone wrong, I had to revert a few times, almost broke my appo (and my heart)
* I learned a lot on interfaces and design, and how to create an appealing looking app.

# Contributors
* Marcus O'Byrne : C15519493
	* Entire project.
