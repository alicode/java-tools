/*
 * Programmer-tools -- A develop code for dever to quickly analyse Copyright (C) 2013-2016 madding.lip
 * <madding.lip@gmail.com>. This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */
package com.madding.shared.design.pattern.creational.prototype.A1;

import com.madding.shared.design.pattern.creational.prototype.A1.FactoryPrototype.Factory;

/**
 * Main.java desc：TODO
 * 
 * @author madding.lip May 6, 2014 10:48:12 AM
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(Factory.makeObject(args[i]) + "  ");
        }
    }
}
