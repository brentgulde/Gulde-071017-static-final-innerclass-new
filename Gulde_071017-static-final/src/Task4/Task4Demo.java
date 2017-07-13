/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task4;

/**
 *
 * @author User
 */
public class Task4Demo {
    public static void main(String[]args){
    OuterClass oc = new OuterClass();
    InnerClass ic =  new InnerClass();
    System.out.println(oc.data);
    System.out.println(ic.data2);    
   ic.method(oc);
    }
}
