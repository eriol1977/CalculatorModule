/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fb.beans;

import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

/**
 *
 * @author Francesco
 */
@Stateful
@Remote(RemoteCounter.class)
public class CounterBean implements RemoteCounter
{
    private int count = 0;
    
    @Override
    public void increment()
    {
        count++;
    }

    @Override
    public void decrement()
    {
        count--;
    }

    @Override
    public int getCount()
    {
        return count;
    }
}
