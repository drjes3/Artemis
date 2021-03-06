/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 10:53:19 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.GCGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GCGraph_ESTest extends GCGraph_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GCGraph gCGraph0 = null;
      try {
        gCGraph0 = new GCGraph((DNADraw) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.Graph", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw();
      GCGraph gCGraph0 = new GCGraph(dNADraw0);
      // Undeclared exception!
      try { 
        gCGraph0.calculateValue(10000000, 227);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GCGraph", e);
      }
  }
}
