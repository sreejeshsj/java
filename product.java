class product{

    int pcode;
    String pname;
    Double prize;
    
    void data(int x,String y,Double z){
    pcode=x;
    pname=y;
    prize=z;

}
 void display(){
    System.out.println("\n");
    System.out.print(pcode);
    System.out.println("\n");
    System.out.println(pname);
    System.out.println("\n");
    System.out.print(prize);
     System.out.println("\n");
 }
void lowest(Double x,Double y,Double z){
   if(x< y && x<z){
    System.out.print(x);
   }
   else if(y<x && y<z){
    System.out.print(y);
   }else if(z<x&&z<y){
    System.out.print(z);
   }
 }
 

  public static void main(String[] args){
   product b1=new product();
    product b2=new product();
     product b3=new product();
   b1.data(1,"sree",100.0);
   b2.data(2,"messi",200.0);
   b3.data(3,"cr7",300.0);
   b1.display();
   b2.display();
   b3.display();
  
  b1.lowest(b1.prize,b2.prize,b3.prize);
   
}
}
