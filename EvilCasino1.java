package evilcasino1;

import java.io.*;
import java.util.Scanner;


public class EvilCasino1 {


    public static void main(String[] args) throws IOException {
               
        String str1 = "\u263A"; //☺
        String str2 = "\u2764"; //❤
        String str3 = "\u0037"; //7
        String str4 = "\u0033"; //3
        String str5 = "\u2639"; //☹
        String str6 = "\u2666"; //♦
        String str7 = "\u2743"; // ex ❃
        String str8 = "\u00A9"; //copyright ©
        String str9 = "\u2713"; //check ✓
        String str10 = "\u0024"; // dollar $
        
        String name; 
  
        double casinoAccount = 0.00;
        String a;
        double money = 0.00;
        String b;
        double bet = 0.00;
        double bet1 = 0.00;
        double bet2 = 0.00;
        double probability =  Math.random();
        double firstBetProbability = Math.random();
        double secondBetProbability = Math.random();
        
       
        String secondBet;
        String thirdBet;
        String repeat ;
        
        String symbol1;
        String symbol2;
        String symbol3;
        
 
 do{  
         
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Lucky Casino!\n"   +
                           "What's your name?");
        name = keyboard.nextLine();
        System.out.println(  "Hi " + name + ",\n" +
                           "In order to protect you from losing too much money, the maximum of the money you can put in is $100,000\n"+ 
                           "How much would you like to put in?\n" 
                           );
        a = keyboard.nextLine();
        money = Double.parseDouble(a);

        while(!(money>0 && money <= 100000)){
            System.out.println(" The money you put in has to greater than zero and smaller than $100,000");
            a = keyboard.nextLine();
            money = Double.parseDouble(a);
            }
        if(money>0 && money <= 100000){
              try{
                File file = new File("BankBook");
                PrintWriter out = new PrintWriter (file);
                out.print(casinoAccount += 100000);
                out.println("The money you put in is $" + money);
                out.close();
                
                Scanner fileIn = new Scanner(new File("E:\\1 2019 fall\\CSC 110\\11.2.2019\\EvilCasino1\\BankBook"));
                while(fileIn.hasNext()){
                    System.out.println(fileIn.nextLine());
                }
                }catch(IOException e){
                    System.out.println("Oh no! Something went wrong.");
                }finally{

                        System.out.println("Here are the rules of Lucky Casino.\n"+
                           "There are 3 boxes on the face of Luck Casino that can land on any of 10 symbols. If you get 3 identical symbols you win a jackpot, otherwise, you lose the money you bet for that round.\n " +
                           "Three 3's are worth triple the amount of money you put down. Any other 3 of a kind (❤,❤,❤) or (☺,☺,☺) for instance is worth double of the amount of money you put down for that round.\n "+                             
                           "Get ready and give it a try!\n" +
                           "Please put down your bet.\n"); 
                        b = keyboard.nextLine();
                        bet = Double.parseDouble(b); 
           
                       while(!(bet<=money && bet>=0)){
                           System.out.println("Your bet has to be greater than zero and smaller than the amount of money you put in the Casino.");
                           b = keyboard.nextLine();
                           bet = Double.parseDouble(b);
                            }
                      if(bet<=money && bet>0){
                          System.out.println("Your bet is $" + bet);
                          if(probability<=0.1){
                            symbol1 = str1;
                         }else if(probability>0.1 && probability<=0.2){
                            symbol1 = str2;
                         }else if (probability>0.2 && probability<=0.3){
                             symbol1 = str3;
                         }else if(probability>0.3 && probability<=0.4){
                            symbol1 = str4;
                         }else if (probability>0.4 && probability<=0.5){
                             symbol1 = str5;
                         }else if(probability>0.5 && probability<=0.6){
                            symbol1 = str6;
                         }else if (probability>0.6 && probability<=0.7){
                             symbol1 = str7;   
                         }else if (probability>0.7 && probability<=0.8){
                             symbol1 = str8;
                         }else if(probability>0.8 && probability<=0.9){
                            symbol1 = str9;
                         }else  {
                             symbol1 = str10;  
                           }     
                      
              System.out.println("You first symbol \n"+"====== \n" + symbol1 + "\n======");                               
              System.out.println("Would you like to double or triple your bet?\n"+
                                    "If you choose to double your bet, you can win twice as much money as you would have with their original bet,if a jackpot comes up.\n"+
                                    "If you triple your bet, you can win three times as much money as you would have with your original bet.\n" +
                                    "If the jackpot does not come up, You will lose twice or three times as much money as you otherwise would have. \n"+
                                    "If you want to double your bet, please type in 2.\n"+
                                    "If you want to triple your bet, please type in 3");
    
              secondBet = keyboard.nextLine();
              
            
              
                        while(!(secondBet.equals("2")  || secondBet.equals("3"))){
                         System.out.println("If you want to double your bet, please type in 2.\n"+
                                            "If you want to triple your bet, please type in 3.");
                         secondBet = keyboard.nextLine();
                          }
                        
                        if(secondBet.equals("2")){
                            bet1 = bet*2;
                        if(bet1>=money){
                            System.out.println("Sorry! You can not double your bet. You don't have enough money in your account.");   
                            bet1 = bet;
                            System.out.println("Your bet right now is $" + bet1 );
                          }    
                            
                        if( bet1<money){
                            System.out.println("Your bet right now is $" + bet1 );
                        }   
                        }
                        if(secondBet.equals( "3")){
                           bet1 = bet*3;
                        if(bet1>=money){
                            System.out.println("Sorry! You can not double your bet. You don't have enough money in your account.");   
                            bet1 = bet;
                            System.out.println("Your bet right now is $" + bet1 );
                          }
                           if( bet1<money){
                               System.out.println("Your bet right now is $" + bet1 +
                                               "\n"
                                               );
                         }
                         } 
                        if(firstBetProbability<=0.1){
                            symbol2 = str1;
                         } else if(firstBetProbability>0.1 && firstBetProbability<=0.2) {
                            symbol2 = str2;
                         } else if (firstBetProbability>0.2 && firstBetProbability<=0.3){
                             symbol2 = str3;
                         } else if(firstBetProbability>0.3 && firstBetProbability<=0.4){
                            symbol2 = str4;
                         }else if (firstBetProbability>0.4 && firstBetProbability<=0.5){
                             symbol2 = str5;
                         } else if(firstBetProbability>0.5 && firstBetProbability<=0.6){
                            symbol2 = str6;
                         } else if (firstBetProbability>0.6 && firstBetProbability<=0.7){
                             symbol2 = str7;   
                         }else if (firstBetProbability>0.7 && firstBetProbability<=0.8) {
                             symbol2 = str8;
                         } else if(firstBetProbability>0.8 && firstBetProbability<=0.9){
                            symbol2 = str9;
                         } else{
                             symbol2 = str10;  
                         }
                 System.out.println( "Your two symbols\n" + "======\n" + symbol1 + symbol2 + "\n======");
            
                 System.out.println("Would you like to double or triple your bet?\n"+
                                    "If you choose to double your bet, you can win twice as much money as you would have with their original bet,if a jackpot comes up.\n"+
                                    "If you triple your bet, you can win three times as much money as you would have with your original bet.\n" +
                                    "If the jackpot does not come up, You will lose twice or three times as much money as you otherwise would have. \n"+
                                    "If you want to double your bet, please type in 2.\n"+
                                    "If you want to triple your bet, please type in 3");
                 
                 thirdBet = keyboard.nextLine();
                 while(!(thirdBet.equals("2") || thirdBet.equals("3"))){
                 System.out.println("If you want to double your bet, please type in d.\n"+
                                    "If you want to triple your bet, please type in t");
                 thirdBet = keyboard.nextLine();
                       }
                 if(thirdBet.equals( "2")){
                        bet2 = bet1*2;
                        if(bet2>=money){
                            System.out.println("Sorry! You can not double your bet. You don't have enough money in your account.");   
                            bet2 = bet1;
                            System.out.println("Your bet right now is $" + bet2 );
                          }
                       if( bet2 < money ){
                            System.out.println("Your bet right now is $" + bet2 );
                       }
                       }
                 if(thirdBet.equals("3")){
                        bet2 = bet1*3;
                        if(bet2>=money){
                            System.out.println("Sorry! You can not double your bet. You don't have enough money in your account.");   
                            bet2 = bet1;
                            System.out.println("Your bet right now is $" + bet2  );
                          }
                       if(bet2<money){
                            System.out.println("Your bet right now is $" + bet2  );
                       }
                       }
                 if(secondBetProbability<=0.1){
                            symbol3 = str1;
                         }else if(secondBetProbability>0.1 && secondBetProbability<=0.2){
                            symbol3 = str2;
                         }else if (secondBetProbability>0.2 && secondBetProbability<=0.3){
                             symbol3 = str3;
                          }else if(secondBetProbability>0.3 && secondBetProbability<=0.4){
                            symbol3 = str4;
                         }else if (secondBetProbability>0.4 && secondBetProbability<=0.5){
                             symbol3 = str5;
                           }else if(secondBetProbability>0.5 && secondBetProbability<=0.6){
                            symbol3 = str6;
                         }else if (secondBetProbability>0.6 && secondBetProbability<=0.7){
                             symbol3 = str7;   
                         }else if (secondBetProbability>0.7 && secondBetProbability<=0.8){
                             symbol3 = str8;
                           }else if(secondBetProbability>0.8 && secondBetProbability<=0.9){
                            symbol3 = str9;
                         }else{
                             symbol3 = str10;  
                         }
                        System.out.println( "Your three symbols \n"+
                                            "======\n" +
                                    symbol1 + symbol2 + symbol3 +
                                            "\n======");   
                     File file = new File("BankBook");   
                     PrintWriter out = new PrintWriter (file);
                     if(symbol1.equals(symbol2)  && symbol2.equals(symbol3) ){ 
                         System.out.println("Congragulations!! You win!!  ");
                         casinoAccount  -= bet2;
                         
                         out.write("Casino Account is $" + casinoAccount);
                         out.close();
                         

                     }else {
                         casinoAccount  += bet2;
                         out.write("Casino Account is $" + casinoAccount );
                         out.close();
 
                         System.out.println("Sorry! You lose." + 
                                             "Your account has $" + (money-bet2));                
                     }
}
}
} 
  if(casinoAccount<=0){
      System.out.print("NO!! Casino go bankcrupt!!");
      System.exit(0);
  }

  System.out.print("Do you want to play it again?"+
                   "Press 1 for yes, 0 for no.");
  
  repeat = keyboard.nextLine();
            
}while(repeat.equals( "1"));
 
}
}  
