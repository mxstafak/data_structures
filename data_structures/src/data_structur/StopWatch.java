/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structur;

/**
 *
 * @author ziade
 */
public class StopWatch {
    private double endtime ; 
   private double starttime ; 
   public void setstartime (double starttime ){
   this.starttime=starttime ; 
  
   }
   public void setendtime(double endtime ){
   this.endtime=endtime ; 
   }
 public double getstarttime(){
 return starttime ; 
 
 }
 public double getendtime(){
 return endtime ; 
 }
 public  double gettimeelapsed (double x,double y ){
     return (x-y) ;
 } 
}
