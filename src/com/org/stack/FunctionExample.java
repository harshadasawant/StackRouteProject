package com.org.stack;

//access_specifier return_type function_name([argument_list]){
// function body
//}
//access_specifier-> private, protected , default, public
//return_type-> data type
//function_name-> can be anything
//argument_list-> variable


import java.util.function.Function;

public class FunctionExample {
    int a,b;
    public void show() {
        System.out.println("Hello from function");
    }
    public void show(int a) {
        System.out.println("Hello from function"+a );
    }
    public void show(int a, float b) {
        System.out.println("Hello from function"+a+" "+b );
    }

    public int add(int a,int b){
        int c = a+b;
        return c;
    }

    public float add(float a,float b){
        float c = a+b;
        return c;
    }


    public static void main(String[] args) {
        FunctionExample obj = new FunctionExample();
        obj.show();
        obj.show(5);
        obj.show(5, 6.7f);

        System.out.println(obj.add(7,8));
        float f = obj.add(5.5f,5.2f);
        System.out.println(f);

    }
}


