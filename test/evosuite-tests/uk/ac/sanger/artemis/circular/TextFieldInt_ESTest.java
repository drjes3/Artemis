/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 11:02:06 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.TextFieldInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TextFieldInt_ESTest extends TextFieldInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TextFieldInt textFieldInt0 = null;
      try {
        textFieldInt0 = new TextFieldInt();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.dnd.DropTarget", e);
      }
  }
}
