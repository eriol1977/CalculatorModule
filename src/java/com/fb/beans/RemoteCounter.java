/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fb.beans;

/**
 *
 * @author Francesco
 */
public interface RemoteCounter
{
    void increment();
    
    void decrement();
    
    int getCount();
}
