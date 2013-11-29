/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author wjl
 */
public class HelloWorldAction extends ActionSupport{
    HelloWorld helloWorld;
    @Override
    public String execute()
    {
        helloWorld.execute();
        return "hello";
    }
    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

}
