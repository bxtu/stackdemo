package stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        stack stack1=new stack(0);
        stack stack2=new stack(0);
        Scanner input=new Scanner(System.in);
        System.out.println("Kelimeyi giriniz");
        String kelime=input.nextLine();
        int i=1,j=0;
        while(i<kelime.length()){
               if(Character.isDigit(kelime.charAt(i-1))){
                    String newkelime= stack1.pop();
                    int m=0;
                    while(m<newkelime.length()){
                        if(Character.isDigit(newkelime.charAt(m))){
                            char a=kelime.charAt(i-1);
                            int number=Integer.parseInt(String.valueOf(a));
                            String newkelime2=newkelime.substring(0,m-1);
                            stack1.push(newkelime2,number);
                        }
                        m++;
                    }
                    j=i;
                }
                else if(kelime.charAt(i-1)=='('){
                    stack1.pushclose(String.valueOf(kelime.charAt(i-1)));
                    j=i;

                }else if (Character.isUpperCase(kelime.charAt(i)) || kelime.charAt(i)=='(' || Character.isDigit(kelime.charAt(i)) ) {
                   String newkelime=kelime.substring(j,i);
                   stack1.push(newkelime,1);
                   j=i;

               }
                 if(i==kelime.length()-1){

                    if (Character.isDigit(kelime.charAt(i))){
                        String newkelime= stack1.pop();
                        int m=0;
                        while(m<newkelime.length()){
                            if(Character.isDigit(newkelime.charAt(m))){
                                char a=kelime.charAt(i);
                                int number=Integer.parseInt(String.valueOf(a));
                                String newkelime2=newkelime.substring(0,m-1);
                                stack1.push(newkelime2,number);
                            }
                            m++;
                        }
                    }else {
                        String newkelime = kelime.substring(j, i + 1);
                        stack1.push(newkelime, 1);

                    }
                }
            i++;
            }
    }

    }
