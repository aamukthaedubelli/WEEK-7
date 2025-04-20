abstract class Animal {
    abstract  void sound();
 }
  class Lion extends Animal{
    void sound(){
         System.out.println("is Growling");
     }
 }
 class Tiger extends Animal{
     void sound(){
         System.out.println("is roaring");
     }
 }
 class Program1 {
     public static void main(String[] args) {
         Animal a=new Lion();
         a.sound();
         Animal  b=new Tiger();
         b.sound();
     }
 
 }