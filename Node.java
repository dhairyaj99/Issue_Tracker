package Assign_2;

class Node {
  
  
  Ticket   item;   // the Car
  Node     next;  // next node
  
  
  Node ( Ticket t, Node n ) {
    
    item = t;
    next = n;
    
  };  // constructor
  
  
}  //Node