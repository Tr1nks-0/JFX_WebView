package com.tr1nks.model.members;

import com.tr1nks.interfaces.HtmlWindowMember;
import com.tr1nks.interfaces.annotations.MemberMethod;

/**
 * Created by Tr1nks on 15.06.2017.
 */
public class MyTest implements HtmlWindowMember {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @MemberMethod
    public void showTime() {
        System.out.println("Show Time");
    }
}
