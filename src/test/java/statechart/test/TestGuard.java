/*
 * UML statechart framework (http://github.com/klangfarbe/UML-Statechart-Framework-for-Java)
 *
 * Copyright (C) 2006-2013 Christian Mocek (christian.mocek@gmail.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301 USA
 */
package statechart.test;

import com.github.klangfarbe.statechart.Guard;
import com.github.klangfarbe.statechart.Metadata;
import com.github.klangfarbe.statechart.Parameter;

public class TestGuard implements Guard {
  TestGuard(int i) {
    this.i = i;
  }

  public boolean check(Metadata data, Parameter param) {
    TestParameter p = (TestParameter) param;
    if (p != null) {
      return p.guardvalue == i;
    }
    return false;
  };

  private int i;
}
