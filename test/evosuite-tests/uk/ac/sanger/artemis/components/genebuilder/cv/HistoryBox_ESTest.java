/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:22:49 GMT 2018
 */

package uk.ac.sanger.artemis.components.genebuilder.cv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Dimension;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.genebuilder.cv.HistoryBox;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HistoryBox_ESTest extends HistoryBox_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringVector stringVector0 = new StringVector("curatorName=");
      boolean boolean0 = HistoryBox.contains(stringVector0, "curatorName=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringVector stringVector0 = new StringVector("Oy;WY#");
      boolean boolean0 = HistoryBox.contains(stringVector0, "term=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getCvTerms();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getCvTermStrings();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.contains((StringVector) null, "curatorName=");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.genebuilder.cv.HistoryBox", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringVector stringVector0 = new StringVector();
      stringVector0.add("qualifier=");
      boolean boolean0 = HistoryBox.contains(stringVector0, "JA6UzQn(s=ASH");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringVector stringVector0 = new StringVector("ucI+N..V;");
      boolean boolean0 = HistoryBox.contains(stringVector0, "date=");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try { 
        HistoryBox.getDefaultTerm();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Qualifier qualifier0 = new Qualifier("date=");
      Dimension dimension0 = new Dimension(24, 0);
      HistoryBox historyBox0 = null;
      try {
        historyBox0 = new HistoryBox(qualifier0, ";I9=8<vY~\"Lxa5we", 5, dimension0, dimension0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.util.DatabaseDocument", e);
      }
  }
}
