import java.util.Scanner;
import java.util.Arrays;
	 
	public class Main {
	    static Scanner scanner = new Scanner(System.in);
	 
	    public static void main(String[] args) {
	        System.out.println("Введите пример:");
	         if(!scanner.hasNextInt()){
	             int num1 = calcStr();
	             char operation = getOperation();
	             int num2 = calcStr();
	             if (num1 <=10 && num2 <=10 && num1 >=1 && num2 >=1) {
	                 int result = calc(num1,num2,operation);
	                 int resultRom = test(result);
	             }
	             else if (!scanner.hasNextInt(num1) && !scanner.hasNextInt(num2)) {
	                 System. exit(0);
	                 System.out.println("Вы допустили ошибку при вводе чисел.Допускаются только римские и арабские, в диапозоне от 1 до 10");
	                 System. exit(0);
	             }
	             else {
	                 System.out.println("Допускаются только в диапозоне от 1 до 10");
	                 System. exit(0);
	             }
	        }
	         else if(scanner.hasNextInt()){
	             int numInt = getInt();
	             char operationInt = getOperation();
	             int numInt_2 = getInt();
	             if (numInt <=10 && numInt_2 <=10 && numInt >=1 && numInt_2 >=1) {
	                 int resultInt = calc(numInt,numInt_2,operationInt);
	                 System.out.println("Результат операции: "+ resultInt);
	             }
	             else {
	                 System.out.println("Допускаются только в диапозоне от 1 до 10");
	                 System. exit(0);
	             }
	             
	        }
	        else {
	            System.out.println("Вы допустили ошибку при вводе чисел.Допускаются только римские и арабские, в диапозоне от 1 до 10");
	            System. exit(0);
	        }
	        
	    }
	    
	    
	    public static int test(int ar) {
	       int i;
	       for ( i = 1;i<256;i++) {
	           if (i == ar){
	               RomNum rn = new RomNum();
	               rn.RomanNumerals(i);
	               System.out.println("Результат операции: "+rn.RomanNumerals(i));
	           }
	       
	       }
	       return i; 
	   }
	   
	    public static int num;
	    public static int getInt(){
	        if(scanner.hasNextInt()){
	            num = scanner.nextInt(); 
	        } 
	        else {
	            System.out.println("Вы допустили ошибку при вводе чисел.");
	            System. exit(0);
	        }
	        return num;
	    }
	 
	
	    public static char getOperation(){
	        char operation;
	        if(scanner.hasNext()){
	            operation = scanner.next().charAt(0);
	        } else {
	            System.out.println("Вы допустили ошибку при вводе операции.");
	            scanner.next();
	            operation = getOperation();
	        }
	        return operation;
	    }
	    
	    
	    public static String num2;
	    public static String num1; 
	      public static int calcStr(){
	          num1 = scanner.next();
	          String[] strings = {"I", "II", "III", "IV", "V", "VI",  "VII",  "VIII", "IX", "X"}; 
	            for (int i=0; i < strings.length; i++) {
	                  if (num1.intern() == strings[i]) {   
	                  strings[0] = "1";
	                  strings[1] = "2";
	                  strings[2] = "3";
	                  strings[3] = "4";
	                  strings[4] = "5";
	                  strings[5] = "6";
	                  strings[6] = "7";
	                  strings[7] = "8";
	                  strings[8] = "9";
	                  strings[9] = "10";
	                  try { 
	                  Integer i1 = new Integer(strings[i]);
	                if (i1 <= 10) {
	                     return i1;
	                } 
	                else {
	                System.out.println("Допускаются числа в диапазоне от 1 до 10");
	                System. exit(0);
	                }
	                 
	                  }catch (NumberFormatException e) {  
	                    System.err.println("Неверный формат строки!" +  e);  
	                    System. exit(0);
	                } 
	            
	                } 
	            }
	        int result = 0;
	        return result;
	    }
	 
	    public static int calc(int num1, int num2, char operation){
	        int result;
	        switch (operation){
	            case '+':
	                result = num1+num2;
	                break;
	            case '-':
	                result = num1-num2;
	                break;
	            case '*':
	                result = num1*num2;
	                break;
	            case '/':
	                result = num1/num2;
	                break;
	            default:
	                result = calc(num1, num2, getOperation());
	                System.out.println("Операция не распознана");
	                System. exit(0);
	        }
	        return result;
	    }
	}
	
