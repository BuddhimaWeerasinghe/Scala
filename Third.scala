object Third extends App{
  def price(x:Int):Double={
    if(x>50){
      var cost:Double=(x*24.95*60/100)+3+((x-50)*0.75);
      cost;
    
    }
    else{
      var cost:Double=(x*24.95*60/100)+3;
      cost;
    }}
    println(price(60));
  

}
