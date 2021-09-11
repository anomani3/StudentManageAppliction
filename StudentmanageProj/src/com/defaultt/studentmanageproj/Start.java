package com.defaultt.studentmanageproj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.studentmanageproj.Student;
import com.studentmanageproj.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {

		System.out.println("This is student manage app");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.println("Press 1 to enter/Add data ");
			System.out.println("Press 2 to Delete data");
			System.out.println("Pess 3 to Display data");
			System.out.println("Press 4 to Update data");
			System.out.println("Press 5 to Exit from app");
			int c=Integer.parseInt(br.readLine());
			
			if(c==1)
			{
				
				//Add data code
				
				System.out.println("Enter student Name:");
				String name=br.readLine();
				System.out.println("Enter student phone number:");
				String phone=br.readLine();
				System.out.println("enter student city");
				String city=br.readLine();
				
//				create student obje=ct to store student details
				Student st=new Student(name, phone, city);
				boolean answer=StudentDao.insertIntoDB(st);
				if(answer)
				{
					System.out.println("student Added successfully in the DbB");
				}
				else
				{
					System.out.println("something went wrong please check connection");
				}
				System.out.println(st);
						
			}
			else if(c==2)
			{
//				code for delete
				System.out.println("Enter student ID to delete data");
				int userid=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userid);
				{
					if(f)
					{
						System.out.println("Student deleted successfully...... ");
					}
					else
					{
						System.out.println("something went wrong user id incorrect......");
					}
					
					
				}
				}
			else if(c==3)
			{
//				Display code data
				
				StudentDao.showAllStudents();
				
			}
			else if(c==4)
			{
//				update code for application
			}
			else if(c==5 || c==6 || c==7 || c==8 || c==9)
			{
//				Press 5 to exit application
				break;
			}
			else
			{
				
			}
			
		}
		System.out.println("Thanxx for using my application");
		System.out.println("Bye Bye See YOU tOMORROW.....?");
	}

}
