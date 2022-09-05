public class Bank{
                  int accno;
                  String account_name;
                  long  balance;
                  double withdrawl;
void details(){
                  System.out.println("Account no:"+accno+"\n"+"Account Name:"+account_name+"\n"+"Balance="+balance+"\n"+"Withdrawl="+withdrawl);

}

public static void main(String[] args){
                                
                            Bank obj= new Bank();

                             obj.accno=128;
                             obj.account_name="Arun";
                             obj.balance=7579797;
                             obj.withdrawl=0.0;


                            obj.details();


}


}
