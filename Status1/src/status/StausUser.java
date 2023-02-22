/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
	public class StausUser extends Status{
    	enum inputs {zero, one, two, three};
	
	   public void statusDetail(inputs i){
		   switch(i)
		        {
		        case zero: 
		        	System.out.println("REJECTED");
		        	break;
		        case one: 
		        	System.out.println("PENDING");
		        	break;
		        case two:
		        	System.out.println("PROCESSING");
		        	break;
		        case three: 
		            System.out.println("APPROVED");
		            break;
		        default:
		        	System.out.println("NOT VALID CODE");
		        	break;
		        }
	   		}
	 
	}
