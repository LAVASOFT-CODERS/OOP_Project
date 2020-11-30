/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 *
 * @author vidur
 */
public class jobs {
    public String job;
      int vehicle;
        int emp;
   
    
    
    
    public jobs(String selectjob, int selectvehicle, int selectemp ){
        this.job = selectjob;
        this.vehicle = selectvehicle;
        this.emp = selectemp;
        
       }
    
    public String getjob(){
        return job;
    }
    
    public void setjob(String selectjob ){
        this.job = selectjob;
    }
    
    public int getvehicle(){
        return vehicle;
    }
    
    public void setvehicle(int selectvehicle){
        this.vehicle = selectvehicle;
    }
    
    public int getemp(){
        return emp;
    }
    
    public void setemp(int selectemp){
        this.emp = emp;
    }
    
}
  