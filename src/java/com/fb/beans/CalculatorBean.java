/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fb.beans;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.Remote;

/**
 *
 * @author Francesco
 */
@Stateless
@Remote(RemoteCalculator.class)
public class CalculatorBean implements RemoteCalculator
{

    @Override
    public int add(int a, int b)
    {
        return a + b;
    }

    @Override
    public int subtract(int a, int b)
    {
        return a - b;
    }

}
