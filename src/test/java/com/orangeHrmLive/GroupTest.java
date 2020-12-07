package com.orangeHrmLive;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
	
  @BeforeGroups(groups="admin")
  public void beforeAdminGroup()
  {
	  System.out.println("*******executing admin group*******");
  }
  
  @BeforeGroups(groups="leave")
  public void beforeLeaveGroup()
  {
	  System.out.println("*******executing leave group*******");
  }
  
  
  @AfterGroups(groups="admin")
  public void afterAdminGroup()
  {
	  System.out.println("*******ending with admin group*******");
  }
  
  @AfterGroups(groups="leave")
  public void afterLeaveGroup()
  {
	  System.out.println("*******ending with leave group*******");
  }
  
  @Test(groups="admin")
  public void adminModule1() 
  {
	  System.out.println("admin test1");
  }
  
  
  @Test(groups="admin")
  public void adminModule2() 
  {
	  System.out.println("admin test2");
  }
 
  @Test(groups="leave")
  public void leaveModule1() 
  {
	  System.out.println("leave test1");
  }
  
  
  @Test(groups="leave")
  public void leaveModule2() 
  {
	  System.out.println("leave test2");
  }
  
}
