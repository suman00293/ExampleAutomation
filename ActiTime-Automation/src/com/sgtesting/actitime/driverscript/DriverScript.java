package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.HomePage;
import com.sgtesting.actitime.tests.Initialization;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {

	public static void main(String[] args) {
	/*	//LaunchBrowser-->navigate-->login-->createUser-->deleteUser-->logout -->closeApplication
		//Create User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//LaunchBrowser-->navigate-->login-->createUser-->modifyUser-->deleteUser-->logout -->closeApplication
		//Modify User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Users.modifyUser();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->deleteCustomer-->logout -->closeApplication
		//Create Customer Scenarios
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Customers.tasklog();
		Customers.createCustomer();
		Customers.deleteCustomer();
		LoginLogout.logout();
		Initialization.closeApplication();
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->modifyCustomer-->deleteCustomer-->logout -->closeApplication
				//Create Customer Scenarios
				Initialization.launchBrowser();
				Initialization.navigate();
				LoginLogout.login();
				HomePage.minimizeFlyOutWindow();
				Customers.tasklog();
				Customers.createCustomer();
				Customers.modifyCustomer();
				Customers.deleteCustomer();
				LoginLogout.logout();
				Initialization.closeApplication();*/
		
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		//Create project scenarios		
		Initialization.launchBrowser();
				Initialization.navigate();
				LoginLogout.login();
				HomePage.minimizeFlyOutWindow();
				Customers.tasklog();
				//Customers.createCustomer();
				Projects.createProject();
				Projects.deleteProject();
				//Customers.modifyCustomer();
				//Customers.deleteCustomer();
				LoginLogout.logout();
				Initialization.closeApplication();
				
		//LaunchBrowser-->navigate-->login-->createCustomer-->CreateProject-->modifyProject-->DeleteProject-->deleteCustomer-->logout -->closeApplication
		
				Initialization.launchBrowser();
				Initialization.navigate();
				LoginLogout.login();
				HomePage.minimizeFlyOutWindow();
				Customers.tasklog();
				Customers.createCustomer();
				Projects.createProject();
				Projects.modifyProject();
				Projects.deleteProject();
				Customers.modifyCustomer();
				Customers.deleteCustomer();
				LoginLogout.logout();
				Initialization.closeApplication();
		/*//LaunchBrowser-->navigate-->login-->createUser-->createTask-->deleteTask-->deleteUser-->logout -->closeApplication
		//Modify User Scenario
		Initialization.launchBrowser();
		Initialization.navigate();
		LoginLogout.login();
		HomePage.minimizeFlyOutWindow();
		Users.createUser();
		Tasks.createTasks();
		Tasks.deleteTasks();
		Users.deleteUser();
		LoginLogout.logout();
		Initialization.closeApplication();*/

	}

}
