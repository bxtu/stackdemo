package stack;

public class stack {
    int topOfstack;
    String []stack;
    int stacksize;
    stack(int stacksize){
        this.stacksize=stacksize;
        this.stack=new String[stacksize];//creating array
        this.topOfstack=-1;//giving "-1" to top cuz while doing push method we have to start with stack[0]
    }
    void pushclose(String string ){
        if(topOfstack==stacksize-1){
            System.out.println("overflow");
            increaseStackCapacity();
        }
        System.out.println("Adding: "+string);
        this.stack[++topOfstack] = string;
    }
    void push(String string,int number ){
        if(topOfstack==stacksize-1){
            System.out.println("overflow");
            increaseStackCapacity();
        }
        System.out.println("Adding: "+string+": "+number);
        this.stack[++topOfstack] = string+":"+number;
    }
    String pop(){
        if(stacksize<1){
            System.out.println("stack is empty");
        }
        int i=0;
        String string=this.stack[topOfstack];
        topOfstack--;
        System.out.println("Popped entry: "+string);
        return string;
    }
    private void increaseStackCapacity(){
        String[] newStack = new String[this.stacksize+1];
        for(int i=0;i<stacksize;i++){
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.stacksize = this.stacksize+1;
    }
}
