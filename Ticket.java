package Assign_2;

import BasicIO.*;
import static BasicIO.Formats.*;

public class Ticket {
  
  private int ticketNum;
  private int priority;
  private String status;
  private String user;
  private String issue;
  private String tech;
  private String resolve;
  
  public Ticket ( int tN, int p, String s, String u, String i) {
    
    ticketNum = tN;
    priority = p;
    status = s;
    user = u; 
    issue = i;
    tech = " ";
    resolve = " ";
    
  };
  
  
  public int getTicketNum ( ) {
    return ticketNum; 
  };
  
  
  public int getPriority ( ) {
    return priority;
  };
  
  
  public String getStatus ( ) {
    return status;
  };
  
  
  public String getUser ( ) {
    return user;
  };
  
  
  public String getIssue ( ) {
    return issue;
  };
  
  
  public String getTech ( ) {
    return tech;
  };
  
  
  public String getResolve ( ) {
    return resolve;
  };
  
  
  public void setTech ( String string ) {
    tech = string;
  };
  
  
  public void setResolve ( String string ) {
    resolve = string;
  };
  
  
  public void setStatus ( String string ) {
    status = string;
  };
  
}
