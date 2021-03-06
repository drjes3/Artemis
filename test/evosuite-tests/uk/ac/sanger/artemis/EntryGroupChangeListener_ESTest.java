/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 14:04:43 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.ActionController;
import uk.ac.sanger.artemis.Entry;
import uk.ac.sanger.artemis.EntryGroupChangeEvent;
import uk.ac.sanger.artemis.SimpleEntryGroup;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EntryGroupChangeListener_ESTest extends EntryGroupChangeListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      SimpleEntryGroup simpleEntryGroup0 = new SimpleEntryGroup();
      EntryGroupChangeEvent entryGroupChangeEvent0 = new EntryGroupChangeEvent(simpleEntryGroup0, (Entry) null, 0);
      actionController0.entryGroupChanged(entryGroupChangeEvent0);
      assertEquals(4, EntryGroupChangeEvent.ENTRY_INACTIVE);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionController actionController0 = new ActionController();
      // Undeclared exception!
      try { 
        actionController0.entryGroupChanged((EntryGroupChangeEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.ActionController", e);
      }
  }
}
