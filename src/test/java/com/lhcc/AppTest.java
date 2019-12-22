package com.lhcc;

import com.lhcc.observer.ISubject;
import com.lhcc.observer.impl.UserObserver;
import com.lhcc.observer.impl.WeiChartSubject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1()
    {
        ISubject weiChartSubject = new WeiChartSubject();
        weiChartSubject.addObserver(new UserObserver("小军"));
        weiChartSubject.addObserver(new UserObserver("小红"));
        weiChartSubject.notifyObserver("成功操作!!!!");
    }
}
