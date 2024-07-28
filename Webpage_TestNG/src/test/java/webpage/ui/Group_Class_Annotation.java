package webpage.ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Group_Class_Annotation {
	
	    @BeforeClass
		public void beforeClass()
		{
			System.out.println("Run this before class");
		} 
		
		
		@AfterClass
		public void afterClass() 
		{
		  System.out.println("Run this after class");
				
		}
		
		@BeforeGroups(value = "regression")
		public void beforeGroup()
		{
			System.out.println("Run this method before regression");
		} 
		
		@AfterGroups(value = "regression")
		public void afterGroups()
		{
			System.out.println("Run this method after regression");
		} 
		
		
		@Test (priority = 1, groups = "regression")
		public void aTest1()
		{
			System.out.println("Test1");
		} 
		
		
		@Test(priority = 2, groups ={"regression", "bvt"} )
		public void bTest2() 
		{
		  System.out.println("Test2");
				
		}
		
		
		@Test(priority = 3, groups = {"regression","bvt"})
		public void cTest3() 
		{
		  System.out.println("Test3");
				
		}
		
		@Test(priority = 4, groups = "bvt")
		public void dTest4() 
		{
		  System.out.println("Test4");
				
		}
		
		
		
		
	

}
